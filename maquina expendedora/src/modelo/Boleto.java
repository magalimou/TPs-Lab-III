package modelo;

import javax.imageio.plugins.jpeg.JPEGImageWriteParam;
import java.util.Date;

public class Boleto {

    //atributos
    private float precioEmitido;
    private Date fechaEmision;

    public Boleto(float precioEmitido)
    {
        this.precioEmitido = precioEmitido;
        fechaEmision = new Date();
    }

    public float getPrecioEmitido()
    {
        return precioEmitido;
    }

    public Date getFechaEmision()
    {
        return fechaEmision;
    }



}
