package operators;

public class CountDemo {
 int count;
public void updateAndPrint() {
System.out.println("value of count:"+count++);
System.out.println("updated value:"+count);
System.out.println("value of count:"+ ++count);
System.out.println("updated value:"+count);
}
	public static void main(String[] args) {
		CountDemo obj=new CountDemo();
		obj.count=10;
		obj.updateAndPrint();

	}

}
