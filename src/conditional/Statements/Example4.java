package conditional.Statements;

public class Example4 {
public int findGreater(int num1, int num2) {
if(num1>num2) {
	return num1;
}
else {
	if(num1<num2) {
		return num2;
	}
	else {
		return num1=num2;
	}
}
}
	public static void main(String[] args) {
		Example4 obj=new Example4();
		System.out.println("Greater number (10,25):"+obj.findGreater(10,25));

	}

}
