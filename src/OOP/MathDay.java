package OOP;

public class MathDay extends Capitalize implements Initialization{
    private final String WEEKDAY = "week day";
    private final String HOLIDAY = "holiday";
    private String expression;


    public void setKindOfDay(){
        this.expression = initialisation();

        String[] weekDayArr = getArrayWeekDay();
        String[] holidayDayArr = getArrayHolidayDay();

        if(isWeekDay(weekDayArr)){
            System.out.println("You should work");
        }else if(isHolidayDay(holidayDayArr)){
            System.out.println("Wish you inspiring weekend");
        }else {
            System.out.println("You enter incorrect data");
        }
    }

    @Override
    public String initialisation(){
        return Initialization.super.initialisation();
    }
    @Override
    public String capitalize(String str){
        return super.capitalize(expression);
    }

    public boolean isWeekDay(String[] arr){
        String kindOfDay = WEEKDAY;

        return walkThroughArray(arr, kindOfDay);
    }

    public boolean isHolidayDay(String[] arr){
        String kindOfDay = HOLIDAY;

        return walkThroughArray(arr, kindOfDay);
    }

    public boolean walkThroughArray(String[] arr, String kindOfDay){
        boolean result = false;

        for (int i = 0; i < arr.length; i++) {
            result = true;

            if (arr[i].equals(expression)) {
                System.out.println(capitalize(expression) + " is a " +kindOfDay);
                break;
            } else if (arr[i].toLowerCase().equals(expression)) {
                System.out.println(capitalize(expression) + " is a " +kindOfDay);
                break;
            } else if (arr[i].toUpperCase().equals(expression)) {
                System.out.println(capitalize(expression) + " is a " +kindOfDay);
                break;
            } else {
                result = false;
            }
        }

        return result;
    }

    public String[] getArrayWeekDay() {
        WeekDay day1 = WeekDay.MONDAY;
        WeekDay day2 = WeekDay.TUESDAY;
        WeekDay day3 = WeekDay.WEDNESDAY;
        WeekDay day4 = WeekDay.THURSDAY;
        WeekDay day5 = WeekDay.FRIDAY;

        String[] weekDayArr = {day1.getReadableName(), day2.getReadableName(), day3.getReadableName(),
                day4.getReadableName(), day5.getReadableName()};

        return weekDayArr;
    }

    public String[] getArrayHolidayDay() {
        WeekDay day6 = WeekDay.SATURDAY;
        WeekDay day7 = WeekDay.SUNDAY;

        String[] holidayDayArr = {day6.getReadableName(), day7.getReadableName()};

        return holidayDayArr;
    }

}
