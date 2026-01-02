package loops.statements;

public class Neonnumber {
	public boolean getNeon(int num) {
	int sqr=num*num;
	int sum=0;
	while(sqr!=0) {
		int rem=sqr%10;
		sum=sum+rem;
		sqr=sqr/10;
		
		
	}
	return sum==num;
	}
	public static void main(String[] args) {
		Neonnumber obj=new Neonnumber();
		System.out.println( obj.getNeon(9)? "Neon Number":"! Neon Number");

	}

}
