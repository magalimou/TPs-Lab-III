package modelo;

public class Mex {

    private float recaudacion; //acumulativo
    private float saldo; //el resto va para el siguiente cliente
    private float precioActual;
    private int topeBoletos;
    private int cantBoletos; //emitidos, acumulativo

    public Mex()
    {
        recaudacion = 0;
        saldo = 0;
        precioActual = 300;
        topeBoletos = 2;
        cantBoletos = 0;
    }

    public float getPrecioActual() {
        return precioActual;
    }

    public float getRecaudacion() { //TECNICO
        return recaudacion = recaudacion+ saldo;
    }
    public float getSaldo() {
        return saldo;
    }

    public void setPrecioActual(float precioActual) { //TECNICO
        this.precioActual = precioActual;
    }

    public void setTopeBoletos(int topeBoletos) { //TECNICO
        this.topeBoletos = topeBoletos;
    }

    public int comprarBoleto(float dineroIngresado)
    {
        saldo = dineroIngresado + saldo;
        recaudacion = dineroIngresado + recaudacion;
        int cantImprimir = 0;

        while(saldo >= precioActual && cantBoletos < topeBoletos)
        {
            cantBoletos++;
            cantImprimir++;
            saldo = saldo - precioActual;

        }
        return cantImprimir;
    }

    public void vaciarRecaudacion()
    {
        recaudacion = 0;
        saldo = 0;
    }




}
