package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число");
        int num1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите второе число");
        int num2 = Integer.parseInt(reader.readLine());
        System.out.println("Введите знак");
        String sign = reader.readLine();
        switch (sign) {
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            default:
                System.out.println("Данный калькулятор поддерживает только +, -, * и /");
        }
    }
}
