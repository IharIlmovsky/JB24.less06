package by.epam.jb24.less06;

public class studentLogic {
	public static final int MAX_MARK = 5;
	public static final int BAD_MARK = 2;

	public double getAvrMark(Student st) {		
		double avr = 0.0;
		
		if ((st == null) || (st.getCountOfMarks() == 0)) {
			return 0.0;
		}
		
		for (double d : st.getMarks()) {
			avr = avr + d;
		}
		
		avr = avr / st.getCountOfMarks();
		return avr;
	}
	
	public boolean isStudentHA(Student st) {
		
		if ((st == null) || (st.getCountOfMarks() == 0)) {
			return false;
		}
		
		for (double d : st.getMarks()) {
			if (d != MAX_MARK) {
				return false; 
			};
		}
		return true;
	}
	
	public boolean isStudentPoor(Student st) {
		
		if ((st == null) || (st.getCountOfMarks() == 0)) {
			return false;
		}
		
		for (double d : st.getMarks()) {
			if (d <= BAD_MARK) {
				return true; 
			};
		}
		return false;
	}
}

