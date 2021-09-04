package silvade.decorator;

public class TreeImpl implements Tree {

    private String type;

    public TreeImpl() {
        this.type = "plain tree";
    }

    public TreeImpl(String type) {
        this.type = type;
    }

    public String decorator() {
        return type;
    }
}
