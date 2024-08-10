import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2021;
        byte clientOS = 0;
        int clientDeviceYear = 2024;
        int deliveryDistance = 46;
        checkYear(year);
        printOsAndVersionApp(clientOS, clientDeviceYear);
        int deliveryDays = printNumberDays(deliveryDistance);
        System.out.println("Потребуется дней доставки " + deliveryDays);
    }

    public static void checkYear(int year) {
        System.out.println("Определить високосный год");
        if (year % 400 == 0 && year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();
    }

    public static void printOsAndVersionApp(byte clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        System.out.println("Определить ОС и версию приложения");
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
        System.out.println();
    }

    public static int printNumberDays(int deliveryDistance) {
        int deliveryTime;
        if (deliveryDistance <= 20) {
            deliveryTime = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
        } else {
            deliveryTime = -1;
        }
        return deliveryTime;
    }

}