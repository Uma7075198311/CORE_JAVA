package operators;

public class Example1 {
	int x=5;
	int y=3;
public void calculate() {
	System.out.println("Addition:"+(x+y));//8
	System.out.println("Subtraction:"+(x-y));//2
	System.out.println("Multiplication:"+(x*y));//15
	System.out.println("Division:"+(x/y));//1
	System.out.println("Modulo:"+(x%y));//2
	System.out.println("...........................");
	++x;
	y++;
	System.out.println("Addition:"+(x+y));//10
	System.out.println("Subtraction:"+(x-y));//2
	System.out.println("Multiplication:"+(x*y));//24
	System.out.println("Division:"+(x/y));//1
	System.out.println("Modulo:"+(x%y));//2
}
	public static void main(String[] args) {
	Example1 obj=new Example1();
	obj.calculate();

	}

}
