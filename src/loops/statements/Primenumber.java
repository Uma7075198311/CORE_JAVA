package loops.statements;

public class Primenumber {
public boolean isPrime(int num) {
   for(int i=2;i<num;i++) {
   if(num%i==0) {
	   return false;
   }   
   }
     return true;
}
	

	public static void main(String[] args) {
		Primenumber obj=new Primenumber();
		System.out.println(obj.isPrime(7)?"prime":"! prime");
		System.out.println(obj.isPrime(7));
		//for(int i=1;i<=10;i++) {
		//	if(obj.isPrime(i)) {
		//	System.out.println(i);	
		//	}
	//	}

	}

}
