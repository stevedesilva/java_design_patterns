package patterns.decorator;

public abstract class ChristmasTreeDecorator implements ChristmasTree {
    private ChristmasTree christmasTree;

    public ChristmasTreeDecorator(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    public String decorate() {
        return String.format("%s %s",christmasTree.decorate(),additions());
    }

    public abstract String additions();
}
