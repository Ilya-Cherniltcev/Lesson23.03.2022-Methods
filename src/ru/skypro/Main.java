package ru.skypro;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1 ===================================================================
        int testYear = 2020;
        boolean check = isYearLeap(testYear);
        if (check) {
            System.out.println("Год " + testYear + " - високосный!");
        } else {
            System.out.println("Год " + testYear + " - невисокосный");
        }
        System.out.println("---------------------------");
// Задача 2 ===================================================================
        int os = 1;
        int year = 2022;
        int version = whatVersionApp(os, year);
        switch (version) {
            case 6:
                System.out.println("К сожалению Ваш клиент не поддерживается");
                break;
            case 3:
                System.out.println("Год выпуска устройства ошибочен!");
                break;
            case 1:
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
                break;
            case 11:
                System.out.println("Установите  версию приложения для Android");
                break;
            case 2:
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
                break;
            case 12:
                System.out.println("Установите  версию приложения для IOS");
                break;
        }
        System.out.println("---------------------------");
// Задача 3 ===================================================================
        int distance = 90;
        int whatDays = whatTimeDelivery(distance);
        switch (whatDays) {
            case 0:
                System.out.println("Значение вне условий задачи");
                break;
            default:
                System.out.println("Потребуется дней: " + whatDays);
        }
        System.out.println("---------------------------");
// Задача 4 ===================================================================
        String tempString = "sstttgggbbbmmm";
        char tempArray[] = tempString.toCharArray();
        Arrays.sort(tempArray);
        StringBuilder tStr = new StringBuilder();
        for (int i = 0; i < tempArray.length; i++) {
            tStr.append(tempArray[i]);
        }
        tempString = tStr.toString();
        findDouble(tempString);
        System.out.println("---------------------------");
// Задача 5 ===================================================================
        int [] arr = {5, 4, 3, 2, 1, 0};
        System.out.println("Первоначальный массив: " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Массив после преобразования: " + Arrays.toString(arr));
    }
// =============== метод к задаче 1 =========================================
    public static boolean isYearLeap(int year) {
        boolean reallyLeap = ((year % 4) == 0 && (year % 100) != 0) || (year % 400 == 0);
        return reallyLeap;
    }
// =============== метод к задаче 2 =========================================
    public static int whatVersionApp(int clientOS, int clientDeviceYear) {
        int thisYear = 2022;
        if (clientOS != 0 && clientOS != 1) {
            return 6;
        }
        if (clientDeviceYear > thisYear) {
            return 3;
        }
        int b;
        if (clientOS == 1) {
            b = 1;
        }
        else {
            b = 2;
        }
        if (clientDeviceYear == thisYear) {
            b += 10;
        }
        return b;
    }
// =============== метод к задаче 3 =========================================
    public static int whatTimeDelivery(int deliveryDistance) {
        int deliveryDays = 0;
        if (deliveryDistance > 100 || deliveryDays < 0) {
            return deliveryDays;
        }
        deliveryDays += 1;
        if (deliveryDistance >= 60) {
            deliveryDays += 1;
        }
        return deliveryDays;

    }
// =============== метод к задаче 4 =========================================
    public static void findDouble(String sortedString) {
        System.out.println("Строка: " + sortedString);
        for (int i = 0; i < sortedString.length()-1; i++) {
            if (sortedString.charAt(i) == sortedString.charAt(i + 1)) {
                System.out.println("Присутствует дубль: " + sortedString.charAt(i));
                return;
            }
            }
        System.out.println("В строке нет дублей");
        }

    // =============== метод к задаче 5 =========================================
    public static void reverseArray(int[] arr2) {
        int f = arr2.length - 1;
        int tempElement;
        for (int i = 0; i <= f; i++) {
            tempElement = arr2[f];
            arr2[f] = arr2[i];
            arr2[i] = tempElement;
            f--;
        }
    }

}