package ru.netology;

public class IntsCalculator implements Ints {
    Calculator calculator = new Calculator();

    @Override
    public int sum(int arg0, int arg1) {
        double sumResult = calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
        return (int) sumResult;
    }

    @Override
    public int mult(int arg0, int arg1) {
        double multResult = calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
        return (int) multResult;
    }

    @Override
    public int pow(int a, int b) {
        double powResult = calculator.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
        return (int) powResult;
    }
}
