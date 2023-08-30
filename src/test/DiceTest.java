package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DiceTest {

    @Test
    @DisplayName("Dice 객체 생성 테스트")
    void diceConstructorTest() {
        Dice dice = new Dice(4);

        Assertions.assertEquals(4, dice.getNumber());
    }

    @Test
    @DisplayName("Dice 객체 생성 테스트2")
    void negativeDiceCostructor() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Dice(-1));
    }

    @Test
    @DisplayName("Dice 객체 생성 테스트3")
    void overSixDice() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Dice(7));
    }

}
