public class InvalidPasswordException extends Exception {
    private String mensajeError;

    public InvalidPasswordException(String mensaje)
    {
        mensajeError = mensaje;
    }

    public String getMensajeError() {
        return mensajeError;
    }
}
