package operators;

public class SumProductCheck {
	
public static boolean checkSumVsProduct(int a,int b) {
	a++;
	b++;
	int sum=a+b;
	int product=a*b;
	return sum>product;
}
	public static void main(String[] args) {
		
		System.out.println(checkSumVsProduct(20,10));
		 
      
	}

}
