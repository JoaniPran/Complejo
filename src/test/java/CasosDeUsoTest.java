import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasosDeUsoTest {

    @Test
    void casoDeUso1Test() {

        int remanenteEsperado = 0;

        Cemento cemento =  new Cemento(100);
        Pintura pintura = new Pintura(2500);
        Canios canio = new Canios(500);

        Almacen almacen = new Almacen();

        almacen.agregarMateriales(cemento);
        almacen.agregarMateriales(pintura);
        almacen.agregarMateriales(canio);

        Casa nuevaCasa = new Casa(5);

        nuevaCasa.construirCasa(almacen);

        assertEquals(remanenteEsperado, almacen.cantidadMateriales());
    }

    @Test
    void casoDeUso2Test() {

        int remanenteEsperado = 0;

        Cemento cemento =  new Cemento(700);
        Pintura pintura = new Pintura(2700);
        Canios canio = new Canios(500);

        Almacen almacen = new Almacen();

        almacen.agregarMateriales(cemento);
        almacen.agregarMateriales(pintura);
        almacen.agregarMateriales(canio);

        Edificio nuevoEdificio = new Edificio(5);

        nuevoEdificio.construirEdificio(almacen);

        assertEquals(remanenteEsperado, almacen.cantidadMateriales());
    }
}
