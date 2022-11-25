class AccountService
{
    fun withDraw(amount:Int,account:accountApp)
    {
        if(amount<=account.balance) {
            account.balance = account.balance - amount
        }
        else
            println("Your account balance is Low")
    }
    fun deposit(amount: Int,account: accountApp)
    {
        account.balance = account.balance + amount
    }

    fun calculateRateOfIntrest(account: accountApp):Double
    {
        var intrestRate:Double
        if(account.accType=="savings")
        {
            intrestRate=account.balance*(0.06)
        }
        else
            intrestRate=account.balance*(0.1)
        return intrestRate
    }
    fun getBalance(account: accountApp)
    {
        var intrestRate=calculateRateOfIntrest(account)
        println("AccountNumber       AccountBalance      AccountType")
        println("${account.accNo}                ${account.balance}                ${account.accType}")
    }
}