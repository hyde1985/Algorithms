package chap02;

public class Student implements Comparable<Student>{

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student student) {
        if(this.score < student.score) {
            return -1;
        }
        if(this.score > student.score) {
            return 1;
        }
        return this.name.compareTo(student.name);
    }

    @Override
    public String toString() {
        return "Student: " + this.name + " " + Integer.toString( this.score );
    }

}
