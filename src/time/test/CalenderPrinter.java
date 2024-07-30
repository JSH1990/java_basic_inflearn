package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class CalenderPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("년도 입력");
        int year = sc.nextInt();

        System.out.println("월 입력");
        int month = sc.nextInt();

        printCalender(year, month);
    }

    private static void printCalender(int year, int month) {
        LocalDate firstDayofMonth = LocalDate.of(year, month, 1); //#6
        System.out.println(firstDayofMonth);
        LocalDate firstDayOfNextMonth = firstDayofMonth.plusMonths(1); //#1
        System.out.println(firstDayOfNextMonth);

        int offsetWeekDays = firstDayofMonth.getDayOfWeek().getValue() % 7; //#4 띄어주는거
        System.out.println(offsetWeekDays);

        System.out.println("su mo tu we th fr sa"); //#5
        for(int i = 1; i <= offsetWeekDays; i++) { //#4
            System.out.print("   ");
        }

        LocalDate dayIterator = firstDayofMonth;
        while(dayIterator.isBefore(firstDayOfNextMonth)) { // #1
            System.out.printf("%2d ", dayIterator.getDayOfMonth()); //#2
            if(dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY){ //#3
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1); //#1 1일씩 증가 시키면서 날짜를 반복문으로 돌리고, 토요일이면 줄바꿈하도록함
        }
    }
}
