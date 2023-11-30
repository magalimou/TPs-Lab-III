package modelo;

public class Lavadora extends Electrodomestico{

    private final double cargaDefecto = 5;
    private double carga;

    //Un constructor por defecto.
    public Lavadora()
    {
        super();
        carga = cargaDefecto;
    }

    //Un constructor con el precio y peso. El resto por defecto.
    public Lavadora(double precio, double peso)
    {
        super(precio,peso);
        carga = cargaDefecto;
    }

    @Override
    public void precioFinal(char letraConsumo) {
        super.precioFinal(letraConsumo);
        if(carga> 30)
        {
            double precio = getPrecio() + 50;
            setPrecioFinal(precio);
        }
    }

    //Un constructor con la carga y el resto de atributos heredados.
    // Recuerda que debes llamar al constructor de la clase padre.
    public Lavadora(double precio, double peso, char consumo, String color, double carga)
    {
        super(precio,peso,color, consumo);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }
}
