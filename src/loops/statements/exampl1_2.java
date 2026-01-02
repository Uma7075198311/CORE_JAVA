package loops.statements;

public class exampl1_2 {

	public static void main(String[] args) {
		int num=1234;
		int rev=0;
		int temp=num;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/=10;
		}
	//	System.out.println(rev);
		System.out.println(temp==rev? "palindrome":"! palindrome");
	}

}
