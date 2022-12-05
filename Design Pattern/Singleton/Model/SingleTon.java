package Model; 

public class SingleTon {
	private static SingleTon obj=null;
	private SingleTon() {}
    public static SingleTon createobj() {
		if(obj==null) {
			obj=new SingleTon();
		}
		return obj;
	}
    public void msg() {
    	System.out.println("this is singletoncls");
    }

}
