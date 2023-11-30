package modelo;

public class Cliente {

    private String nombre;
    private int dni;
    private int tipoCliente;
    private int medioPago;

    public Cliente(String nombre, int dni, int tipoCliente, int medioPago)
    {
        this.nombre = nombre;
        this.dni = dni;
        this.tipoCliente = tipoCliente;
        this.medioPago = medioPago;
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getMedioPago() {
        return medioPago;
    }

    public int getTipoCliente() {
        return tipoCliente;
    }
}
