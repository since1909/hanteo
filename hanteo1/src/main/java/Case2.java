import java.util.ArrayList;
import java.util.List;

public class Case2 {
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

        categoryList.add(new Category(15, null, "NCT", false));
        categoryList.add(new Category(16, null, "NCT127", false));
        categoryList.add(new Category(17, null, "NCT DREAM", false));
        categoryList.add(new Category(18, null, "WayV", false));
        categoryList.add(new Category(19, null, "NCT WISH", false));
        categoryList.add(new Category(20, 10, "JAEHYUN", true));
        categoryList.add(new Category(21, 11, "MARK", true));
        categoryList.add(new Category(22, 12, "RENJUN", true));
        categoryList.add(new Category(23, 13, "HAECHAN", true));
        categoryList.add(new Category(24, 14, "TEN", true));
        categoryList.add(new Category(25, 15, "WINWIN", true));
        categoryList.add(new Category(26, 16, "SION", true));
        categoryList.add(new Category(27, 17, "YUSHI", true));
        categoryList.add(new Category(28, 18, "Notice", true));
        categoryList.add(new Category(29, 19, "Notice", true));
        categoryList.add(new Category(30, 20, "Notice", true));
        categoryList.add(new Category(31, 21, "Notice", true));

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

        edges.add(new Edge(1,15));      // NCT
        edges.add(new Edge(15,16));     // NCT127
        edges.add(new Edge(16, 28));    // Notice
        edges.add(new Edge(16, 20));    // JAEHYUN
        edges.add(new Edge(16, 21));    // MARK
        edges.add(new Edge(16, 23));    // HAECHAN

        edges.add(new Edge(15,17));     // NCT DREAM
        edges.add(new Edge(16, 29));    // Notice
        edges.add(new Edge(17, 21));    // MARK
        edges.add(new Edge(17, 22));    // RENJUN
        edges.add(new Edge(17, 23));    // HAECHAN

        edges.add(new Edge(15,18));     // WayV
        edges.add(new Edge(18, 30));    // Notice
        edges.add(new Edge(18, 24));    // TEN
        edges.add(new Edge(18, 25));    // WINWIN

        edges.add(new Edge(15,19));     // NCT WISH
        edges.add(new Edge(19, 31));    // Notice
        edges.add(new Edge(19, 26));    // SION
        edges.add(new Edge(19, 27));    // YUSHI

        return edges;
    }
}
