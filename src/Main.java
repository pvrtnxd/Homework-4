public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOS = 0; // 0 — iOS, 1 — Android
        if ( clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 ) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание 2");
        int clientDeviceYear = 2010;
        if (clientDeviceYear < 2015 && clientOS == 0 ) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установить приложение");
        }

        System.out.println("Задание 3");

        int year = 2025;
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0 ) || (year % 400 == 0));
        if (leapYear) {
            System.out.println( year + " - високосный год");
        } else {
            System.out.println( year + " - не високосный год");
        }

        System.out.println("Задание 4");

        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance < 20) {
            System.out.println("Доставка в течении суток");
        } else if (deliveryDistance >= 20 && deliveryDistance <60) {
            System.out.println("Потрбуется дней: " + (deliveryDays + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance <100)
        {
            System.out.println("Потрбуется дней: " + (deliveryDays + 2));
        } else {
            System.out.println("Потрбуется дней: " + (deliveryDays + 3 ));
        }

        System.out.println("Задание 5");
        int monthNumber = 10;
        String season;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2: season = "winter";
            break;

            case 3:
            case 4:
            case 5: season = "spring";
            break;

            case 6:
            case 7:
            case 8: season = "summer";
            break;

            case 9:
            case 10:
            case 11: season = "autumn";
            break;

            default: season = "В году 12 месяцев";

        }
        System.out.println(season);


    }
}