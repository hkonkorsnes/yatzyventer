import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class yatzyTest {

    private final yatzyGame yatzyGame = new yatzyGame();

    @Test
    void shouldScoreOnes(){
        assertEquals(4, yatzyGame.score(YatzyCategory.ONES, new int[]{1, 1, 2, 1, 1}));
        assertEquals(3, yatzyGame.score(YatzyCategory.ONES, new int[]{1, 3, 6, 1, 1}));

    }
}
