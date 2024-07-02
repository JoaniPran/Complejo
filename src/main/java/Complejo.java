import java.util.ArrayList;

public class Complejo {
    int cantidadCasa;
    int catidadEdificios;
    ArrayList<Casa> casas = new ArrayList<>();
    ArrayList<Edificio> edificios;

    Complejo(int cantidadCasa, int catidadEdificios) {


//        for (int i = 0 ; i < cantidadCasa ; i++) {
//            casas.add(new Casa());
//        }
//
//        for (int i = 0 ; i < catidadEdificios ; i++) {
//            casas.add(new Edificio());
//        }

        this.cantidadCasa = cantidadCasa;
        this.catidadEdificios = catidadEdificios;
    }

    private void construirCasas(Almacen nuevoAlmacen){
        for (int i = 1; i <= cantidadCasa; i++) {
            Casa nuevaCasa = new Casa(5);
            nuevaCasa.construirCasa(nuevoAlmacen);
        }
    }

    private void construirEdificos(Almacen nuevoAlmacen){
        for (int i = 1; i <= catidadEdificios; i++) {
            Edificio edificio = new Edificio(5);
            edificio.construirEdificio(nuevoAlmacen);
        }
    }

    public void construirComplejo(Almacen nuevoAlmacen){
        construirCasas(nuevoAlmacen);
        construirEdificos(nuevoAlmacen);
    }


}
