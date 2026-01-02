package weekendtest;

public class Student {
	String Stdname=" Hello,<uma>!";
	public void greet() {
		System.out.println("StudentName:"+Stdname);
	}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.greet();

	}

}
