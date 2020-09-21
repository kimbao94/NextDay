public class NextDayCalculator {

//    public static final int LASTOFMONTH = 31;
    public static final int FIRSTOFMONTH = 1;

    public static String NextDay(int day, int mon, int year) {
        int outputday = day;
        int outputmon = mon;
        int outputyear = year;
        if (day == getLastofmonth(mon,year)) {
            if (mon == 12) {
                outputday = FIRSTOFMONTH;
                outputmon = 1;
                outputyear++;
            } else {
                outputday = FIRSTOFMONTH;
                outputmon++;
            }
        } else outputday++;
        return outputday + "-" + outputmon + "-" + outputyear;
    }

    private static int getLastofmonth(int mon,int year) {
        int LASTOFMONTH = 0;
        switch (mon){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return  31;
            case 2:
                return isLeapYear(year)?28:29;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
        }
        return LASTOFMONTH;
    }

    private static boolean isLeapYear (int inputYear) {
        if (inputYear % 4 == 0){
            if (inputYear % 100 == 0){
                if (inputYear % 400 == 0){
                    return true;
                }
                else
                    return false;
            }
            else
                return true;
        }
        else
            return false;
    }

}
