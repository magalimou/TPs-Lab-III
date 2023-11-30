public class InvalidCategoryException extends Exception
{

    private String mensajeError;

    public InvalidCategoryException(String mensaje)
    {
        mensajeError = mensaje;
    }

    public String getMensajeError() {
        return mensajeError;
    }


}
