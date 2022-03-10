import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingGameTest {
        BowlingGame bowlingGameTest;

    @BeforeEach
    void setUp() {
        bowlingGameTest = new BowlingGame();
    }

    @Test
    public void Canaleta () {
        bowlingGameTest.tiradas(20,0);
        assertEquals(0,bowlingGameTest.score());
    }

    @Test
    public void prueba1pino () {
        bowlingGameTest.tiradas(20, 1);
        assertEquals(20,bowlingGameTest.score());
    }

    @Test
    public void pruebaSpare() {
        bowlingGameTest.jugadaSpare();
        bowlingGameTest.roll(3);
        bowlingGameTest.tiradas(17, 0);
        assertEquals(16, bowlingGameTest.score());
    }

    @Test
    public void pruebaChuza() {
        bowlingGameTest.roll(3);
        bowlingGameTest.roll(5);
        bowlingGameTest.jugadaChuza();
        bowlingGameTest.roll(3);
        bowlingGameTest.roll(5);
        bowlingGameTest.tiradas(14,0);
        assertEquals(34,bowlingGameTest.score());
    }

    @Test
    public void pruebaJuegoPerfecto(){
        bowlingGameTest.tiradas(12,10);
        assertEquals(300,bowlingGameTest.score());
    }
}