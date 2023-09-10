public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double gpa;

    @Override
    public int compareTo(Student o) {
        int res = this.name.compareTo(o.name);
        if (res == 0) res = Double.compare(this.gpa, o.gpa);
        if (res == 0) res = Integer.compare(this.id, o.id);
        return res;
    }

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
}
