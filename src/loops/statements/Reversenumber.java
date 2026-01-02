package loops.statements;

public class Reversenumber{
public boolean getReverse(int num) {
	int rev=0;
	int temp=num;
	while(num!=0) {
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;	
		if(temp==num) {
			System.out.println("reverse");
		}else {
			System.out.println("! reverse");
		}

	}return true;
	
}

	public static void main(String[] args) {
		Reversenumber obj=new Reversenumber();
		
		System.out.println( obj.getReverse(1234));
		
	}

}
