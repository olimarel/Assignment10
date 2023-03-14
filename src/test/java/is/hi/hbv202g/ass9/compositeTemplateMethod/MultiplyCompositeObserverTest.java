package is.hi.hbv202g.ass9.compositeTemplateMethod;

import is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod.MultiplyComposite;
import is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod.NumberLeaf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyCompositeObserverTest {

    private is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod.MultiplyComposite multiplyComposite;

    @Before
    public void createMultiplyComposite() {
        multiplyComposite = new MultiplyComposite();
    }

    @Test
    public void testOneElementMultiplyCompositeObserver() {

        NumberLeaf number2 = new NumberLeaf(2);
        multiplyComposite.add(number2);

        multiplyComposite.update(); // This will cause stuff printed on the screen: this is not tested.

        assertEquals(2, multiplyComposite.getLastObservedResult());
    }
}
