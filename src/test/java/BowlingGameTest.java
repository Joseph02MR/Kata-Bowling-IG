import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingGameTest {
    @Test
    public void TestGutterGame() throws Exception{
        BowlingGame bowlingGameTest = new BowlingGame();

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
            a
        }
    }

}