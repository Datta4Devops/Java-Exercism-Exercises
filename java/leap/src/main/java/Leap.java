class Leap {

    boolean isLeapYear(int year) {
        boolean isLeapYear = year % 4 == 0 && year % 100 != 0;

        if(year%400 == 0)    isLeapYear=true;

        return isLeapYear;
    }

}
