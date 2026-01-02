package conditional.Statements;

public class InsurancePolicy {
public String calculatePremium(int age,int experience) {
	if(age>50 && experience>10) {
		return "Lowest Premium";
	}else if(age>=30 && age<=50 && experience>5&&experience<=10) {
		return "Moderate Premium";
	}else if(age>=18 && age<30 && experience<=5) {
		return "Highest Premium";
	}else {
		return "Not Eligible for Insurance";
	}
}
	public static void main(String[] args) {
		InsurancePolicy obj=new InsurancePolicy();
    System.out.println(obj.calculatePremium(60, 11));
    System.out.println(obj.calculatePremium(45, 6));
    System.out.println(obj.calculatePremium(45, 5));
    System.out.println(obj.calculatePremium(20, 4));
    System.out.println(obj.calculatePremium(0, 0));

	}

}
