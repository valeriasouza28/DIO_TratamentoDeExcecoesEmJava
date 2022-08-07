public class DivisaoPorZeroExceptionClass extends Exception{

    private int numerador;
    private int denominador;

    public DivisaoPorZeroExceptionClass(String message, int numerador,  int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;

    }
}
