package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class junit5Test {

    //    @TestMethodOrder()
    @DisplayName("DisplayName 테스트")

    @Test
    @Order(1)
    void one() {
        System.out.println("1");
    }

    @Test
    @Order(2)
    void two() {
        System.out.println("2");
    }

    @Test
    @Order(3)
    void three() {
        System.out.println("3");
    }

    @Test
    @Order(4)
    void four() {
        System.out.println("4");
    }

    @Test
    @Order(5)
    void five() {
        System.out.println("5");
    }
}
