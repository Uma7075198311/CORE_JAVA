package weekendtest;

public class Employee {
String empname="uma";
int empage=25;
public void displayInfo() {
	System.out.println("EmployeeName:"+empname);
	System.out.println("Employeeage:"+empage);
}
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.displayInfo();
		

	}

}
