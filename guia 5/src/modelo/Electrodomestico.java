package modelo;

public class Electrodomestico {

    private final int pesoDefecto = 5;
    private final int precioDefecto = 100;
    public static final char consumoDefecto = 'F';
    public static final String colorDefecto = "blanco";
    private double precio;
    private String color;
    private char consumo;
    private double peso;

    private double precioFinal;

    //Por defecto, el color sera blanco, el consumo energético sera F,
    // el precioBase es de 100 € y el peso de 5 kg. Usa constantes para ello.
    public Electrodomestico()
    {
        color = colorDefecto;
        consumo = 'F';
        precio = 100;
        peso = pesoDefecto;
        precioFinal = 0;
    }

    //Un constructor con el precio y peso. El resto por defecto.
    public Electrodomestico(double precio, double peso)
    {
        this.precio = precio;
        this.peso = peso;
        consumo = consumoDefecto;
        color = colorDefecto;
        precioFinal = 0;

    }

    //Un constructor con todos los atributos.
    public Electrodomestico(double precio, double peso, String color, char consumo)
    {
        this.peso = peso;
        this.precio = precio;
        this.consumo = comprobarConsumoEnergetico(consumo);
        this.color = comprobarColor(color);
        precioFinal = 0;

    }

    /*comprobarColor(String color): comprueba que el color es correcto, sino lo es usa el color por defecto.
    Se invocara al crear el objeto y no sera visible.*/
    public String comprobarColor(String color)
    {
        if(color.equals("blanco") || color.equals("negro") || color.equals("rojo") || color.equals("azul") || color.equals("gris"))
        {
            return color;
        }else
        {
            return colorDefecto;
        }
    }

    //comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es correcta usara la letra por defecto. Se invocara al crear el objeto y no sera visible.
    public char comprobarConsumoEnergetico(char letra)
    {
        String consumos = "ABCDEF";
        boolean correcto = false;
        for(int i =0; i <consumos.length(); i++)
        {
            if(letra == consumos.charAt(i))
            {
                correcto = true;
            }
        }
        if(correcto)
        {
            return letra;
        }else
        {
            return consumoDefecto;
        }
    }

    //precioFinal(): según el consumo energético, aumentara su precio, y según su tamaño, también.
    public void precioFinal(char letraConsumo)
    {
        double precioFinal = 0;
        int aumento = 0;

        if(letraConsumo == 'A') //lo que aumenta por el tipo de comsumo
        {
            precioFinal = 100;

        }else if(letraConsumo == 'B')
        {
            precioFinal =  80;
        }else if(letraConsumo == 'C')
        {
            precioFinal = 60;

        }else if(letraConsumo == 'D')
        {
            precioFinal =  50;

        }else if(letraConsumo == 'E')
        {
            precioFinal = 30;
        }else {
            precioFinal = 10;
        }

        if(peso > 0 && peso <= 19) //lo que aumenta por el peso
        {
            aumento = 10;

        }else if(peso >= 20 && peso <= 49 )
        {
            aumento = 50;

        }else if(peso >= 50 && peso <= 79)
        {
            aumento = 80;

        }else if(peso >= 80)
        {
            aumento = 100;
        }

        precioFinal = precio + aumento + precioFinal;

        this.precioFinal = precioFinal;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo() {
        return consumo;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }


}
