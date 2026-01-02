package operators;

public class DifferenceCheck {
public boolean checkDifference(int x,int y, int z) {
	int result=x-y-z;
	++result;
	return result>0;
}


	public static void main(String[] args) {
		DifferenceCheck obj=new DifferenceCheck();
		System.out.println(obj.checkDifference(4, 6, 8));

	}

}
