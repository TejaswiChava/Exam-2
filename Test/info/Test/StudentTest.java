package info.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import info.exam.Student;

public class StudentTest {
	Student student;

	@Test
	public void gradeAtest() {
		student = new Student(false, 88, 85);
		String result = student.printGrade(student);
		assertEquals("A", result);
	}

	@Test
	public void gradeBtest() {
		student = new Student(false, 60, 85);
		String result = student.printGrade(student);
		assertEquals("B", result);
	}

	@Test
	public void gradeCtest() {
		student = new Student(true, 60, 85);
		String result = student.printGrade(student);
		assertEquals("C", result);
	}

}
