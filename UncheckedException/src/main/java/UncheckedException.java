import javax.swing.*;
//fazer divisão de dois valores inteiros
public class UncheckedException {

    public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador");
            String b = JOptionPane.showInputDialog("Denominador");

            try {

                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Entrada inválida, informe um número inteiro" + e.getMessage());

                e.printStackTrace();
            } catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null,
                        "Impossível dividir número  por 0! " + e.getMessage());
            }
            finally {
                System.out.println("Chegou no finally!");
            }
        }while (continueLooping);


        System.out.println("O código continua ... ");
    }// fim do main

    public static int dividir(int a, int b){ return a / b;}
}// fim da classe UncheckedException
