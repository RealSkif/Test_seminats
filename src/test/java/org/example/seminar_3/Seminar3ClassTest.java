package org.example.seminar_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Seminar3ClassTest {
    Seminar_3Class seminar3Class;
@BeforeEach
void setup(){
    this.seminar3Class = new Seminar_3Class();
}
    @Test
    void evenOddNumber() {
        assertTrue(seminar3Class.evenOddNumber(4));
    }

    @Test
    void numberInInterval() {
        assertTrue(seminar3Class.numberInInterval(50));
    }
}