package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression {
    private List<MathExpression> children = new ArrayList<>();

    public void add(MathExpression child) {
        children.add(child);
    }

    public void remove(MathExpression child) {
        children.remove(child);
    }

    public List<MathExpression> getChildren() {
        return children;
    }

    public int getResult() {
        int result = 1;
        for (MathExpression child : children) {
            result *= child.getResult();
        }
        return result;
    }
}
