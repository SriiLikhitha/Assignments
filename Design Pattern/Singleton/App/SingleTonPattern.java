package App;
import Model.SingleTon;

public class SingleTonPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTon obj=SingleTon.createobj();
		SingleTon obj1=SingleTon.createobj();
		obj.msg();
		obj1.msg();
		System.out.println(obj.hashCode()+" "+obj1.hashCode());
	}

}
