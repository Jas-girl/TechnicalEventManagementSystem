package project;

public class Register {
private String name;
private int age;
private String stream;
private String event;
public Register() {
	// TODO Auto-generated constructor stub
}
public Register(String name, int age, String stream, String event) {
	super();
	this.name = name;
	this.age = age;
	this.stream = stream;
	this.event = event;
}
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public String getStream() {
	return stream;
}
public String getEvent() {
	return event;
}
@Override
public String toString() {
	return "Register [name=" + name + ", age=" + age + ", stream=" + stream + ", event=" + event + "]";
}

}
