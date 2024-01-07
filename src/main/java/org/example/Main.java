package org.example;

/**
 * @author Vinod John
 * @Date 07.01.2024
 */
public class Main {
    public static void main(String[] args) {
       Calculator calculator = new Calculator();
       float result = calculator.addTwoNumbers(3.5f, 5);
       System.out.println(result);
    }
}