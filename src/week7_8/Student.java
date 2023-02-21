package week7_8;

import java.util.ArrayList;

public class Student {
private String name;
private String id;
private Date dateOfBirth;
private ArrayList<Subject> listSub;
public Student(String name, String id, Date dateOfBirth, ArrayList<Subject> listSub) {
	super();
	this.name = name;
	this.id = id;
	this.dateOfBirth = dateOfBirth;
	this.listSub = listSub;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public ArrayList<Subject> getListSub() {
	return listSub;
}
public void setListSub(ArrayList<Subject> listSub) {
	this.listSub = listSub;
}
public double averageMark() {
	double mark = 0;
	for(int i = 0; i < listSub.size(); i ++) {
		mark = mark + listSub.get(i).getMark();
	}
	return mark/listSub.size();
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
	String res = "";
	for(Subject s: listSub) {
		res += s.toString() + " ";
	}
		return "ID: " + id+ " Name: "+name + " "+res + " Average: "+ averageMark();
	}
}
