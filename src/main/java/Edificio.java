public class Edificio {

    private int plantas;

    public Edificio(int plantas){
        this.plantas = plantas;
    }

    private void construirBase(Almacen nuevoAlmacen){
        nuevoAlmacen.usarMaterial(new Cemento(100));
        nuevoAlmacen.usarMaterial(new Pintura(100));
        nuevoAlmacen.usarMaterial(new Canios(100));
    }

    private void construirPlantaBaja(Almacen nuevoAlmacen){
       Casa nuevaCasa = new Casa(5);
        nuevaCasa.construirCasa(nuevoAlmacen);
    }

    private void construirPlanta(Almacen nuevoAlmacen){
        for (int i = 1; i <= plantas; i++){
            nuevoAlmacen.usarMaterial(new Cemento(100 * i));
        }
        nuevoAlmacen.usarMaterial(new Canios(100));
        nuevoAlmacen.usarMaterial(new Pintura(100));
    }


    public void construirEdificio(Almacen nuevoAlmacen){
        construirBase(nuevoAlmacen);
        construirPlantaBaja(nuevoAlmacen);
        construirPlanta(nuevoAlmacen);
    }

}
