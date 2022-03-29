package lec15_01_java_oop_encapsulation;

public class Student {
	private String stName;
	private int stId;
	private char sex;
	private boolean fulltimeSt;
	private float grade;

	// Although you are using by getters and setters method, but you must practice one pair by typing, because asked in the interview
	public String getStName() { // return type method
		return stName;
	}

	public void setStName(String stName) { // parameterized method
		this.stName = stName;
	}

	public int getStId() {
		return stId;
	}

	public void setStId(int stId) {
		this.stId = stId;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public boolean isFulltimeSt() {
		return fulltimeSt;
	}

	public void setFulltimeSt(boolean fulltimeSt) {
		this.fulltimeSt = fulltimeSt;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

}
