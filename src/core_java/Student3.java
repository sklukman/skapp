package core_java;

//Case #2: By overriding display data wise hashcode
public class Student3{
	int sno;
	String sname;
	String sub;
	double fee;
	public Student3(int sno, String sname, String sub, double fee) {
		this.sno=sno;
		this.sname=sname;
		this.sub=sub;
		this.fee=fee;
	}
	public static void main(String[] args) {
		Student3 s1=new Student3(101,"HK","CJ",1000);
		Student3 s2=new Student3(101,"BK","AJ",2000);
		Student3 s3=new Student3(101,"BK","AJ",2000);
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
	
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
	}
    
	@Override
	public int hashCode() {
	 return sno;
	}
}