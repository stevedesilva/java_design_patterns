package silvade.decorator;

public abstract class AbstractTreeDecorator implements Tree {
    private Tree tree;

    public AbstractTreeDecorator(Tree tree) {
        this.tree = tree;
    }

    public String decorator() {
       return String.format("%s with %s",tree.decorator(), decoration());
    }

    public abstract String decoration();
}
