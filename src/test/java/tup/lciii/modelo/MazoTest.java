package tup.lciii.modelo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class MazoTest {

    @Test
    void getMazoLength() {
        Mazo mazo = new Mazo();
        mazo.generarMazo();
        assertEquals(52, mazo.getMazoLength());
    }

    @Test
    void mezclarMazo() {
        Mazo mazo = new Mazo();
        mazo.generarMazo();
        List<Carta> originalOrder = new ArrayList<>(mazo.getMazo());
        mazo.mezclarMazo();
        assertNotEquals(originalOrder, mazo.getMazo());
    }
}