package HW5.Task1;

public class Student {
    private String name;
    private String surname;
    private int dateOfBirthday;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirthday(int dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDateOfBirthday() {
        return dateOfBirthday;
    }

    public int getCourse() {
        return course;
    }
}
