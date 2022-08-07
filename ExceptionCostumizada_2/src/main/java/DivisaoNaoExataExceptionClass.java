public class DivisaoNaoExataExceptionClass extends Exception{

    private int numerador;
    private int denominador;

    public DivisaoNaoExataExceptionClass(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
