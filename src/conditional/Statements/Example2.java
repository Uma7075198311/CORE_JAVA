package conditional.Statements;

public class Example2 {
public String checkNumber(int num) {
 if(num<0) {
	if(num>0) {
	return "Positive"; 
	 }
	 else 
		 return"Negative";
 }
    else {
	     return "zero";
 }
	
}
	public static void main(String[] args) {
		Example2 obj=new Example2();
		System.out.println(obj.checkNumber(-5));

	}

}
