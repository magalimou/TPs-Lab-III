public class SaldoInsuficienteException extends Exception
{
    private String mensajeError;

    public SaldoInsuficienteException(String mensaje)
    {
        mensajeError = mensaje;
    }

    public String getMensajeError() {
        return mensajeError;
    }

}
