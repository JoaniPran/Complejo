import java.util.ArrayList;

public class Almacen {

    ArrayList<Material> materiales = new ArrayList<>();

    public void agregarMateriales(Material material){
        this.materiales.add(material);
    }

    void usarMaterial(Material material){

        int i = 0;

        Material materialRestar;

        for (i = 0; i < materiales.size(); i++){
            if (materiales.get(i).equals(material)){

                materiales.get(i).restarMaterial(material);
            }

        }


//            while (!materiales.get(i).equals(material)){
//                i++;
//            }
//            materialRestar = materiales.get(i);
//            materialRestar.restarMaterial(material);
        }

    int cantidadMateriales(){

        int cantidadTotal = 0;

        for (Material material : materiales){
            cantidadTotal +=  material.obtenerCantidad();
        }
        return cantidadTotal;
    }
}


