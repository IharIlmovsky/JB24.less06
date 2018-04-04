package by.epam.jb24.less06;

public class Group {
	private Student[] students;
	private String groupName;
	
	public Group(int groupSize, String _name) {
		students = new Student[groupSize];
		setGroupName(_name);
	}

	private int studentCount = 0;// change name

	public boolean add(Student st) {
		if (studentCount >= students.length) {
			return false;
		}
		students[studentCount] = st;
		studentCount++;
		return true;
	}
	
	public int getStudentCount() {		
		int count = 0;
		
		for (Student st : students) {
			if (st != null) {
				count++; }
		}
		return count;
	}

	public Student[] getStudents() {
		return students;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
