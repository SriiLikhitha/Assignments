package Model;

public class modelclass implements prototype{
	private int id;  
	   private String name, designation;  
	   private double salary;  
	  	      
	   public modelclass(){  
	            System.out.println("   Employee Record");  
	            System.out.println("===================================");  
	            System.out.println("Eid"+"\t"+"Ename"+"\t"+"Edesignation"+"\t"+"Esalary");  
	      
	}  
	  
	 public  modelclass(int id, String name, String designation, double salary) {  
	          
	        this();  
	        this.id = id;  
	        this.name = name;  
	        this.designation = designation;  
	        this.salary = salary;  
	    }  
	      
	  public void showRecord(){  
	          
	        System.out.println(id+"\t"+name+"\t"+designation+"\t"+salary);  
	   }  
	  public void show() {
		  System.out.println("hiii");
	  }
	  
	    @Override  
	    public prototype getClone() {  
	          
	        return new modelclass(id,name,designation,salary);  
	    }  
}
