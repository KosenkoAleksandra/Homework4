public class Main {
    public static void main(String[] args) {
        // Домашнее задание 1
        //Задание 1
        System.out.println("Задание 1");
        for ( int i = 1; i <= 10; i++){
            System.out.println("Итерация цикла " +i);
        }

        // Задание 2
        System.out.println("Задание 2");
        for ( int i = 10; i >= 1; i--){
            System.out.println("Итерация цикла " +i);
        }

        // Задание 3
        System.out.println("Задание 3");
        for ( int i = 0; i <= 17; i += 2){
            System.out.println("Итерация цикла " +i);
        }

        // Задание 4
        System.out.println("Задание 4");
        for ( int i = 10; i >= -10; i --){
            System.out.println("Итерация цикла " +i);
        }

        // Домашнее задание 2
        //Задание 1
        System.out.println("Задание 1");
        for ( int i = 1904; i < 2096; i += 4){
            System.out.println(i + " год является високосным");
        }

        // Задание 2
        System.out.println("Задание 2");
        for ( int i = 7; i <= 98; i += 7){
            System.out.println(i);
        }

        // Задание 3
        System.out.println("Задание 3");
        System.out.println("1");
        for (int i = 2; i <= 512; i *= 2){
            System.out.println(i);
        }
        // Домашнее задание 3
        //Задание 1
        System.out.println("Задание 1");
        int savings = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + savings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

        //Задание 2
        System.out.println("Задание 2");
        int deposit = 29000;
        int sumTotal = 0;
        for (int i = 1; i <= 12; i++) {
            sumTotal = sumTotal + sumTotal/100;
            sumTotal = sumTotal + deposit;
            System.out.println("Месяц " + i + " сумма накоплений равна " + sumTotal + " рублей");
        }
    }
}