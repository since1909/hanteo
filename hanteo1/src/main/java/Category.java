import java.util.ArrayList;
import java.util.List;

public class Category {
    public Integer id;
    public Integer boardNo;
    public String name;
    public Boolean isLeaf;
    public List<Category> subCategories;

    public Category(Integer id, Integer boardNo, String name, Boolean isLeaf) {
        this.id = id;
        this.boardNo = boardNo;
        this.name = name;
        this.isLeaf = isLeaf;
        this.subCategories = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addSubCategory(Category category) {
        this.subCategories.add(category);
    }

    public List<Category> getSubCategories() {
        return subCategories;
    }
}
