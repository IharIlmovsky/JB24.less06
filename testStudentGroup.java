package by.epam.jb24.less06;

import java.lang.*;
import java.util.Random;

public class testStudentGroup {
	static final int max_SubjCount = 12; // or any number
	static final int groupMembersCount = 12; // or any number
	static final groupLogic grLogic = new groupLogic();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		Group group = new Group(groupMembersCount, "jb24-test-group");
		String v_name;
		String v_family;
		
		for(int i=0; i < groupMembersCount; i++) { //init			
			v_name = "name_" + Integer.toString(i + 1);
			v_family = "family_" + Integer.toString(i + 1);
			int subjCount = rand.nextInt(max_SubjCount);
			
			Student st = new Student( v_name, v_family, subjCount);
			int num_marks = rand.nextInt( st.getCountOfSubject());
			for (int k = 0; k < num_marks; k++) {
				st.setMark( rand.nextInt(4)+1);
			}
			group.add( st);
		}
		
		// print output
		System.out.println("������� ���� ������� ������ '"+ group.getGroupName() +"': " + grLogic.getAvrMark(group));
		System.out.println("������� ���� ������� ��������:");
		studentLogic stLogic = new studentLogic();
		  for (Student st : group.getStudents()) {
			  System.out.println(st.getFullName()+" "+stLogic.getAvrMark(st));
		  }
		System.out.println("����� ����������: " + grLogic.getCountHAStudent(group));
		System.out.println("���������� ���������, ������� \"2\".: " + grLogic.getCountPoorStudent(group));
	}

}
