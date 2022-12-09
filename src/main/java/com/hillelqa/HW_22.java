package com.hillelqa;
import java.util.Scanner;

public class HW_22 {
    public static void main(String[] args) {

        final int MAX_NUMBER = 100;
        arithmeticSum(MAX_NUMBER);
        numberChoiceOperatorIf();
        numberChoiceOperatorSwitch();
        numberOutput();
        multiplicationTable();
        arithmeticSumSecond();

    }

    public static void arithmeticSum(int maxNumber) {
        int result = 0;
        for ( int i = 1; i <= maxNumber; i++){
            result += i;
            }
        System.out.println("Значение среднего арифметического равна:" + result / maxNumber);
        }
    public static void numberChoiceOperatorIf(){
        /* Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:
      1, 2 или 3, а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3.
      Написать двумя способами. If и switch.      */
        System.out.println("Введите число 1, 2 или 3: ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt ();
        if (i==1) {
            System.out.println("Вы ввели число 1");
        } else if (i==2) {
            System.out.println("Вы ввели число 2");
        } else if (i==3) {
            System.out.println("Вы ввели число 3");
        }
        else {
            System.out.println("Вы ввели число не равное 1, 2 или 3");
         }
        }
        public static void numberChoiceOperatorSwitch( ){
        System.out.println("Введите число 1, 2 или 3: ");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        switch (number) {
            case 1:
                System.out.println("Вы ввели число 1");
                break;
            case 2:
                System.out.println("Вы ввели число 2");
                break;
            case 3:
                System.out.println("Вы ввели число 3");
                break;
            default:
                System.out.println("Вы ввели число не равное 1, 2 или 3");
            }
        }
        public static void numberOutput() {
          /*Необходимо вывести на экран числа от 5 до 1. На экране должно быть:
      5 4 3 2 1*/
            for (int i = 5; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }

        public static void multiplicationTable() {
       /* Необходимо вывести на экран таблицу умножения на 3:
        3*1=3
        3*2=6
        3*3=9
        3*4=12
        3*5=15
        3*6=18
        3*7=21
        3*8=24
        3*9=27
        3*10=30*/
        for (int i = 1; i <= 10; i++) {
            System.out.println("3*" + i + "=" + 3 * i);
            }
        }
         public static void arithmeticSumSecond() {

             // Найти среднее арефметическое суммы чисел от 1 до 100*/
             int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
             int result = 0;
             for (int x : num) {
                 result += x;
             }
             System.out.println("Значение среднего арифметического равна:" + result / num.length);
         }

}

