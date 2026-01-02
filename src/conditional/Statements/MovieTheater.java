package conditional.Statements;

public class MovieTheater {
public double getTicketPrice (int age) {
	if(age<5) {
		return 0.0;
	}else if(age>=5 && age<=12) {
		return 5.0;
	}else if(age>=13 && age<=60) {
		return 10.0;
	}else if(age>60) {
		return 5.0;
	}else {
		return -1.0;
	}
}
	public static void main(String[] args) {
		MovieTheater obj=new MovieTheater();
		System.out.println(obj.getTicketPrice(0));
		System.out.println(obj.getTicketPrice(7));
		System.out.println(obj.getTicketPrice(30));
		System.out.println(obj.getTicketPrice(70));

	}

}
