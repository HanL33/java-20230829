package test;

public class Dice {

    private int number;

    public Dice(int number) {
        if (number <= 0 || number >= 7) {
            throw new IllegalArgumentException("error");
        }
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

}
