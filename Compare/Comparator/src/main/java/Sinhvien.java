import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sinhvien implements Comparable<Sinhvien> {
    private int id;
    private String name;
    private double gpa;

    public Sinhvien(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Sinhvien o) {
        int res = -Double.compare(this.gpa, o.gpa);
        if (res == 0) {
            res = this.name.compareTo(o.name);
            if (res == 0) {
                res = Integer.compare(this.id, o.id);
            }
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());
        Sinhvien[] a = new Sinhvien[q];
        for (int i = 0; i < q; i++) {
            String[] parse = br.readLine().split(" ");
            int id = Integer.parseInt(parse[0]);
            double gpa = Double.parseDouble(parse[2]);
            a[i] = new Sinhvien(id, parse[1], gpa);
        }
        Arrays.sort(a);
        for (Sinhvien x : a) {
            System.out.println(x.name);
        }
    }
}
