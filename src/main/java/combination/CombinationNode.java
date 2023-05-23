package combination;

import java.util.List;

/**
 * @author bk
 */
public class CombinationNode {

    private Long id;
    private Integer parentId;
    private String label;
    private List<CombinationNode> childes;

    public void setChildes(List<CombinationNode> childes) {
        this.childes = childes;
    }

    public CombinationNode(Long id, Integer parentId, String label) {
        this.id = id;
        this.parentId = parentId;
        this.label = label;
    }
}
