import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1");
        checkYear(2023);
        System.out.println("Задача № 2");
        getDeviceLink(1, 2005);
        System.out.println("Задача № 3");
        int deliveryDistance = deliveryDistanceDay(60);
        System.out.println("Доставка будет в течении " + (deliveryDistance) + " дней");
    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным " + year);
        } else {
            System.out.println("Год не является високосным");
        }
    }

    public static void getDeviceLink(int clientOs, int clientDevaceYear) {
        int clientDeviceYear = 2015;
        int currentYear = LocalDate.now().getYear();
        if (clientOs == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs != 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int deliveryDistanceDay (int diliveryDistance) {
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка будет в течении " + day + " дня");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Доставка будет в течении " + (day + 1) + " дней");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Доставка будет в течении " + (day + 2) + " дней");
            }
    }
}
