public class Pintura extends Material{

    public Pintura(int cantidad) {
        super(cantidad);
    }

    @Override
    public Material restarMaterial(Material material) {
        if (material instanceof Pintura) {
            this.cantidad = this.cantidad - (material.obtenerCantidad());
        }
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return true;
    }

}
