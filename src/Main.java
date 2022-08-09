

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    //Домашнее задание №4
    // Задание №1
    public static void task1() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println( "\n");

        for (int j = 10; j > 0 ; j--) {
            System.out.print( j + " ");
        }
        System.out.println("\n");
    }

    //Заадание №2
    public static void task2() {
        for (int i = 5; i < 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println("\n");
    }

    // Задание №3
    public static void task3() {
        for (int i = 1822; i < 2122 ; i++) {
            if (i%79==0) {
                System.out.println(i);
            }
        }
        System.out.println("\n");
    }

    // Здание №4
    public static void task4() {

        int i = 0;
        while (i < 20) {
            i++;
        if (i%3==0 && i%5==0)
            System.out.println(i + ": ping pong");
        else if (i%5==0)
            System.out.println(i + ": pong");
        else if (i%3==0 )
            System.out.println(i +": ping");
        if ((i%3==0) || (i%5==0)) continue; System.out.println(i + ":");
        }
        System.out.println("\n");
    }

    // Задание №5
    public static void task5() {
        int a = 0;
        int b = 1;
        int sum;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= 10; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }
    }
}