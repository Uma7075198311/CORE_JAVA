package conditional.Statements;

public class UniversityAdmission {
public String evaluateAdmission(int marks,boolean sportsAchievement) {
	if(marks>=95) {
		return "Admitted with Scholarship"; 
	}else if(marks<95 && marks>=85) {
		return "Admitted without Scholarship";	
	}else if(marks<85 && marks>=70) {
		 return "Admit under Sports Quota"; 
	}else if(marks<70 && marks >=60) {
		return "Interview Required";
	}else {
		return "Admission Rejected";
	}
}
	public static void main(String[] args) {
		UniversityAdmission obj = new UniversityAdmission();
		System.out.println(obj.evaluateAdmission(90, true));
		System.out.println(obj.evaluateAdmission(90,true));
		System.out.println(obj.evaluateAdmission(10, true));
		System.out.println(obj.evaluateAdmission(65, true));

	}

}
