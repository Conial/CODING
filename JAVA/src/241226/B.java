import java.util.Calendar;

public class B {
    public static void main(String[] args) {
        for(int i = 0; i < 7; i++) {
            System.out.println();
        }
        Week today = null;

        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);
        
        switch(week) {
            case 1:
                today = Week.SUN; break;
            case 2:
                today = Week.MON; break;
            case 3:
                today = Week.TUE; break;
            case 4:
                today = Week.WED; break;
            case 5:
                today = Week.THU; break;
            case 6:
                today = Week.FRI; break;
            case 7:
                today = Week.SAT; break;
        }
        
        System.out.print(today + " | ");

        switch(week) {
            case 1:
                System.out.println("오늘은 나른한 일요일 （*´▽`*)"); break;
            case 2:
                System.out.println("오늘은 화나는 월요일 (ノಠ益ಠ)ノ彡┻━┻"); break;
            case 3:
                System.out.println("오늘은 힘든 화요일 (￣□￣」)"); break;
            case 4:
                System.out.println("오늘은 맑은 수요일 ❀◕ ‿ ◕❀"); break;
            case 5:
                System.out.println("오늘은 유달리 피곤한 목요일 ヽ(ｏ`皿′ｏ)ﾉ"); break;
            case 6:
                System.out.println("오늘은 즐거운 금요일 ﾟ.+(〃ﾉωﾉ)ﾟ.+°"); break;
            case 7:
                System.out.println("오늘은 불태우는 토요일 ヽ(≧◡≦)八(o^ ^o)ノ"); break;
        }

        int Y = cal.get(Calendar.YEAR);
        int M = cal.get(Calendar.MONTH) + 1;
        int D = cal.get(Calendar.DAY_OF_MONTH);
        System.out.printf("%d. %2d. %2d", Y, M, D);

        for(int i = 0; i < 7; i++) {
            System.out.println();
        }
    }
    
}

