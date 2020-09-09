import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class yatzyTest {

    @Test
    void shouldScoreOnes(){
        assertEquals(4, new yatzyGame().score(YatzyCategory.ONES, new int[]{1, 1, 2, 1, 1}));
    }
}
