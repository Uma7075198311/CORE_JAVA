package conditional.Statements;

public class BonusCalculator {
public double calculateBonus(int experience,int rating,double salary) {
if(experience>5 && rating>9) {
	return salary*0.50;
	
}else if(experience>=3&&experience<=5 &&rating>=7 && rating<=9) {
    return salary*0.30;
}else if(experience>=1&&experience<3 &&rating>=5&& rating<7) {
	return salary*0.10;
}else {
	return 0.0;
}
}

	public static void main(String[] args) {
		BonusCalculator obj=new BonusCalculator();
		System.out.println(obj.calculateBonus(9, 10, 50000));
		System.out.println(obj.calculateBonus(4, 8, 50000));
		System.out.println(obj.calculateBonus(2, 5, 40000));
		System.out.println(obj.calculateBonus(2, 3, 45000));

	}

}
