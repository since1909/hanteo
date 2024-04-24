public class Edge {
    private Integer parentId;
    private Integer childId;

    public Edge(Integer parentId, Integer childId) {
        this.parentId = parentId;
        this.childId = childId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public Integer getChildId() {
        return childId;
    }
}
