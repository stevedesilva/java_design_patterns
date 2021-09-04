package silvade.decorator;

public class TreeImpl implements Tree {

    private String type;

    public TreeImpl() {
        this.type = "plain tree";
    }

    public String decorator() {
        return type;
    }
}
