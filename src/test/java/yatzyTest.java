import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class yatzyTest {

    private final yatzyGame yatzyGame = new yatzyGame();

    @Test
    void shouldScoreOnes(){
        assertEquals(4, yatzyGame.score(YatzyCategory.ONES, new int[]{1, 1, 2, 1, 1}));
        assertEquals(3, yatzyGame.score(YatzyCategory.ONES, new int[]{1, 3, 6, 1, 1}));

    }
    @Test
    void shouldScoreTwos(){
        assertEquals(4, yatzyGame.score(YatzyCategory.TWOS, new int[]{1, 1, 2, 2, 1}));
        assertEquals(2, yatzyGame.score(YatzyCategory.TWOS, new int[]{6, 5, 2, 1, 1}));

    }
    @Test
    void shouldScorePair(){
        assertEquals(10, yatzyGame.score(YatzyCategory.PAIR, new int[]{3, 5, 5, 1, 3}));
        assertEquals(12, yatzyGame.score(YatzyCategory.PAIR, new int[]{1, 3, 6, 6, 2}));
        assertEquals(8, yatzyGame.score(YatzyCategory.PAIR, new int[]{4, 3, 4, 6, 2}));
    }
    @Test
    void shouldScoreThreeOfAKind(){
        assertEquals(12, yatzyGame.score(YatzyCategory.THREE_OF_A_KIND, new int[]{4, 4, 6, 4, 2}));
        assertEquals(18, yatzyGame.score(YatzyCategory.THREE_OF_A_KIND, new int[]{4, 6, 6, 4, 6}));
    }
}
