package whitebox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDateTest {

    @Test
    void testIsDayZero(){
        NextDate nextDate = new NextDate(1,0,2020);
        assertEquals("invalid Input Date", nextDate.run(1,0,2020));
    }

    @Test
    void testIsMonthZero(){
        NextDate nextDate = new NextDate(0,31,2020);
        assertEquals("invalid Input Date", nextDate.run(0,31,2020));
    }

    @Test
    void testIsMonthAboveTwelve(){
        NextDate nextDate = new NextDate(13,31,2020);
        assertEquals("invalid Input Date", nextDate.run(13,31,2020));
    }

    @Test
    void testIsYearAbove2021(){
        NextDate nextDate = new NextDate(12,31,2022);
        assertEquals("invalid Input Date", nextDate.run(12,31,2022));
    }

    @Test
    void testIsMonthBellow1801(){
        NextDate nextDate = new NextDate(1,31,1800);
        assertEquals("invalid Input Date", nextDate.run(1,30,1800));
    }

    @Test
    void testIsThirtyOneDay(){
        NextDate nextDate = new NextDate(1,31,2020);
        assertEquals("1/31/2020", nextDate.run(1,30,2020));
    }

    @Test
    void testIsThirtyOneDayMonth(){
        NextDate nextDate = new NextDate(1,31,2020);
        assertEquals("2/1/2020", nextDate.run(1,31,2020));
    }

    @Test
    void testIsThirtyDay(){
        NextDate nextDate = new NextDate(4,29,2020);
        assertEquals("4/30/2020", nextDate.run(4,29,2020));
    }

    @Test
    void testIsThirtyDayMonth(){
        NextDate nextDate = new NextDate(4,30,2020);
        assertEquals("5/1/2020", nextDate.run(4,30,2020));
    }

    @Test
    void testIsThirtyDayMonthInvalid(){
        NextDate nextDate = new NextDate(4,31,2020);
        assertEquals("Invalid Input Date", nextDate.run(4,31,2020));
    }

    @Test
    void testIsDecemberDay(){
        NextDate nextDate = new NextDate(12,30,2020);
        assertEquals("12/31/2020", nextDate.run(12,30,2020));
    }

    @Test
    void testIsDecemberDayMonth(){
        NextDate nextDate = new NextDate(12,31,2019);
        assertEquals("1/1/2020", nextDate.run(12,31,2019));
    }

    @Test
    void testIsDecemberDayMonthYear(){
        NextDate nextDate = new NextDate(12,31,2019);
        assertEquals("1/1/2020", nextDate.run(12,31,2019));
    }

    @Test
    void testIsDecemberDayMonthYearInvalid(){
        NextDate nextDate = new NextDate(12,31,2022);
        assertEquals("invalid Input Date", nextDate.run(12,31,2022));
    }

    @Test
    void testFebruaryBellow28(){
        NextDate nextDate = new NextDate(2,27,2020);
        assertEquals("2/28/2020", nextDate.run(2,27,2020));
    }

    @Test
    void testFebruaryEquals28LeapYear(){
        NextDate nextDate = new NextDate(2,28,2020);
        assertEquals("2/29/2020", nextDate.run(2,28,2020));
    }

    @Test
    void testFebruaryEquals28NotLeapYear(){
        NextDate nextDate = new NextDate(2,28,2019);
        assertEquals("3/1/2019", nextDate.run(2,28,2019));
    }

    @Test
    void testFebruaryEquals29LeapYear(){
        NextDate nextDate = new NextDate(2,29,2020);
        assertEquals("3/1/2020", nextDate.run(2,29,2020));
    }

    @Test
    void testFebruaryEquals29NotLeapYear(){
        NextDate nextDate = new NextDate(2,29,2019);
        assertEquals("Invalid Input Date", nextDate.run(2,29,2019));
    }

    @Test
    void testFebruaryAbove29(){
        NextDate nextDate = new NextDate(2,29,2020);
        assertEquals("Invalid Input Date", nextDate.run(2,30,2020));
    }

}
