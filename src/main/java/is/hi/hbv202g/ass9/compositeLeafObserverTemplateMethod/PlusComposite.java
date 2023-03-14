package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

public class PlusComposite extends CalculateComposite implements MathExpression, Observer {
    public int getResult() {
        int result = 0;
        for (MathExpression child : children) {
            result += child.getResult();
        }
        return result;
    }
}
