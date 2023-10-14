package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if( month < 1 || month > 12){
            System.out.println("wrong number!");
        }else{
            if( month == 12 || month == 1 || month == 2){
                System.out.println("Winter");
            }
            if( month >= 3 && month<= 5){
                System.out.println("Spring");
            }
            if( month > 5 && month < 9){
                System.out.println("Summer");
            }
            if( month > 8){
                System.out.println("Fall");
            }
        }

    }
}
