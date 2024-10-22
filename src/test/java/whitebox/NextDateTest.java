package whitebox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDateTest {

    @Test
    void testIsThirtyOneDayMonth(){
        NextDate nextDate = new NextDate(1,31,2020);
        assertEquals("Janeiro", nextDate.run(1,30,2020));
    }

}
