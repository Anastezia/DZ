package com.company;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

       /* 1)Scanner scanner = new Scanner(System.in);
        String name=scanner.next();
        System.out.println("Hello "+name); */
       /* 2) Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split("\\s");
        System.out.println(Arrays.toString(s));
        for (int i = s.length - 1; i >= 0; --i) {
            System.out.println( s[i]); */
       /* 3) Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split("\\s");

        for (int i =0; i <s.length; i++) {
            System.out.println( s[i]+" ");

        }
        for (int i =0; i <s.length; i++) {
            System.out.print( s[i]+" ");
        }*/

       /* 4)System.out.println("Введите ваше имя и нажмите Enter:");

        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        scan.close();
        if (name.equals("Настя")) {
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Имя не правильное"); */
       /* 5) Scanner scan = new Scanner(System.in);

            int number1, number2;
            System.out.print("\nEnter 2 numbers:");
            number1 = scan.nextInt();
            number2 = scan.nextInt();
            System.out.print("\nSum of this numbers = " + (number1 + number2));
            System.out.print("\nComposition of this numbers = " + (number1 * number2)); */
       /* 6.1)  System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        if (size == 0) {
            System.out.print("Программа завершена.");
            System.exit(0);
        }
        Integer[] sourceNumbers = new Integer[size];
        System.out.print("Введите целые числа через пробел "
                + "и нажмите <Enter>: ");
        for (int i = 0; i < size; i++) {
            sourceNumbers[i] = in.nextInt();
        }
            for (int i = 0; i < sourceNumbers.length; i++)
            {
                if (i % 2 == 0)
                {
            System.out.println("нечетное: "+sourceNumbers[i] + " ");}

            else System.out.println("четное: "+sourceNumbers[i] + " "); */
       /* 6.2) System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        if (size == 0) {
            System.out.print("Программа завершена.");
            System.exit(0);
        }
        int max = 0;
        int min = 0;
        Integer[] sourceNumbers = new Integer[size];
        System.out.print("Введите целые числа через пробел "
                + "и нажмите <Enter>: ");
        for (int i = 0; i < size; i++) {
            sourceNumbers[i] = in.nextInt();
        }
        for (int i = 0; i < sourceNumbers.length; i++) {
            if (max < sourceNumbers[i]) max = sourceNumbers[i];
        }
        System.out.println("max= " + max);
        for (int i = 0; i < sourceNumbers.length; i++) {
            if ( sourceNumbers[i]<min) min = sourceNumbers[i];
        }

            System.out.println("min= " + min); */
       /* 6.3) Scanner in = new Scanner(System.in);
        System.out.println("введите размер массива");
        int l = in.nextInt();
        int[] arr = new int[l];
        System.out.println("введите масив");
        for (int i = 0; i < arr.length; i++)
            arr[i] = in.nextInt();
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            double a = arr[i] % 3;
            if (a == 0)
                System.out.println("деляться на 3: "+arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            double a = arr[i] % 9;
            if (a == 0)
                System.out.println("деляться на 9: "+arr[i] + " "); */
       /* 6.4) Scanner in = new Scanner(System.in);
        System.out.println("введите размер массива");
        int l = in.nextInt();
        int[] arr = new int[l];
        System.out.println("введите масив");
        for (int i = 0; i < arr.length; i++)
            arr[i] = in.nextInt();
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            double a = arr[i] % 5;
            if (a == 0)
                System.out.println("деляться на 5: "+arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            double a = arr[i] % 7;
            if (a == 0)
                System.out.println("деляться на 7: "+arr[i] + " "); */
      /*6.5)  Scanner scanner= new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int length=scanner.nextInt();
        int [] myArray=new int [length];
        System.out.println("Введите массив:");
        for (int i = 0; i <myArray.length; i++) {
            myArray[i]=scanner.nextInt();
            int partOfNumber1=myArray[i]%10;
            int intermediateNumber=myArray[i]/10;
            int partOfNumber2=intermediateNumber%10;
            int partOfNumber3=intermediateNumber/10;
            if (partOfNumber1!=partOfNumber2 && partOfNumber2!=partOfNumber3){
                System.out.println(myArray[i]); */
      /* 6.6)  Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String rightSide = s.substring(s.length() / 2);
        String leftSide = s.substring(0, s.length() / 2);
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < rightSide.length(); i++) {
            int partOfNumber = Integer.parseInt(rightSide.substring(i, i + 1));
            sum1 += partOfNumber;
        }
        for (int i = 0; i < leftSide.length(); i++) {
            int partOfSecondNumber=Integer.parseInt(leftSide.substring(i,i+1));
            sum2 +=partOfSecondNumber;
        }

        if (sum1 == sum2) {
            System.out.println("У вас счастливое число: "+s);
        }
        else System.out.println("У вас несчастливое число");*/

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length()) {
                int middleNumber = Integer.parseInt(s.substring(i + 1, i + 2));
                int leftNumber = Integer.parseInt(s.substring(i, i + 1));
                int rightNumber = Integer.parseInt(s.substring(i + 2, i + 3));
                int sum = leftNumber + rightNumber;
                if (middleNumber == sum) {
                    System.out.println(middleNumber);
                }
            }
        }
            }


        }























