public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();

    }
    public static void task1(){
        System.out.println("");
        System.out.println("Exercise 1");
    int clientOS = 0;
    int iOS = 0;
    int android = 1;

    if (clientOS == iOS){
        System.out.println("Установите iOS систему");
    }else if (clientOS == android) {
        System.out.println("Установите Android систему");
    } else {
        System.out.println("У тебя нет телефона, иди купи телефон");
    }
    }
    public static void task2(){
        System.out.println(" ");
        System.out.println("Exercise 2");
        int clientDeviceYear = 2015;
        int clientOS = 0;
        int iOS = 0;
        int android = 1;
        int clientDeviceYearIOS = 2014;
        int clientDeviceYearAndroid = 2016;

        if(clientOS == iOS && clientDeviceYear >= clientDeviceYearIOS){
            System.out.println("Установите облегченную версию iOS");
        } else if(clientOS == android && clientDeviceYear >= clientDeviceYearAndroid){
            System.out.println("Установите облегченную версию android");
        } else if (clientOS == iOS && clientDeviceYear <= clientDeviceYearIOS){
            System.out.println("Установите обычную версию iOS");
        } else {
            System.out.println("Установите обычную версию android");
        }

    }
    public static void task3(){
        System.out.println(" ");
        System.out.println("Exercise 3");
        int year = 2021;

       if(year % 4 == 0 && year % 100 != 0 && year % 400 == 0 ){
           System.out.println(year + " год является высокосным");
       } else {
           System.out.println(year + " год не является высокосным");
       }
    }
    public static void task4(){
        System.out.println(" ");
        System.out.println("Exercise 4");
        int deliveryDistance = 95;

        if( deliveryDistance < 20) {
            System.out.println("Потребуется день" );
        } else if (deliveryDistance >= 20 && deliveryDistance <60){
            System.out.println("Потребудется два дня");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100){
            System.out.println("Потребудется три дня");
        } else {
            System.out.println("Карта не доставляется");
        }
    }
    public static void task5(){
        System.out.println(" ");
        System.out.println("Exercise 5");
        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("такого месяца не существует");
        }
    }
}