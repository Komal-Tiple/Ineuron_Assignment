package com.jdbc.Operation;

public class CourseBean {
private int id;
private String title;
private String desc;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}

public CourseBean() {
	super();
}
public CourseBean(String title, String desc) {
	super();
	this.title = title;
	this.desc = desc;
}
public CourseBean(int id, String title, String desc) {
	super();
	this.id = id;
	this.title = title;
	this.desc = desc;
}
@Override
public String toString() {
	return "CourseBean [id=" + id + ", desc=" + desc + ", title=" + title + "]";
}

}
