package com.example.Calculator.domain;

public class Operation {
    private int num1;
    private int num2;
    private String operator;
    private double result;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getResult() {
        switch (operator) {
            case "addition":
                return num1 + num2;
            case "subtraction":
                return num1 - num2;
            case "multiplication":
                return num1 * num2;
            case "division":
                if (num2 != 0) {
                    return (double) num1 / num2;
                } else {
                    throw new ArithmeticException("Cannot divide by zero");
                }
            case "modulus":
                return num1 % num2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
