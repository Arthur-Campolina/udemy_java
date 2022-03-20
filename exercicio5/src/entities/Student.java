package entities;

public class Student {
	
	public String name;
	public double first;
	public double second;
	public double third;
	
	public double finalGrade() {
		return first + second + third;
	}
	
	public String pass() {
		if(finalGrade() >= 60) {
			return "FINAL GRADE = " + String.format("%.2f", finalGrade()) + "\n" + "PASS";
		} else {
			double failedBy = 60 - finalGrade();
			return "FINAL GRADE = " + String.format("%.2f", finalGrade()) + "\n" + "FAILED" + "\n" + "MISSING " + String.format("%.2f", failedBy) + " points";
		}
	}
}
