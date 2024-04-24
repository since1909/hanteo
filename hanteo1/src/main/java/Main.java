import com.fasterxml.jackson.core.JsonProcessingException;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        switch (args[0]) {
            case "1" :
                CategoryTree categoryTree1 = new CategoryTree();
                categoryTree1.buildTree(Case1.getList(), Case1.getEdges());
                categoryTree1.printTree(args[1]);
                break;
            case "2" :
                CategoryTree categoryTree2 = new CategoryTree();
                categoryTree2.buildTree(Case2.getList(), Case2.getEdges());
                categoryTree2.printTree(args[1]);
                break;
        }

    }
}
