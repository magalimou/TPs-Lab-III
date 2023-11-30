package Ejercicio6;

public class Cliente {

    private String nombre;
    private String domicilio;
    private long cuit;
    private Factura[] facturas;
    private  int validosFactura;
    private double totalSinDescuento;

    public Cliente()
    {
        nombre = "";
        domicilio = "";
        cuit = 0;
        facturas = new Factura[100];
        validosFactura = 0;
        totalSinDescuento = 0;
    }

    public Cliente(String nombre, String domicilio, long cuit)
    {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.cuit = cuit;
        facturas = new Factura[100];
        validosFactura = 0;
        totalSinDescuento = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public long getCuit() {
        return cuit;
    }

    public double getTotalSinDescuento() {
        return totalSinDescuento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public void agregarFactura(Factura nuevaFactura)
    {
        if(validosFactura < facturas.length)
        {
            facturas[validosFactura] = nuevaFactura;
            validosFactura++;
            sumarFacturas();
        }
    }

    public void sumarFacturas()
    {
        double totalFacturas = 0;
        for(int i = 0; i< validosFactura; i++)
        {
            totalFacturas = totalFacturas + facturas[i].getPrecioTotal();
        }
        totalSinDescuento = totalFacturas;
    }

    public void imprimirFacturas()
    {
        for(int i = 0; i < validosFactura; i++)
        {
            facturas[i].toString();
        }
    }

}
