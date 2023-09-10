import java.io.Serializable;

public class Teacher implements Serializable {
    private String name;
    private String address;

    @Override
    public String toString() {
        return String.format("Teacher[name=%s,address=%s]", this.name, this.address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Teacher(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
