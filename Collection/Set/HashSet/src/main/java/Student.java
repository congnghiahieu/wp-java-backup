public class Student {
    private String id;
    private String name;
    private double gpa;

    @Override
    public int hashCode() {
        return id.hashCode() + name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        Student tmp = (Student) obj;
        if (!this.name.equals((tmp).name)) return false;
        if (!this.id.equals((tmp).id)) return false;
        return this.gpa == (tmp).gpa;
    }

    @Override
    public String toString() {
        return String.format("Student[id=%s,name=%s,gpa=%.2f]", this.id, this.name, this.gpa);
    }

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
}
