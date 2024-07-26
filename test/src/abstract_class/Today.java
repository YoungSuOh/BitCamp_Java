package abstract_class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Today {
    public static void main(String[] args) throws InterruptedException, ParseException {
/*        Date date = new Date();  // 딱 정해진 시간을 가져옴
        System.out.println("오늘 날짜 ; "+date);

        SimpleDateFormat dateFormat = new SimpleDateFormat("y년 MM월 ddd일 HH시 mm분 SS초"); // SimpleDateFormat 으로 형식을 지정해줄 수 있음
        System.out.println("오늘 날짜 ; "+dateFormat.format(date));

        // 내 생일
        Scanner scanner =new Scanner(System.in);
        SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHH");


        System.out.print("(생일 날짜 입력 (yyyyMMddHH) : ");
        String birth = scanner.next();

        Date birthDate = input.parse(birth);
        System.out.println("내 생일 : "+birthDate);
        System.out.println("내 생일 : "+dateFormat.format(birthDate));
        System.out.println();*/

        //Calendar calendar = new GregorianCalendar();  // subclass 이용
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);  // YEAR은 실제로 1임 => 상수화했다
        /*int year = calendar.get(1);*/
        int month = calendar.get(Calendar.MONTH)+1;  // 1월 -0, 2월 -1 like index
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int week = calendar.get(Calendar.DAY_OF_WEEK);  // 요일
        String weekofDay = null;
        switch (week){
            case 1:
                weekofDay="일요일"; break;
            case 2:
                weekofDay="월요일"; break;
            case 3:
                weekofDay="화요일"; break;
            case 4:
                weekofDay="수요일"; break;
            case 5:
                weekofDay="목요일"; break;
            case 6:
                weekofDay="금요일"; break;
            case 7:
                weekofDay="토요일"; break;
        }
        System.out.println(year+"년 "+month+"월 "+day+"일 "+weekofDay+"\n"+
                calendar.get(Calendar.HOUR_OF_DAY)+" : "+
                calendar.get(Calendar.MINUTE)+ " : "+
                calendar.get(Calendar.SECOND));
    }

}
