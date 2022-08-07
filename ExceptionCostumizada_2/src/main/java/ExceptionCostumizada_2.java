import javax.swing.*;

public class ExceptionCostumizada_2 {

    public static void main(String[] args) {
        int[] numerador = {4, 5, 8 , 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for(int i = 0; i < denominador.length; i ++){
            try{

                if(numerador[i] % 2 != 0)
                    throw  new DivisaoNaoExataExceptionClass
                            ("Divisão não exata!", numerador[i], denominador[i]);
                if(denominador[i] == 0) throw new DivisaoPorZeroExceptionClass
                        ("Impossivel dividir por 0!", numerador[i], denominador[i]);

            } catch (DivisaoNaoExataExceptionClass e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            catch (DivisaoPorZeroExceptionClass e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Não há mais numerador para dividir! " +
                        e.getMessage());
            }

        }

        System.out.println("O programa continua...");

    }//fim do main
}//fim da classe ExceptionCostumizada_2
