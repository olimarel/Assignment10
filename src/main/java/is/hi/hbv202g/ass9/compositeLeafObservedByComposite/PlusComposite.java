package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.ArrayList;

public class PlusComposite implements MathExpression, Observer {
    private ArrayList<MathExpression> children = new ArrayList<>();
    private int lastObservedResult;

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

    public void update() {
        lastObservedResult = getResult();
        System.out.println(lastObservedResult);
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }
}
