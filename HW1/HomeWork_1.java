// Задание
// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// 2) Вывести все простые числа от 1 до 1000
// 3) Реализовать простой калькулятор
// 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут
// быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до
// верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

package HW1;

import java.util.Scanner;

public class HomeWork_1 {
    static Scanner iScanner = new Scanner(System.in);

    // 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    public static void factorial() {
        System.out.print("Введите n: ");
        int n = Integer.parseInt(iScanner.nextLine());
        System.out.printf("Треугольного число n!: %d\n", n * (n + 1) / 2);
        System.out.println();
    }

    // 2) Вывести все простые числа от 1 до 1000
    public static void simple() {
        System.out.printf("Простые числа от 1 до 1000: ");
        for (int i = 2; i < 1000; i++) {
            boolean flag = false;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) System.out.printf("%d ", i);
        }
        System.out.println();
    }

    // 3) Калькулятор
    public static void calc() {
        System.out.println("Введите строку в формате A ? B. Где ? это опирации: +, -, *, /. Для выхода введите q.");
        while (true) {
            String[] str = iScanner.nextLine().split(" ");
            if (str[0].equals("q")) break;
            float a = Float.parseFloat(str[0]);
            float b = Float.parseFloat(str[2]);
            float result = 0;
            String operation = str[1];
            switch (operation) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
            }

            if (result - (int)result < 0.000000001) 
                System.out.printf("= %d\n", (int)result);
            else
                System.out.printf("= %f\n", result);
        }
    }
    
    public static void main(String[] args) {
        
        while (true) {
            System.out.println("1. Вычислить n-ое треугольное число");
            System.out.println("2. Вывести все простые числа от 1 до 1000");
            System.out.println("3. Калькулятор");
            System.out.println("0. Выход");
            System.out.print("Выберете задачу: ");
            int key = Integer.parseInt(iScanner.nextLine());
            switch (key) {
                case 0:
                    System.out.print("Завершение программы");                    
                    System.exit(0);
                case 1:
                    factorial();
                    break;
                case 2:
                    simple();
                    break;
                case 3:
                    calc();
                    break;
            }
        }

    }
}