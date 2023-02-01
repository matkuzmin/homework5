public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            default:
                System.out.println("Ваша OS не поддерживется");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int phoneAge = 2011;
        switch (clientOS) {
            case 1:
                if (phoneAge < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 0:
                if (phoneAge < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            default:
                System.out.println("Ваша OS не поддерживется");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2400;
        int vesYear = year % 4;
        int vesYear1 = year % 100;
        int vesYear2 = year % 400;
        if (vesYear == 0 && vesYear1 != 0) {
            System.out.println("Год високосный");
        } else if (vesYear1 == 0 && vesYear2 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней для доставки: " + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней для доставки: " + (deliveryTime + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней для доставки: " + (deliveryTime + 2));
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
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
