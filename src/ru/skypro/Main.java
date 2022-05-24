package ru.skypro;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    static void lecture() {
        int salary = 65_535;
        int total = 0;
        int i = 0;
        for (; total < 1_000_000; i++) {
            total += total * 0.01;
            total += salary;
            if (i % 5 == 0)
                System.out.println("Месяц " + i + " Итого " + total);
        }
        System.out.println(total);
        System.out.println(i);
    }

    static void task1() {
        int counter = 1;
        while (counter <= 10) {
            System.out.print(counter++ + " ");
        }
        System.out.println();

        for (; counter > 1; ) {
            System.out.print(--counter + " ");
        }
        System.out.println();
    }

    static void task2() {
        int numberFriday = 5;
        for (int Friday = numberFriday; Friday <= 31; Friday += 7) {
                System.out.println("Сегодня пятница, " + Friday + "-е число. Необходимо подготовить отчет.");
            }
        }

    static void task3() {
        int currentYear = 2022;
        int start = currentYear - 200;
        int end = currentYear + 100;

        for (int year = start; year < end; year++) {
            if (year % 79 == 0){
                System.out.println(year);
                }
            }
        }

    static void task4() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
            } else if (i % 3 == 0) {
                System.out.println(i + ": ping");
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
            } else {
                System.out.println(i + ":");
            }
        }
    }
    static void task5() {
        int number1 = 0;
        int number2 = 1;
        for (int i = 0; i < 10; i++) {
               if (i == 0){
                   System.out.print(number1 + " ");
                   continue;
               } else if (i == 1){
                   System.out.print(number2 + " ");
                   continue;
               }
               int number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
            System.out.print(number3 + " ");
           }
        }
    }
