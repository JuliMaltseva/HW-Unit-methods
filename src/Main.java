import java.time.LocalDate;

public class Main {


    public static void printIsALeapYear(int year) {
        boolean leapYear = isALeapYear(year);
        printIsALeapYearResult(year, leapYear);
    }

    public static boolean isALeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printIsALeapYearResult(int year, boolean leapYear) {
        if (leapYear) {
            System.out.println("Год " + year + " является високосным");
        } else {
            System.out.println("Год " + year + " не является високосным");
        }
    }

    public static void printVersionToDownload(byte clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        byte iOS = 0;
        if (clientOS == iOS) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static boolean isDeliveryOneDay(int distanceClient, int distanceOneDay) {
        return distanceClient < distanceOneDay;
    }

    public static boolean isIncorrectDistance(int distanceClient) {
        int circumferenceOfTheEarth = 40_075;
        return distanceClient < 0 || distanceClient > circumferenceOfTheEarth;
    }

    public static void printHowLongWillDeliveryTakeResult(boolean deliveryOneDay, boolean incorrectDistance, int distanceClient, int distanceOneDay, int plusOneDayDeliveryIfAdded) {
        int day = 1;
        if (deliveryOneDay) {
            int deliveryTimeOneDay = day;
            System.out.println("Доставка в пределах 20 км занимает " + deliveryTimeOneDay + " день.");
        } else if (incorrectDistance) { // вариант кода с контролем корректности ввода расстояния
            System.out.println("Введено некорректное расстояние.");
        } else {
            int deliveryTime = day + (distanceClient + distanceOneDay) / plusOneDayDeliveryIfAdded;
            System.out.println("Для доставки потребуется " + deliveryTime + " дней.");
        }
    }


    public static void main(String[] args) {

//Задание 1
        System.out.println("Задача 1");
        int year = 2020;
        printIsALeapYearResult(year, isALeapYear(year));

//Задание 2
        System.out.println("Задача 2");

        byte clientOS = 0;
        int clientDeviceYear = 2019;
        printVersionToDownload(clientOS, clientDeviceYear);

//Задание 3
        System.out.println("Задача 3");
        int distanceClient = 95;
        int distanceOneDay = 20;
        int plusOneDayDeliveryIfAdded = 40;

        printHowLongWillDeliveryTakeResult(isDeliveryOneDay(distanceClient, distanceOneDay), isIncorrectDistance(distanceClient), distanceClient, distanceOneDay, plusOneDayDeliveryIfAdded);

    }
}