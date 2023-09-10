import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private String id;
    private double gpa;
    private int year;

    public Student() {
    }

    public Student(String name, String id, double gpa, int year) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.year = year;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.gpa, o.gpa);
    }

    @Override
    public String toString() {
        return String.format("Student:[name=%s,id=%s,gpa=%.2f,year=%d]\n", this.name, this.id, this.gpa, this.year);
    }

    public static void main(String[] args) {
        List<Student> a = new ArrayList<Student>();
        for (int i = 10; i >= 1; i--) {
            a.add(new Student("SV " + i, Integer.toString(2102000 + i), Math.random() * 4, 2000 + i));
        }
        System.out.println("Before sorted");
        System.out.println(a);
        System.out.println("After sorted");
        System.out.println(a.stream().sorted().toList());
    }
}
