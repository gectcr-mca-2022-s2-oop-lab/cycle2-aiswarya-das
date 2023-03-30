package cycle2;
import java.util.Scanner;

public class Employee {
	int eNo, eSalary;
	String eName;
	public Employee(int eNo,int eSalary,String eName) {
		this.eNo = eNo;
		this.eSalary = eSalary;
		this.eName = eName;
	}
	public String toString() {
		return "eNo: " + eNo + " eName: " + eName+" esalary: "+eSalary;

	}

	public static void main(String[] args) {
		int n,en,flag=0;
		Scanner s = new Scanner(System.in);
        System.out.println("Enter number of employees: ");
		n = s.nextInt();
		
		Employee emp[] = new Employee[n];
       for(int i=0;i<n;i++) {
    	   emp[i] = new Employee(s.nextInt(),s.nextInt(),s.next());
       }
       System.out.println("Enter eno to search: ");
       en = s.nextInt();
       for(int i=0;i<n;i++) {
    	   if(emp[i].eNo==en) {
    		   System.out.println(emp[i]);
    		   flag = 1;
    		   break;
    	   }
       }
       if(flag==0) {
    	   System.out.println("Eno not found!");
       }
       
	}

}

