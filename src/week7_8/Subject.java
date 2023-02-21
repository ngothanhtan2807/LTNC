package week7_8;

public class Subject {
private String name;
private String id;
private double mark;
public Subject(String name, String id) {
	super();
	this.name = name;
	this.id = id;
	this.mark = 0;
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
public double getMark() {
	return mark;
}
public void setMark(double mark) {
	this.mark = mark;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Subject: " + name + " ID: "+id + " Mark: "+ mark;
	}
}
