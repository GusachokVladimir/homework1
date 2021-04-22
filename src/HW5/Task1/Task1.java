package HW5.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student("Zina", 1);
        students[1] = new Student("Sveta", 2);
        students[2] = new Student("Masha", 1);
        students[3] = new Student("Galya", 3);
        students[4] = new Student("Stepa", 1);

        printStudents(students, 1);

    }

    public static void printStudents(Student[] students, int course){
        for (Student student: students){
            if (student.getCourse() == course){
                System.out.println(student.getName() + " обучается на курсе: " + course);
            }
        }

    }
}
