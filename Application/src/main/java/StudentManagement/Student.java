package StudentManagement;

public class Student {
	private int id;
    private String name;
    private String course;
    private int age;

    public Student(int id, String name, String course, int age) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Course: " + course + ", Age: " + age;
    }


}
