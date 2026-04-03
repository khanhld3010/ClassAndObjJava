package QuadraticEquation;

public class QuadraticEquation {
    private double numberA = 0;
    private double numberB = 0;
    private double numberC = 0;

    public QuadraticEquation(double numberA, double numberB, double numberC) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.numberC = numberC;
    }

    public QuadraticEquation() {
    }

    public double getDiscriminant() {
        //!delta = b^2 - 4ac
        return this.numberB * this.numberB - 4 * this.numberA * this.numberC;
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        } else {
            return ((-this.numberB) + Math.sqrt(getDiscriminant())) / 2 * this.numberA;
        }
    }

    public double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;
        } else {
            return ((-this.numberB) - Math.sqrt(getDiscriminant())) / 2 * this.numberA;
        }
    }

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double getNumberC() {
        return numberC;
    }

    public void setNumberC(double numberC) {
        this.numberC = numberC;
    }
}
