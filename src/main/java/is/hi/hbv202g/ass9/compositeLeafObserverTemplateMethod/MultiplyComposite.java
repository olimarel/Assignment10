package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

public class MultiplyComposite extends CalculateComposite implements MathExpression, Observer {
    public int getResult() {
        int result = 1;
        for (MathExpression child : children) {
            result *= child.getResult();
        }
        return result;
    }
}
