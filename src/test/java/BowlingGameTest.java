import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingGameTest {
    BowlingGame bowlingGameTest;
    @Test
    public void TestGutterGame() throws Exception{


        /*Ciclo del juego*/
        for(int i = 0; i < 20; i++){
            bowlingGameTest.roll(0);
        }

        assertEquals(0,bowlingGameTest.score());
    }

    @Test
    public void TestAllOnes() throws Exception{
        BowlingGame bowlingGameTest = new BowlingGame();

        /*Ciclo del juego*/
        for(int i = 0; i < 20; i++){
            bowlingGameTest.roll(0);
        }
    }

    /*Código Iván*/
    @BeforeEach
    void setUp() {
        BowlingGame bowlingGameTest = new BowlingGame();
    }

    @Test
    public void Canaleta () throws Exception {
        bowlingGameTest.tiradas(20,0);
        assertEquals(0,bowlingGameTest.score());
    }

    @Test
    public void prueba1pino () throws Exception {
        bowlingGameTest.tiradas(20, 1);
        assertEquals(20,bowlingGameTest.score());
    }

    @Test
    public void pruebaSpare()throws Exception {
        bowlingGameTest.roll(5);
        bowlingGameTest.roll(5);
        bowlingGameTest.roll(3);
        bowlingGameTest.tiradas(17,0);
        assertEquals(16, bowlingGameTest.score);

    }

}