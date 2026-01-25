package staticvariables;

public class Examp2 {
        int id;
	    String name;
	    static String schoolName = "ABC School";
Examp2(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }
public void display() {
	        System.out.println("Id:"+id);
	        System.out.println("Name:"+name);
	        System.out.println("SchoolName:"+schoolName);
	    }
	    public static void main(String[] args) {
	        Examp2 e1 = new Examp2(1, "Ravi");
	        Examp2 e2 = new Examp2(2, "Anu");
	        Examp2 e3 = new Examp2(3, "Kiran");
	        e1.display();
	        e2.display();
	        e3.display();
	    }
	}
