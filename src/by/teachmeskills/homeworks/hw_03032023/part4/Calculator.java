package by.teachmeskills.homeworks.hw_03032023.part4;

public class Calculator {
    private double operand1;
    private double operand2;

    public Calculator(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public void sum() {
        System.out.println("Сумма = " + (operand1 + operand2));
    }

    public void multiplication() {
        System.out.println("Произведение = " + operand1 * operand2);
    }

    public void division() {
        System.out.println(operand2 > 0 ? "Деление = " + operand1 / operand2 : "На ноль делить нельзя!");
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(7, 25);
        calculator.sum();
        calculator.multiplication();
        calculator.division();
    }
}
