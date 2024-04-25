import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class CategoryTree {
    private Map<Integer, Category> categoryMap;
    public CategoryTree() {
        this.categoryMap = new HashMap<>();
        Category root = new Category(0, null, "Total", false);
        categoryMap.put(0, root);
    }

    public Category getRoot() {
        return categoryMap.get(0);
    }

    /**
     * 트리 구조 생성
     * @param categoryList
     * @param edges
     */
    public void buildTree(List<Category> categoryList, List<Edge> edges) {
        for (Category category : categoryList) {
            categoryMap.put(category.getId(), category);
        }

        for (Edge edge : edges) {
            Category parent = categoryMap.get(edge.getParentId());
            Category child = categoryMap.get(edge.getChildId());
            if (parent == null || child == null) {
                continue;
            }
            parent.addSubCategory(child);
        }
    }

    /**
     * 카테고리 출력
     * @param name
     * @throws JsonProcessingException
     */
    public void printTree(String name) throws JsonProcessingException {
        List<Category> foundCategory = findCategory(name);
        if (foundCategory == null) {
            System.out.println("Not Found: " + name);
            return;
        }
        for (Category category : foundCategory) {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
            String json = objectMapper.writeValueAsString(category);
            System.out.println(json);
        }
    }

    private List<Category> findCategory(String name) {
        return categoryMap.values().stream()
                .filter(category -> category.getName().equals(name))
                .collect(Collectors.toList());
    }
}
