package conditional.Statements;

public class Example3 {
public boolean canVote(int age) {
	if(age>18) {
		return true;
	}
	else {
		return false;
	}
}
public static void main(String[] args) {
 Example3 obj=new Example3();
  System.out.println("Can vote (Age 20)?"+obj.canVote(20));
	}

}
