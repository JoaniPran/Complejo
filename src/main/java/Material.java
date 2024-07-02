import java.util.Objects;

public abstract class Material {
    protected int cantidad;

    public Material(int cantidad){
        this.cantidad = cantidad;
    }

    public abstract Material restarMaterial(Material material);

    public int obtenerCantidad(){
        return cantidad;
    }


}
