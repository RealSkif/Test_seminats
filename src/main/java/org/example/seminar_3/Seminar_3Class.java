package org.example.seminar_3;

public class Seminar_3Class {
    private final int START = 25;
    private final int END = 100;

    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean numberInInterval(int n) {
        return n >= START && n <= END;
    }

}
