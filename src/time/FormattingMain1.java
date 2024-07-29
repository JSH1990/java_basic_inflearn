package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        //포멧팅 : 날짜를 문자로

        LocalDate date = LocalDate.of(2024,12,13);
        System.out.println(date);

        DateTimeFormatter fomatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String formattedDate = date.format(fomatter);

        System.out.println(formattedDate);

        //파싱 : 문자를 날짜로
        String input = "2024년 07월 29일";
        LocalDate parsed = LocalDate.parse(input, fomatter);
        System.out.println(parsed);
    }
}
