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
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void task2() {
        int a = 6;
        for (int i = 0; i < 31; i++) {
            if (i == a) {
                System.out.println("Сегодня пятница, " + a + " число. Необходимо подготовить отчет.");
                a += 7;
            }
        }
    }

    static void task3() {
        int start = 1822;
        int end = 2122;
        int comet = 79;
        int counter = 0;

        for (int i = 0; i < end; i++) {
            if (i == comet) {
                comet += 79;
            }
            if (comet >= start && comet <= end) {
                if (counter == comet) {
                    continue;
                } else {
                    counter = comet;
                    System.out.println(counter);
                }
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
        int a = 0;
        int b = 1;
        for (int i = 0; i < 10; i++) {
               if (i == 0){
                   System.out.print(a + " ");
                   continue;
               } else if (i == 1){
                   System.out.print(b + " ");
                   continue;
               }
               int с = a + b;
               a = b;
               b = с;
            System.out.print(с + " ");
           }
        }
    }
