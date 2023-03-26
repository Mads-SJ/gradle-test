package counter;

import  org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CounterTest {
    private Counter counter;

    @BeforeEach
    void setUp() {
        counter = new Counter();
    }

    @Test
    void constructorTC1() {
        assertEquals(0, counter.getCount());
    }

    @Test
    void incrementTC2() {
        counter.increment();
        assertEquals(0, counter.getCount());
    }

    @Test
    void decrementTC3() {
        counter.decrement();
        assertEquals(-1, counter.getCount());
    }

    @Test
    void resetTC4() {
        counter.increment();
        counter.reset();
        assertEquals(0, counter.getCount());
    }
}