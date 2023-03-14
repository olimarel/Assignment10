package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class CalculateComposite implements MathExpression, Observer {
    protected List<MathExpression> children = new ArrayList<MathExpression>();
    protected int lastObservedResult;

    public void add(MathExpression child) {
        children.add(child);
    }

    public void remove(MathExpression child) {
        children.remove(child);
    }

    public List<MathExpression> getChildren() {
        return children;
    }

    public abstract int getResult();

    public void update() {
        lastObservedResult = getResult();
        System.out.println(lastObservedResult);
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }
}
