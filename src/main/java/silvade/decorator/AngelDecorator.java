package silvade.decorator;

public class AngelDecorator extends AbstractTreeDecorator {

    public AngelDecorator(Tree tree) {
        super(tree);
    }
// Decorator is inherited
//    public String decorator() {
//        return super.decorator();
//    }

    public String decoration() {
        return "angel";
    }
}
