package tup.lciii.modelo;

import org.junit.jupiter.api.Test;
import tup.lciii.modelo.enums.Palo;

import static org.junit.jupiter.api.Assertions.*;

class ManoTest {

    @Test
    void buscarCartaEnMano() {
        Mano mano = new Mano();
        Carta carta = new Carta(5, Palo.COPA);
        mano.agregarCarta(carta);
        assertNull(mano.buscarCartaEnMano(7, Palo.COPA));
    }
}