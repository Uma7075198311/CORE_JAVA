package conditional.Statements;

public class Example {
public boolean isEven(int num) {
if(num%2==0) {
	return true;
}
else {
    return false;
}
}
 public static void main(String[] args) {
	
	if(new Example().isEven(11)) {
		System.out.println("Is 10 even?"+new Example().isEven(11));
	}
	else {
		System.out.println("Is 11 odd?"+new Example().isEven(11));
	}
	}

}
