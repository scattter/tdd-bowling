import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    void should_get_full_score(){

        int[] test_data = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int score = BowlingGame.convert(test_data);

        assertEquals(300,score);
    }

    @Test
    void should_get_zero_score(){
        int[] test_data = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int score = BowlingGame.convert(test_data);

        assertEquals(0,score);
    }

    @Test
    void should_get_no_regular1_score(){
        int[] test_data = {1,9,5,5,3,4,6,4,3,2,10,10,10,10,10,10,10};
        int score = BowlingGame.convert(test_data);
        assertEquals(203,score);
    }

    @Test
    void should_get_no_regular2_score(){
        int[] test_data = {4,6,2,3,2,4,10,10,10,7,3,10,10,2,5,3};
        int score = BowlingGame.convert(test_data);
        assertEquals(169,score);
    }

}
