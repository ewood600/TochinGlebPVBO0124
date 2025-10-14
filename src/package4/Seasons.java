package package4;

public class Seasons {
    public static String fav_season = "Весна";

    public enum Seasons4 {
        Зима(-5),
        Весна(10),
        Лето(20),
        Осень(7);
        private final int temp;


        Seasons4(int temp) {
            this.temp = temp;
        }

    }


    public void myFav(Seasons4 season){
        switch (season){
            case Зима:
                System.out.println("Я люблю зиму");
                break;
            case Весна:
                System.out.println("Я люблю весну");
                break;
            case Лето:
                System.out.println("Я люблю лето");
                break;
            case Осень:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public static String getDescription(Seasons4 season){
        switch (season){
            case Зима:
                return "Холодное время года";
            case Весна:
            case Осень:
                return "Среднее по температуре время года";
            case Лето:
                return "Теплое время года";
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println(fav_season);
        System.out.println(10);
        System.out.println("Среднее по температуре время года");
        for (Seasons4 season1: Seasons4.values()){
            System.out.println(season1);
            System.out.println(season1.temp);
            System.out.println(getDescription(season1));
        }
    }
}
