import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
    private Fraction fractionOne;
    private Fraction fractionTwo;
    int a;
    int b;
    int c;
    int d;

    public Methods() {
    }

    public Methods(Fraction fractionOne, Fraction fractionTwo) {
        this.fractionOne = fractionOne;
        this.fractionTwo = fractionTwo;
    }

    public void nhap() {
        a = getFractionOne().tusoMin();
        b = getFractionOne().mausoMin();
        c = getFractionTwo().tusoMin();
        d = getFractionTwo().mausoMin();
    }

    public Fraction getFractionOne() {
        return fractionOne;
    }

    public void setFractionOne(Fraction fractionOne) {
        this.fractionOne = fractionOne;
    }

    public Fraction getFractionTwo() {
        return fractionTwo;
    }

    public void setFractionTwo(Fraction fractionTwo) {
        this.fractionTwo = fractionTwo;
    }

    public Fraction addition() {
        nhap();
        Fraction fraction = new Fraction();
        fraction.setTuSo((a * d) + (c * b));
        fraction.setMauSo(b * d);
        return fraction;
    }
    public Fraction sou() {
        nhap();
        Fraction fraction = new Fraction();
        fraction.setTuSo((a * d) - (c * b));
        fraction.setMauSo(b * d);
        return fraction;
    }
    public Fraction multi() {
        nhap();
        Fraction fraction = new Fraction();
        fraction.setTuSo((a *c));
        fraction.setMauSo(b * d);
        return fraction;
    }
    public Fraction division() {
        nhap();
        Fraction fraction = new Fraction();
        fraction.setTuSo((a *d));
        fraction.setMauSo(b * c);
        return fraction;
    }




}
