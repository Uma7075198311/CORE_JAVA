package operators;

public class StudentsMarks {
	int m1;
	int m2;
	int m3;

public static int total(int a,int b,int c) {
	return a+b+c;
	
}
public boolean isPassed() {
  int t= total(m1,m2,m3);
  t++;
  return t>=120;
}
	public static void main(String[] args) {
	 StudentsMarks obj=new StudentsMarks();
	 obj.m1=60;
	 obj.m2=70;
	 obj.m3=85;
	if (obj.isPassed()){
		System.out.println("true");
	}
	else{
		System.out.println("false");
	}
	}
	}

