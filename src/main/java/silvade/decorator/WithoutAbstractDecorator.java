package silvade.decorator;

/*
  Test class to see if we need Abstract class - similar to golang
 */
public class WithoutAbstractDecorator implements Tree {
    private Tree tree;

    public WithoutAbstractDecorator(Tree tree) {
        this.tree = tree;
    }

    public String decorator() {
        return String.format("%s with %s",tree.decorator(), "no decoration");
    }

//    public String decoration() {
//        return "without decoration";
//    }
}
