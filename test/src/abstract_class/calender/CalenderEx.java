package abstract_class.calender;

import java.util.Calendar;

public class CalenderEx {
    private int year, month;
    private String[] day = {"일", "월", "화", "수", "목", "금", "토"};
    private Calendar calendar = Calendar.getInstance();
    private int daysOfMonth;

    public CalenderEx(int year, int month) {
        this.year = year;
        this.month = month - 1; // 1월의 값이 0부터 스타또
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, this.month);
        this.daysOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    public void calc() {
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println(year + "년도 " + (month + 1) + "월 1일의 요일은 " + dayOfWeek(calendar.get(Calendar.DAY_OF_WEEK))+"요일입니다.");
        System.out.println("이번달의 마지막 일은 " + daysOfMonth + "일입니다.");
    }

    public String dayOfWeek(int week) {
        return day[week - 1];
    }

    public void display() {
        for (String str : day) {
            System.out.printf("%-4s", str);
        }
        System.out.println();

        calendar.set(Calendar.DAY_OF_MONTH, 1);
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);


        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("     ");
        }

        for (int day = 1; day <= daysOfMonth; day++) {
            System.out.printf("%-4d", day);
            if ((day + firstDayOfWeek - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
