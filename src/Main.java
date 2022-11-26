public class Main {
    public static void main(String[] args) {
        //Часть 1
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

        //Часть 2
        // Домашнее задание 1
        //Задание 1
        System.out.println("Часть 2. Домашнее задание 1. Задание 1");
        deposit = 15000;
        sumTotal = 0;
        int i = 0;
        while (sumTotal <= 2_459_000) {
            sumTotal = sumTotal + sumTotal/100;
            sumTotal = sumTotal + deposit;
            i += 1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + sumTotal + " рублей");
        }
        //Задание 2
        System.out.println("Домашнее задание 1. Задание 2");
        i = 0;
        while (i <10) {
            i++;
            System.out.println(i);
        }
        for ( i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        //Задание 3
        System.out.println("Домашнее задание 1. Задание 3");
        int populationOfTheCountryY = 12_000_000;
        int born = 17;
        int death = 8;
        int diff = born - death;
        for (i = 1; i<=10; i++){
            populationOfTheCountryY += populationOfTheCountryY * diff/1000;
            System.out.println("Год " + i + " численность населения составляет " +populationOfTheCountryY);
        }
//Часть 2.
// Домашнее задание 2.
        deposit = 15000;
        sumTotal = 0;
        int percent = 7; // в месяц
// Задание 1
        System.out.println("Часть 2. Домашнее задание 2. Задание 1");
        i = 0;
        while (sumTotal < 12_000_000) {
            sumTotal = sumTotal + sumTotal*percent/100;
            sumTotal = sumTotal + deposit;
            i += 1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + sumTotal + " рублей");

        }
        // Задание 2
        System.out.println("Домашнее задание 2. Задание 2");
        deposit = 15000;
        sumTotal = 0;
        for (i = 1; sumTotal < 12_000_000; i ++) {
            sumTotal = sumTotal + sumTotal * percent / 100;
            sumTotal = sumTotal + deposit;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + sumTotal + " рублей");
            }
        }
        // Задание 3
        System.out.println("Домашнее задание 2. Задание 3");
        deposit = 15000;
        sumTotal = 0;
        percent = 7; // в месяц
        int time = 9 * 12;
        for (i = 1; i <= time; i ++) {
            sumTotal = sumTotal + sumTotal * percent / 100;
            sumTotal = sumTotal + deposit;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + sumTotal + " рублей");
            }
        }
        // Задание 4
        System.out.println("Домашнее задание 2. Задание 4");
        int friday = 5;
        int month = 31;
        for (; friday <= month; friday += 7){
            System.out.println("Сегодня пятница, " + friday + " число. Необходимо подготовить отчет.");
        }
        // Домашнее задание 3
        //Задание 1
        System.out.println("Часть 2. Домашнее задание 3. Задание 1");
        int year = 0;
        int nowYear = 2022;
        int startYear = nowYear - 200;
        int finishYear = nowYear + 100;
        int period = 79;
        while (year <= finishYear) {
            if (year >= startYear) {
                System.out.println(year);
            }
            year += period;
        }
        //Задание
        System.out.println("Домашнее задание 3. Задание 2");
        int number = 2;
        for (i = 1; i <=10; i ++){
            int result = number * i;
            System.out.println(+ number + " * " + i + " = " + result);
        }




    }
}