package by.epam.jb24.less06;

public class groupLogic {

	private final studentLogic stLogic = new studentLogic();
	//private static final int MAX_MARK = 5;

	public double getAvrMark(Group gr) {
		double avr = 0.0;

		if ((gr == null) || (gr.getStudentCount() == 0)) {
			return 0.0;
		}
		
		for (Student st : gr.getStudents()) {
			avr = avr + stLogic.getAvrMark(st);
		}

		avr = avr / gr.getStudentCount();
		return avr;
	}

	public int getCountHAStudent(Group gr) {
		int count = 0;

		if ((gr == null) || (gr.getStudentCount() == 0)) {
			return 0; }
		
		for (Student st : gr.getStudents()) {
			if ((st != null) && (stLogic.isStudentHA(st)) ) {
				count++; }
		}
		return count;
	}
	
	public int getCountPoorStudent(Group gr) {
		int count = 0;

		if ((gr == null) || (gr.getStudentCount() == 0)) {
			return 0; }
		
		for (Student st : gr.getStudents()) {
			if ((st != null) && (stLogic.isStudentPoor(st)) ) {
				count++; }
		}
		return count;
	}
	
}
