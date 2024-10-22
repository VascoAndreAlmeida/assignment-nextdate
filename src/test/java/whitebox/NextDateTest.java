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

    @Test
    void testYear2021() {
        NextDate nextDate = new NextDate(12, 31, 2021);
        assertEquals("Invalid Next Year", nextDate.run(12, 31, 2021));
    }

    @Test
    void testFebruaryDayAbove29() {
        NextDate nextDate = new NextDate(2, 30, 2020);
        assertEquals("Invalid Input Date", nextDate.run(2, 30, 2020));
    }
    @Test
    void testValidDate() {
        NextDate nextDate = new NextDate(11, 18, 2018);
        assertEquals("11/19/2018", nextDate.run(11, 18, 2018));
    }
    @Test
    void testIsThirtyDayJune(){
        NextDate nextDate = new NextDate(6,29,2020);
        assertEquals("6/30/2020", nextDate.run(6,29,2020));
    }

    @Test
    void testIsThirtyDayMonthJune(){
        NextDate nextDate = new NextDate(6,30,2020);
        assertEquals("7/1/2020", nextDate.run(6,30,2020));
    }
    @Test
    void testIsThirtyDaySeptember(){
        NextDate nextDate = new NextDate(9,29,2020);
        assertEquals("9/30/2020", nextDate.run(9,29,2020));
    }

    @Test
    void testIsThirtyDayMonthSeptember(){
        NextDate nextDate = new NextDate(9,30,2020);
        assertEquals("10/1/2020", nextDate.run(9,30,2020));
    }
    @Test
    void testIsThirtyDayNovember(){
        NextDate nextDate = new NextDate(11,29,2020);
        assertEquals("11/30/2020", nextDate.run(11,29,2020));
    }

    @Test
    void testIsThirtyDayMonthNovember(){
        NextDate nextDate = new NextDate(11,30,2020);
        assertEquals("12/1/2020", nextDate.run(11,30,2020));
    }

    @Test
    void testIsThirtyOneDayMarch(){
        NextDate nextDate = new NextDate(3,31,2020);
        assertEquals("3/31/2020", nextDate.run(3,30,2020));
    }

    @Test
    void testIsThirtyOneDayMonthMarch(){
        NextDate nextDate = new NextDate(3,31,2020);
        assertEquals("4/1/2020", nextDate.run(3,31,2020));
    }

    @Test
    void testIsThirtyOneDayMay(){
        NextDate nextDate = new NextDate(5,31,2020);
        assertEquals("5/31/2020", nextDate.run(5,30,2020));
    }

    @Test
    void testIsThirtyOneDayMonthMay(){
        NextDate nextDate = new NextDate(5,31,2020);
        assertEquals("6/1/2020", nextDate.run(5,31,2020));
    }

    @Test
    void testIsThirtyOneDayAugust(){
        NextDate nextDate = new NextDate(8,31,2020);
        assertEquals("8/31/2020", nextDate.run(8,30,2020));
    }

    @Test
    void testIsThirtyOneDayMonthAugust(){
        NextDate nextDate = new NextDate(8,31,2020);
        assertEquals("9/1/2020", nextDate.run(8,31,2020));
    }

    @Test
    void testIsThirtyOneDayOctober(){
        NextDate nextDate = new NextDate(10,31,2020);
        assertEquals("10/31/2020", nextDate.run(10,30,2020));
    }

    @Test
    void testIsThirtyOneDayMonthOctober(){
        NextDate nextDate = new NextDate(10,31,2020);
        assertEquals("11/1/2020", nextDate.run(10,31,2020));
    }



    //Ano bissexto /400
    @Test
    void testIsLeapYearDivisibleBy400() {
        NextDate nextDate = new NextDate(2, 29, 2000);
        assertEquals("3/1/2000", nextDate.run(2, 29, 2000));
    }

    //Ano ñ bissexto /400
    @Test
    void testIsLeapYearNotDivisibleBy400() {
        NextDate nextDate = new NextDate(2, 29, 1900);
        assertEquals("Invalid Input Date", nextDate.run(2, 29, 1900));
    }

    //Ano bissexto /4
    @Test
    void testIsLeapYearDivisibleBy4() {
        NextDate nextDate = new NextDate(2, 29, 2020);
        assertEquals("3/1/2020", nextDate.run(2, 29, 2020));
    }

    //Ano ñ bissexto /4
    @Test
    void testIsLeapYearNotDivisibleBy4() {
        NextDate nextDate = new NextDate(2, 29, 2019);
        assertEquals("Invalid Input Date", nextDate.run(2, 29, 2019));
    }
}
