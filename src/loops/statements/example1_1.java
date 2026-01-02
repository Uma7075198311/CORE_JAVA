package loops.statements;

public class example1_1 {

	public static void main(String[] args) {
		int num=1234;
		int rev=0;
	    int temp=num;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/=10; 
		}if(temp==rev) {	
		System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}

	}
}


