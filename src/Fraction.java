public class Fraction {
    private int mauSo;
    private int tuSo;

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public Fraction() {
    }

    public Fraction(int mauSo, int tuSo) {
        this.mauSo = mauSo;
        this.tuSo = tuSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int uCLN() {
        int a = Math.abs(getMauSo());
        int b = Math.abs(getTuSo());
        while (a != b) {
            if (a > b) {
                a = a - b;

            } else {
                b = b - a;
            }
        }
        return a;
    }

    public int tusoMin() {
        return getTuSo() / uCLN();
    }

    public int mausoMin() {
        return getMauSo() / uCLN();
    }

    @Override
    public String toString() {
        if (tusoMin() < 0 && mausoMin() < 0) {
            return "Fraction{" +
                    (-tusoMin()) + "/" + (-mausoMin()) +
                    '}';
        } else {
            return "Fraction{" +
                    tusoMin() + "/" + mausoMin() +
                    '}';
        }
    }
}
