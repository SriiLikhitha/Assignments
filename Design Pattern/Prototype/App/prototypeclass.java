package App;
import java.util.Scanner;

import Model.modelclass;

public class prototypeclass {

	public static void main(String[] args) {
		 Scanner br=new Scanner(System.in);
	        System.out.print("Enter Employee Id: ");  
	        int eid=Integer.parseInt(br.nextLine());  
	        System.out.print("\n");  
	          
	        System.out.print("Enter Employee Name: ");  
	        String ename=br.nextLine();  
	        System.out.print("\n");  
	          
	        System.out.print("Enter Employee Designation: ");  
	        String edesignation=br.nextLine();  
	        System.out.print("\n");  
	       	          
	        System.out.print("Enter Employee Salary: ");  
	        double esalary= Double.parseDouble(br.nextLine());  
	        System.out.print("\n");  
	           
	        modelclass e1=new modelclass(eid,ename,edesignation,esalary);  
	          
	        e1.showRecord();  
	        e1.show();
	        System.out.println("\n");  
	        modelclass e2=(modelclass) e1.getClone();  
	        e2.showRecord();  
	} 
}
