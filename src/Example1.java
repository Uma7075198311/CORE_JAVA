
public class Example1 {
byte b1;
short s1;
int i1;
long l1;
float f1;
double d1;
boolean b2;
char c1;
public byte getb1() {
	return b1;
}
public void setb1(byte b) {
	b1=b;
}
public short gets1() {
	return s1;
}	
public void sets1(short s) {
	s1=s;
}
public int geti1() {
   return i1;
}
public void seti1(int i) {
	i1=i;
}
public long getl1() {
	return l1;
}
public void setl1(long l) {
	l1=l;
}
public float getf1() {
	return f1;
}
public void setf1(float f) {
	f1=f;
}
public double getd1() {
	return d1;
}
public void setd1(double d) {
	d1=d;
}
public boolean getb2() {
	return b2;
}
public void setb2(boolean b3) {
    b2=b3;
}
public char getc1() {
	return c1;
}
public void setc1(char c) {
	c1=c;
}
public static void main(String[] args) {
    Example1 obj=new Example1();
		byte b=20;
		obj.setb1(b);
	System.out.println(obj.getb1());
	System.out.println("..............");		
       short s=40;
       obj.sets1(s);
    System.out.println(obj.gets1());
    System.out.println("...............");
       obj.seti1(45);
    System.out.println(obj.geti1());
    System.out.println("...............");
        long l=4567;
        obj.setl1(l);
    System.out.println(obj.getl1());
    System.out.println(".................");
        float f=3000f;
        obj.setf1(f);
    System.out.println(obj.getf1());
    System.out.println("..................");
        double d=4567;
        obj.setd1(d);
    System.out.println(obj.getd1());
    System.out.println("..................");
          boolean b3=false;
          obj.setb2(b3);
    System.out.println(obj.getb2());
    System.out.println("..................");
         char c='a';
         obj.setc1(c);
    System.out.println(obj.getc1());
        
}

}
