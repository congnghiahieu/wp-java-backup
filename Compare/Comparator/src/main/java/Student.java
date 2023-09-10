import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student {
    /*
     * Quy tắc tạo Comparator:
     * C1: Tạo 1 class riêng (ở 1 file riêng)
     * C2: Tạo 1 nested Class ở trong Class cần được compare
     * Define a nested class that implements Comparator interface
     * Implement the compare() method
     *
     * Ta sẽ dùng từ khóa static để chỉ tạo 1 comparator for Class
     *
     * */
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
    public String toString() {
        return String.format("Student:[name=%s,id=%s,gpa=%.2f,year=%d]\n",
                this.name, this.id, this.gpa, this.year);
    }

    // Comparator
    public static final Comparator<Student> BY_YEAR = new ByYear();
    public static final Comparator<Student> BY_GPA = new ByGpa();

    // one comparator for the class
    private static final class ByYear implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return Integer.compare(o1.year, o2.year);
        }
    }

    private static final class ByGpa implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return Double.compare(o1.gpa, o2.gpa);
        }
    }

    public static void main(String[] args) {
        List<Student> a = new ArrayList<Student>();
        for (int i = 10; i >= 1; i--) {
            a.add(new Student("SV " + i, Integer.toString(2102000 + i), Math.random() * 4, 2000 + i));
        }
        System.out.println("Before sorted");
        System.out.println(a);
        System.out.println("After sorted");
        a.sort(Student.BY_YEAR);
        a.sort(Student.BY_GPA);
        System.out.println(a);
    }
}
