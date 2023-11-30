import java.util.ArrayList;
import java.util.List;

public class Usa {

    private List<Categoria> listaCategorias;

    private double total;

    public Usa()
    {
        listaCategorias = new ArrayList<>();
        total = 0;
    }

    public void agregarCategoria(Categoria categoria)
    {
        this.listaCategorias.add(categoria);
    }

    public List<Categoria> getListaCategorias() {
        return listaCategorias;
    }

    public void setListaCategorias(List<Categoria> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void comprarPorCategoria(String nombreCategoria) throws InvalidCategoryException
    {
        int flag = 1;
        for (int i = 0; i < listaCategorias.size(); i++)
        {
            if(flag != 0)
            {
            if ((listaCategorias.get(i).getTipoCategoria().equals(nombreCategoria)))
            {
                total = listaCategorias.get(i).getImpuesto();
                flag = 0;
            }
            else
            {
                throw new InvalidCategoryException("Categoria inexistente");
            }
        }
        }
    }






}
