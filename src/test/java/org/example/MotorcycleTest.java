package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {
    Motorcycle bike;

    @BeforeEach
    void setup() {
        this.bike = new Motorcycle("Yamaha", "R1", 2005);
    }

    @Test
    void isFourWheels() {
        assertEquals(2, bike.getNumWheels());
    }

    @Test
    void testDrive() {
        bike.testDrive();
        assertEquals(75, bike.getSpeed());
    }

    @Test
    void park() {
        bike.testDrive();
        bike.park();
        assertEquals(0, bike.getSpeed());
    }
}