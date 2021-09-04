package silvade.decorator;

public class TinselDecorator extends AbstractTreeDecorator {
    public TinselDecorator(Tree tree) {
        super(tree);
    }

    public String decorator() {
        return super.decorator();
    }

    public String decoration() {
        return "tinsel";
    }
}
