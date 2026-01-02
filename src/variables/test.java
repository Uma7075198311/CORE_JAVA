package variables;

public class test {
   static int x=5;
   static void change() {
	   x=x+5;
   }
	public static void main(String[] args) {
		change();
		System.out.println(x);

	}

}
