package week7_8;

import java.util.ArrayList;

public class StudentManagement {
private ArrayList<Student> listStudent = new ArrayList<Student>();
public StudentManagement() {
	
	Student st1 = new Student("Nguyen Van A", "1", new Date(1, 3, 2000), new ArrayList<Subject>());
	Student st2 = new Student("Nguyen Van B", "2", new Date(1, 3, 2000), new ArrayList<Subject>());
	Student st3 = new Student("Nguyen Van C", "3", new Date(1, 3, 2000), new ArrayList<Subject>());

	st1.getListSub().add(new Subject("Toan", "111"));
	st1.getListSub().add(new Subject("Ly", "112"));
	st1.getListSub().add(new Subject("Hoa", "113"));
	
	st2.getListSub().add(new Subject("Toan", "111"));
	st2.getListSub().add(new Subject("Ly", "112"));
	st2.getListSub().add(new Subject("Hoa", "113"));
	
	st3.getListSub().add(new Subject("Toan", "111"));
	st3.getListSub().add(new Subject("Ly", "112"));
	st3.getListSub().add(new Subject("Hoa", "113"));
	
	listStudent.add(st1);
	listStudent.add(st2);
	listStudent.add(st3);
}
public boolean addStudent(Student st) {
	boolean res = false;
	listStudent.add(st);
	res = true;
	return res;
}
public boolean addMark(String idStud, String idSub, double mark) {
	boolean res = false;
	for(Student s : listStudent) {
		if(s.getId().equalsIgnoreCase(idStud)) {
			for(Subject sb : s.getListSub()) {
				if(sb.getId().equalsIgnoreCase(idSub)) {
					sb.setMark(mark);
					res = true;
				}
			}
		}
	}
	return res;
}
public Student findById(String id) {
	Student student = null;
	for(Student s : listStudent) {
		if(s.getId().equalsIgnoreCase(id)) {
			student = s;
		}
	}
	return student;
}
public ArrayList<Student> findByName(String name){
	ArrayList<Student> list= new ArrayList<Student>();
	for(Student s: list) {
		if(s.getName().equalsIgnoreCase(name)) {
			list.add(s);
		}
	}
	return list;
}
public double averageMark(String id) {
	double mark = 0;
	for(Student s : listStudent) {
		if(s.getId().equalsIgnoreCase(id)) {
			mark = s.averageMark();
		}
	}
	return mark;
}

	public void print() {
		// TODO Auto-generated method stub
		for(Student s: listStudent) {
			System.out.println(s.toString());
		}
	}
public static void main(String[] args) {
	StudentManagement stm = new StudentManagement();
	stm.addMark("1", "111", 6);
//	System.out.println(stm.averageMark("1"));
	stm.print();
	
}
}
