package modelo;

public class Television extends Electrodomestico{

    private final double resolucionXDefecto = 20;
    private final boolean tdtXDefecto = false;

    //Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano), ademas de los atributos heredados.
    private double resolucion; //20 por defecto
    private boolean tdt; // false por defecto

    //Un constructor por defecto.
    public Television()
    {
        super();
        resolucion = resolucionXDefecto;
        tdt = tdtXDefecto;
    }

    //Un constructor con el precio y peso. El resto por defecto.
    public Television(double precio, double peso)
    {
        super(precio, peso);
        resolucion = resolucionXDefecto;
        tdt = tdtXDefecto;
    }

    //Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados.
    public Television(double resolucion, boolean tdt, double precio, double peso, String color, char consumo)
    {
        super(precio, peso, color, consumo);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    //Método get de resolución y sintonizador TDT.
    public double getResolucion() {
        return resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    //precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30%
    // y si tiene un sintonizador TDT incorporado, aumentara 50 €.

    @Override
    public void precioFinal(char letraConsumo) {

        super.precioFinal(letraConsumo);
        double precio = 0;

        if(resolucion > 40)
        {
            double porcentajeAumento =(getPrecio()*40)/100;
            precio = getPrecioFinal() + porcentajeAumento; //se le suma el 30%
        }else
        {
            precio = getPrecioFinal();
        }

        if(tdt)
        {
            precio = precio + 50; //si tiene sintonizdor aumenta el precio
        }

        setPrecioFinal(precio);
    }
}
