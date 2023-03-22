import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void closestToZero_01() {
        int[] intArray = new int[]{3,4,5,6,-2,8,2};
        int res = Main.closestToZero(intArray);
        assertEquals(2,res);
    }

    @Test
    void closestToZero_02() {
        int[] list = new int[]{3,4,5,1,6,2};
        int closest = Main.closestToZero(list);
        assertEquals(1,closest);
    }

    @Test
    void closestToZero_03() {
        int[] list = new int[]{1,0,6,2};
        int closest = Main.closestToZero(list);
        assertEquals(0,closest);
    }
}