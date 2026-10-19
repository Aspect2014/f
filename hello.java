class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }                                                          //hello

    public int getGrade() {
        return grade;
    }
}

public class hello {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 9);

        System.out.println("Name: " + student1.getName());
        System.out.println("Grade: " + student1.getGrade());
    }
}