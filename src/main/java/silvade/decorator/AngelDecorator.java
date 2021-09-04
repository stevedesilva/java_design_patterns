package silvade.decorator;

public class AngelDecorator extends AbstractTreeDecorator {

    public AngelDecorator(Tree tree) {
        super(tree);
    }

    public String decorator() {
        return super.decorator();
    }

    public String decoration() {
        return "angel";
    }
}
