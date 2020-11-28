package core_java;

import java.util.Comparator;

public class StudentSort implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		/*
		 * if (!o1.getCity().equalsIgnoreCase(o2.getCity())) { return
		 * o1.getCity().compareTo(o2.getCity());
		 * 
		 * } else if (o1.getCity().equalsIgnoreCase(o2.getCity())) {
		 * 
		 * return o1.getRollNO() - o2.getRollNO(); } else { return 0; }
		 */

		// return o1.getName().compareTo(o2.getName());
		// return o2.getRollNO()-(o1.getRollNO());

		// return o2.getName().length()s-(o1.getName().length());

		if (o2.getName().length() != o1.getName().length()) {
			return o1.getName().length() - o2.getName().length();

		} else if (o2.getName().length() == o1.getName().length()) {
			return o1.getRollNO() - o2.getRollNO();
		}
		else return 0;
	}
}
