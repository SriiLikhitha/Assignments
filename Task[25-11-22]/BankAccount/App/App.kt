import java.util.Scanner
fun main()
{

    var accountService=AccountService()
    var sc=Scanner(System.`in`)
    println("Create an BankAccount:")
    println("AccountNo: ")
    var accNo=sc.nextInt()
    println("Choose AccountTye: ")
    println("1.savings  2.Current")
    var choosen=sc.nextInt()
    var accountType:String
    var bal:Int=0
    if(choosen==1)
    {
        accountType="savings"
    }
    else
        accountType="Current"

    var account1=accountApp(accNo = accNo,accType = accountType, balance =bal)
    println("Account Created Scuccessfully!!")
    println("=========Choose from Below==========")
    while (true)
    {
        println("1.WithDraw\n2.Deposit\n3.GetBalance\n")
        println("Enter ur choice:")
        var choice=sc.nextInt()
        when(choice)
        {
            1->{
                println("Enter amount withdraw:")
                var amount=sc.nextInt()
                accountService.withDraw(amount,account1)
            }
            2->{
                println("Enter amount to deposit:")
                var amount=sc.nextInt()
                accountService.deposit(amount,account1)
            }
            3->{
                accountService.getBalance(account1)
            }
            else-> {
                println("=========Transaction Completed==========")
                break
            }
        }
    }





}