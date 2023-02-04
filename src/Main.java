import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        char clientOS = 0;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2() {
        char clientOS = 1;
        char clientDeviceYear = 2015;
        if (clientOS == 0){
        if(clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        }else if(clientOS == 1) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }
    public static void task3() {
        int year = 2016;

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }
    }
    public static void task4() {
        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней " + deliveryDays);
        }

    public static void task5() {
        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");

        }
    }


}