package weekendtest;

public class App {
String appName="facebook";
long usageCount=10000;
public void openApp() {
	usageCount++;
}
public void display() {
	System.out.println("AppName:"+appName);
	System.out.println("usageCount:"+usageCount);
}
public static void main(String[] args) {
		App obj=new App();
		obj.openApp();
	    obj.openApp();
        obj.display();
	}

}
