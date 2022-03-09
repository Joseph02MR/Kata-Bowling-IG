import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingGameTest {
    BowlingGame BowlingGameTest;

    @Test
    public void TestGutterGame() throws Exception{


        /*Ciclo del juego*/
        for(int i = 0; i < 20; i++){
            BowlingGameTest.roll(0);
        }

        assertEquals(0,BowlingGameTest.score());
    }

    @Test
    public void TestAllOnes() throws Exception{
        BowlingGame bowlingGameTest = new BowlingGame();

        /*Ciclo del juego*/
        for(int i = 0; i < 20; i++){
            BowlingGameTest.roll(0);
        }
    }

    /*Código Iván*/
    @BeforeEach
    void setUp() {
        BowlingGameTest = new BowlingGame();
    }

    @Test
    public void Canaleta () throws Exception {
        BowlingGameTest.tiradas(20,0);
        assertEquals(0,BowlingGameTest.score());
    }

    @Test
    public void prueba1pino () throws Exception {
        BowlingGameTest.tiradas(20, 1);
        assertEquals(20,BowlingGameTest.score());
    }

    @Test
    public void pruebaSpare()throws Exception {
        rollspare();
        BowlingGameTest.roll(3);
        BowlingGameTest.tiradas(17,0);
        assertEquals(16, BowlingGameTest.score());

    }

    @Test
    public void PruebaChuza(){
        chuza();//CHUZAAAA
        BowlingGameTest.roll(3);
        BowlingGameTest.roll(4);
        BowlingGameTest.tiradas(16,0);
        assertEquals(24, BowlingGameTest.score());
    }

    @Test
    public void JUEGOMACIZO (){
        BowlingGameTest.tiradas(12,10);
        assertEquals(300, BowlingGameTest.score());
    }

    public void rollspare(){
        BowlingGameTest.roll(5);
        BowlingGameTest.roll(5);
    }

    public void chuza(){
        BowlingGameTest.roll(10);
    }

}