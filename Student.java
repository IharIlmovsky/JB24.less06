package by.epam.jb24.less06;

public class Student {

	private String name;
	private String surname;
	private double[] marks;
	private int numberOfSubj; 

	public Student(String _name, String _surname, int _numberOfSubj) {		
		setName(_name);
		setSurname(_surname);
		numberOfSubj = _numberOfSubj;
		marks = new double[_numberOfSubj];
	}

	private int NumberOfMarks = 0;

	public boolean setMark(double _mark) {
		if (NumberOfMarks >= marks.length) {
			return false; }

		marks[NumberOfMarks] = _mark;
		NumberOfMarks++;
		return true;
	}

	public int getCountOfMarks() {
		return NumberOfMarks;
	}
	
	public int getCountOfSubject() {
		return numberOfSubj;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String _name) {
		this.name = _name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String _surname) {
		this.surname = _surname;
	}

	public double[] getMarks() {
		return marks;
	}
	
	public String getFullName() {
		return getName() + " " + getSurname();
	}
}

