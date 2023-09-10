import java.io.*;

public class Serialization {
    public static void main(String[] args) {
        // OutputStream
        try {
            FileOutputStream ouputFile = new FileOutputStream("savegame.txt");
            ObjectOutputStream objOutput = new ObjectOutputStream(ouputFile);
            Student a = new Student("001", "Nguyen Hoang Hai");
            Student b = new Student("002", "Nguyen Quang Huy");
            Teacher c = new Teacher("Tran Thi Duong", "Xuan Dinh, Ha Noi");
            objOutput.writeObject(a);
            objOutput.writeObject(b);
            objOutput.writeObject(c);
        } catch (IOException e) {
            System.out.println("Loi khi xuat du lieu vao file savegame.txt");
        }
        // InputStream
        try {
            FileInputStream inputFile = new FileInputStream("savegame.txt");
            ObjectInputStream objInput = new ObjectInputStream(inputFile);
            Student a = (Student) objInput.readObject();
            Student b = (Student) objInput.readObject();
            Teacher c = (Teacher) objInput.readObject();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } catch (FileNotFoundException e) {
            System.out.println("Ten file khong dung");
        } catch (IOException e) {
            System.out.println("Loi nhap du lieu tu file savegame.txt");
        } catch (ClassNotFoundException e) {
            System.out.println("Ep kieu sai");
        }
    }
}
