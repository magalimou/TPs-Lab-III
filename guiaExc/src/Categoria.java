public class Categoria {

    private String tipoCategoria;
    private double impuesto;

    public Categoria(String producto, double impuesto) {
        this.tipoCategoria = producto;
        this.impuesto = impuesto;
    }

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoriatring(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
}
