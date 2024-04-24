import java.util.ArrayList;
import java.util.List;

public class Case1 {
    private static List<Category> list;
    private static List<Edge> edges;

    static {
        list = getBasicCategoryList();
        edges = getBasicEdges();
    }

    public static List<Category> getList() {
        return list;
    }

    public static List<Edge> getEdges() {
        return edges;
    }

    private static List<Category> getBasicCategoryList() {
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, null, "Male", false));
        categoryList.add(new Category(2, null, "Female", false));
        categoryList.add(new Category(3, null, "EXO", false));
        categoryList.add(new Category(4, null, "BTS", false));
        categoryList.add(new Category(5, null, "BLACKPINK", false));
        categoryList.add(new Category(6, 1, "Notice", true));
        categoryList.add(new Category(7, 2, "CHEN", true));
        categoryList.add(new Category(8, 3, "BAEKHYUN", true));
        categoryList.add(new Category(9, 4, "XIUMIN", true));
        categoryList.add(new Category(10, 5, "Notice", true));
        categoryList.add(new Category(11, 6, "Anonymous", true));
        categoryList.add(new Category(12, 7, "V", true));
        categoryList.add(new Category(13, 8, "Notice", true));
        categoryList.add(new Category(14, 9, "ROSE", true));
        return categoryList;
    }

    private static List<Edge> getBasicEdges() {
        // parent_id, child_id
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1));
        edges.add(new Edge(0, 2));
        edges.add(new Edge(1, 3));
        edges.add(new Edge(1, 4));
        edges.add(new Edge(2, 5));

        edges.add(new Edge(3, 6));
        edges.add(new Edge(3, 7));
        edges.add(new Edge(3, 8));
        edges.add(new Edge(3, 9));

        edges.add(new Edge(4, 10));
        edges.add(new Edge(4, 11));
        edges.add(new Edge(4, 12));

        edges.add(new Edge(5, 13));
        edges.add(new Edge(5, 11));
        edges.add(new Edge(5, 14));
        return edges;
    }
}
