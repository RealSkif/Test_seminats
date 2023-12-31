package org.example;

import org.example.seminar_2.Car;
import org.example.seminar_2.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car;

    @BeforeEach
    void setup() {
        this.car = new Car("Ford", "Focus", 2005);
    }
    @Test
    void isCar() {
        assertTrue(car instanceof Vehicle);
    }

    @Test
    void isFourWheels() {
        assertEquals(4, car.getNumWheels());
    }

    @Test
    void testDrive() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    void park() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }
}