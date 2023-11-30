package Ejercicio6;

import java.util.Date;

public class Factura {

    private int num;
    private Date fecha;
    private int cantidad;
    private String item;
    private double precioUnitario;
    private double precioTotal;

    public Factura()
    {
        num = 0;
        fecha = new Date();
        cantidad = 0;
        item = "";
        precioUnitario = 0;
        precioTotal = 0;
    }

    public Factura(String item, int cantidad, double precioUnitario)
    {
        num = 0;
        fecha = new Date();
        this.cantidad = cantidad;
        this.item = item;
        this.precioUnitario = precioUnitario;
        precioTotal = calcularPrecioTotal();

    }

    private double calcularPrecioTotal()
    {
        double total = precioUnitario*cantidad;
        return total;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getNum() {
        return num;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getItem() {
        return item;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "num=" + num +
                ", fecha=" + fecha +
                ", cantidad=" + cantidad +
                ", item='" + item + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", precioTotal=" + precioTotal +
                '}';
    }
}
