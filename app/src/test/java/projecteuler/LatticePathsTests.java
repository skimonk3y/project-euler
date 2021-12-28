package projecteuler;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class LatticePathsTests {

    @Test
    public void testTotalPaths() {
        LatticePaths lp = new LatticePaths();
        int result = lp.calculateRoutes(2);
        assertEquals(6, result, "2 x 2 grids should have 6 routes");
    }

    @Test
    public void testTotalPathsUnHappyCase() {
        LatticePaths lp = new LatticePaths();
        int result = lp.calculateRoutes(3);
        assertNotEquals(6, result, "3 x 3 grids should have 20 routes");
    }

    @Test
    public void testTotalPathsCornerCase() {
        LatticePaths lp = new LatticePaths();
        int result = lp.calculateRoutes(0);
        assertEquals(0, result, "0 x 0 grids should have 0 routes");
    }
}
