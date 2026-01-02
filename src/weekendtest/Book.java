package weekendtest;

public class Book {
String title="java basics";
int pages=130;
public void displayBook() {
	System.out.println("Title:"+title);
	System.out.println("Pages:"+pages);
}

	public static void main(String[] args) {
		Book obj=new Book();
		obj.displayBook();

	}

}
