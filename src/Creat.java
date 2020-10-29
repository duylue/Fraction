import java.util.Scanner;

public class Creat {
    public Fraction creatFraction() {
        Fraction fraction = new Fraction();
        System.out.println("Nhập tử số");
        fraction.setTuSo(input());
        System.out.println("Nhâp mẫu số");
        fraction.setMauSo(input());
        return fraction;
    }

    public Methods creatMethods() {
        Fraction fractionA = creatFraction();
        System.out.println("Nhập phân số thứ  2");
        Fraction fractionB = creatFraction();
        Methods methods = new Methods(fractionA, fractionB);
        return methods;
    }

    public int input() {
        int input = 0;
        Scanner sc = new Scanner(System.in);
        try {
            int test = Integer.parseInt(sc.nextLine());
            if (test != 0) {
                input = test;
            } else {
                System.err.println("mấu số hoặc tử số không thể là 0");
                input = input();
            }

        } catch (Exception e) {
            System.err.println("Không hợp lệ");
            input = input();
        }
        return input;
    }
}
