
public class Example2 {
    String name,city;
public String getname() {
	return name;
}
public void setname(String name) {
  System.out.println("Name:"+name);
}
public String getcity() {
	return city;
}
public void setcity(String city) {
	System.out.println("City:"+city);
}
	public static void main(String[] args) {
		Example2 obj=new Example2();
		obj.setname("uma");
		obj.getname();
        obj.setcity("Tirupati");
        obj.getcity();

	}

}
