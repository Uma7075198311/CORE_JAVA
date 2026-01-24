package conditional.Statements;

public class Example2 {
public String checkNumber(int num) {
 
	if(num>0) {
	return "Positive"; 
	 }
	 else {
		 if(num<0) {
		 return"Negative";
 }
    else {
	     return "zero";
 }
	 }
}
	public static void main(String[] args) {
		Example2 obj=new Example2();
		String result=obj.checkNumber(20);
	     System.out.println(result);
	     obj.checkNumber(0);
	     System.out.println(obj.checkNumber(0));
	     System.out.println(obj.checkNumber(-20));
	     System.out.println("Check 10:"+obj.checkNumber(10));

	}

}
