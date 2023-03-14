package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;

public class PlusComposite implements MathExpression {
    private ArrayList<MathExpression> children = new ArrayList<>();

    public void add(MathExpression child) {
        children.add(child);
    }

    public void remove(MathExpression child) {
        children.remove(child);
    }

    public ArrayList<MathExpression> getChildren() {
        return children;
    }

    public int getResult() {
        int result = 0;
        for (MathExpression child : children) {
            result += child.getResult();
        }
        return result;
    }
}
