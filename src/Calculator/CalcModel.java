/**
 * Demonstration of MVC pattern.
 *
 * CalcModel.java
 *
 * This represents the Model which is a representation of the data and its
 * state. This may also include logic, functions, business rules, etc.
 */
package Calculator;

public class CalcModel {

    // add two values
    public double addValues(double op1, double op2) {
        return op1 + op2;
    }

    // subtract two values
    public double subtractValues(double op1, double op2) {
        return op1 - op2;
    }

    // multiply two values
    public double multiplyValues(double op1, double op2) {
        return op1 * op2;
    }

    // divide two values
    public double divideValues(double op1, double op2) {
        return op1 / op2;
    }

}
