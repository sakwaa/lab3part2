
package Calculator;

import java.awt.event.*;

public class CalcController {

    // There is a reference to both the view and the model
    private static CalcView view = new CalcView();
    private static CalcModel model = new CalcModel();

    public static void main(String[] args) {
        /**
        * Create and set the listeners to the view
        */
        // Addition
        view.setAddListener ( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setResult( model.addValues ( view.getOperand1(), view.getOperand2()) );
            }
        });

        // Subtraction
        view.setSubtractListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setResult(
                    model.subtractValues(
                        view.getOperand1(),
                        view.getOperand2()) 
                    );
                }
            }
        );
        
        // Multiplication
        view.setMultiplyListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setResult(
                    model.multiplyValues(
                        view.getOperand1(),
                        view.getOperand2()) 
                    );
                }
            }
        );
        
        // Multiplication
        view.setDivideListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(view.getOperand2() == 0) {
                    view.resultText.setText("Err");
                } else {
                    view.setResult(
                        model.divideValues(
                            view.getOperand1(),
                            view.getOperand2()) 
                        );
                    }
                }
            }
        );
    }
    
    CalcController controller = new CalcController();
};
