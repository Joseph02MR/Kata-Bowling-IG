

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class bowlingTest {

    private int score =0;
    private int [] rolls = new int[21];
    private int rollactual =0;
    private bowlingTest bowlingTest;


    @BeforeEach
    void setUp() {
        bowlingTest = new bowlingTest();
    }

    @Test
    public void Canaleta () throws Exception {
        tiradas(20,0);
        assertEquals(0,bowlingTest.score());
    }

    @Test
    public void prueba1pino () throws Exception {
        tiradas(20, 1);
        assertEquals(20,bowlingTest.score());
    }

    @Test
    public void pruebaSpare()throws Exception {
        bowlingTest.roll(5);
        bowlingTest.roll(5);
        bowlingTest.roll(3);
        tiradas(17,0);
        assertEquals(16, bowlingTest.score);

    }

    private void tiradas (int n, int pins){
        for(int i=0 ; i < n ;i++){
            bowlingTest.roll(pins);
        }
    }


    private void roll(int pins) {
        score += pins;
    }

    public int score (){
        return score;
    }
}