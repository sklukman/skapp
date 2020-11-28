package core_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	int rollNO;
	String name;
	String City;		
	public int getRollNO() {
		return rollNO;
	}
	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Student(int rollNO, String name, String city) {
		super();
		this.rollNO = rollNO;
		this.name = name;
		City = city;
	}
	@Override
	public String toString() {
		return "Stu [rollNO=" + rollNO + ", name=" + name + ", City=" + City + "]";
	}
	}
public class Main {
	public static void main(String[] args) {
		Student s1=  new Student(2, "Luqman", "Beed");
		Student s2=  new Student(1, "Jibrail", "Beed");
		Student s3=  new Student(4, "Mahommad", "Majalgaon");
		Student s4=  new Student(3, "Salman", "Majalgaon");
		Student s5=  new Student(5, "Javeed", "Amravati");
		Student s6=  new Student(1, "Nreshwware", "Amravati");
		List<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		Collections.sort(students, new StudentSort());
		//Sort Desc of Name 
		for (int i=0;i<students.size();i++) 
            System.out.println(students.get(i).getName()); 
	}
}
