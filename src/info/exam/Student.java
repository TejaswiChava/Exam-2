package info.exam;

public class Student {
	boolean talkative;
	int score;
	int attendance;

	public Student(boolean newtalkative, int newscore, int newattendance) {
		talkative = newtalkative;
		score = newscore;
		attendance = newattendance;
	}

	public String printGrade(Student s1) {
		String grade = "";
		if (score > 80) {
			grade = "A";

		} else if (score > 60 && score < 80) {
			grade = "B";

		} else if (score == 80) {
			if (isAttendanceGood()) {
				grade = "A";

			} else {
				grade = "B";

			}
		} else if (score == 60) {
			if (isTalkative()) {
				grade = "C";

			} else {
				grade = "B";

			}
		}
		return grade;
	}

	public int getScore() {

		return score;
	}

	public boolean isAttendanceGood() {
		if (attendance > 80)
			return true;
		else
			return false;
	}

	public boolean isTalkative() {
		return talkative;
	}
}
