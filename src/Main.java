import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2021;
        byte clientOS = 0;
        int clientDeviceYear = 2024;
        int deliveryDistance = 46;
        checkYear(year);
        printOsAndVersionApp(clientOS, clientDeviceYear);
        printNumberDays(deliveryDistance);
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

    public static void printNumberDays(int deliveryDistance) {
        System.out.println("Вывести количество дней");
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
    }

}