import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @org.junit.jupiter.api.Test
    @DisplayName("case 1/1/2018")
    void TestDay1Month1Year2018() {
        int day = 1;
        int mon = 1;
        int year = 2018;
        String expected = "2-1-2018";
        String result = NextDayCalculator.NextDay(day,mon,year);
        assertEquals(expected,result);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("case 31/1/2018")
    void TestDay31Month1Year2018() {
        int day = 31;
        int mon = 1;
        int year = 2018;
        String expected = "1-2-2018";
        String result = NextDayCalculator.NextDay(day,mon,year);
        assertEquals(expected,result);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("case 30/4/2018")
    void TestDay30Month4Year2018() {
        int day = 30;
        int mon = 4;
        int year = 2018;
        String expected = "1-5-2018";
        String result = NextDayCalculator.NextDay(day,mon,year);
         assertEquals(expected,result);
    }


    @org.junit.jupiter.api.Test
    @DisplayName("case 28/2/2020")
    void TestDay28Month2Year2020() {
        int day = 28;
        int mon = 2;
        int year = 2020;
        String expected = "1-3-2020";
        String result = NextDayCalculator.NextDay(day,mon,year);
        assertEquals(expected,result);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("case 31/12/2018")
    void TestDay31Month12Year2019() {
        int day = 31;
        int mon = 12;
        int year = 2018;
        String expected = "1-1-2019";
        String result = NextDayCalculator.NextDay(day,mon,year);
        assertEquals(expected,result);
    }
}