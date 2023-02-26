package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactTest {

    @Test
    public void whenExceptionOne() {
        Fact fact = new Fact();
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    fact.calc(-1);
                });
            assertThat(ex.getMessage()).isEqualTo("N could not be less then 0");
    }

    @Test
    public void whenExceptionTwo() {
        Fact fact = new Fact();
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    fact.calc(-10);
                });
        assertThat(ex.getMessage()).isEqualTo("N could not be less then 0");
    }
}