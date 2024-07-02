import java.io.Serializable;

public class Cemento extends Material {

    public Cemento(int cantidad) {
        super(cantidad);
    }

    @Override
    public Material restarMaterial(Material material) {
        if (material instanceof Cemento) {
            this.cantidad = this.cantidad - (material.obtenerCantidad());
        }
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return o != null && getClass() == o.getClass();
    }

}
