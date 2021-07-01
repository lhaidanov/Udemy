package Homework.Lesson22;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;


    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name); // Important statement
        return name;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course < 5) {
            this.course = course;
        }

    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade < 11) {
            this.grade = grade;
        }
    }

    public void showInfo(){
        System.out.println("Name: " + getName() + " course: " + getCourse() + " grade: " + getGrade());
    }

}

class TestStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        StringBuilder sb = new StringBuilder("Ivan");
        st1.setName(sb);
        st1.setCourse(2);
        st1.setGrade(9);
        st1.showInfo();
    }



}
