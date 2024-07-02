public class Casa {
    private int ambientes;

    public Casa(int ambientes){
        this.ambientes = ambientes;
    }

    private void construirBase(Almacen nuevoAlmacen){
        nuevoAlmacen.usarMaterial(new Cemento(50));
    }

    public void construirCasa(Almacen nuevoAlmacen){
        this.construirBase(nuevoAlmacen);
        nuevoAlmacen.usarMaterial(new Cemento(10*ambientes));
        nuevoAlmacen.usarMaterial(new Pintura(100*ambientes));
        nuevoAlmacen.usarMaterial(new Canios(500*ambientes));
    }

}
