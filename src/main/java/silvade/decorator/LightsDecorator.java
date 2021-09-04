package silvade.decorator;

public class LightsDecorator extends AbstractTreeDecorator {
    public LightsDecorator(Tree tree) {
        super(tree);
    }

    @Override
    public String decorator() {
        return super.decorator();
    }

    public String decoration() {
        return "lights";
    }
}
