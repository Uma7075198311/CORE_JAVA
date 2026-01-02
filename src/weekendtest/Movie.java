package weekendtest;

public class Movie {
String title="BiggBoss";
long likes=10000;
public void like() {
	likes++;
}
public void displayLikes() {
	System.out.println("Title:"+title);
	System.out.println("Likes:"+likes);
}
	public static void main(String[] args) {
		Movie obj=new Movie();
		obj.like();
		obj.displayLikes();

	}

}
