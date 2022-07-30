package sdbms;

import java.util.Comparator;

class SortStudentByMarkss implements Comparator<Student> {
	public int compare(Student s1,Student s2) {
		return s1.getMarks().compareTo(s2.getMarks());
	}

}
