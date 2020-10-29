import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        boolean exit = true;
        Creat creat = new Creat();
        Methods methods;
        Fraction fraction;
        do {
            System.out.println("1 Cong");
            System.out.println("2 Tru ");
            System.out.println("3 Nhân ");
            System.out.println("4 Chia ");
            System.out.println("0 Exit");
            Scanner sc = new Scanner(System.in);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    methods = creat.creatMethods();
                    fraction = methods.addition();
                    System.out.println("Kết quả là : " + fraction.toString());
                    break;
                case 2:
                    methods = creat.creatMethods();
                    fraction = methods.sou();
                    System.out.println("Kết quả là : " + fraction.toString());
                    break;
                case 3:
                    methods = creat.creatMethods();
                    fraction = methods.multi();
                    System.out.println("Kết quả là : " + fraction.toString());
                    break;
                case 4:
                    methods = creat.creatMethods();
                    fraction = methods.division();
                    System.out.println("Kết quả là : " + fraction.toString());
                    break;
                case 0:
                    exit = false;
            }
        } while (exit);

    }
}
