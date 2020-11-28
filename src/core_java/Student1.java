package core_java;

//Case #2: By overriding display data wise hashcode
public class Student1 {
	int sno;
	String sname;
	String sub;
	double fee;

	public Student1(int sno, String sname, String sub, double fee) {
		this.sno=sno;
		this.sname=sname;
		this.sub=sub;
		this.fee=fee;
	}

	public static void main(String[] args) {
		Student1 s1 = new Student1(101, "HK", "CJ", 1000);
		Student1 s2 = new Student1(101, "BK", "AJ", 2000);
		Student1 s3 = new Student1(101, "BK", "AJ", 2000);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}

	@Override
	public int hashCode() {
		return sno;
	}
}