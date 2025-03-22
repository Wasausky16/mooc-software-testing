package tudelft.numfinder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumFinderTest {
    @Test
    public void numLargest(){
        NumFinder nf = new NumFinder();
        nf.find(new int[] {4, 3, 2, 1});
        int result = nf.getLargest();
        Assertions.assertEquals(4,result);
    }

    @Test
    public void numSmallest(){
        NumFinder nf = new NumFinder();
        nf.find(new int[] {4, 3, 2, 1});
        int result = nf.getSmallest();
        Assertions.assertEquals(1,result);
    }
}