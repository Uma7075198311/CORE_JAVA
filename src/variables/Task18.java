package variables;

public class Task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String firstName = "Kalal";
	        String lastName = "Swathika";
	        String fullName = firstName + " " + lastName;
	        int count = 0;
	        for (char c : fullName.toCharArray()) {
	            count++;
	        }
	        System.out.println("First Name: " + firstName);
	        System.out.println("Last Name: " + lastName);
	        System.out.println("Full Name: " + fullName);
	        System.out.println("Total Characters: " + count);
	}

}
