package combination;

import java.util.List;

/**
 * 组合模式适用于数据结构为树类型的场景
 * 父类与子类属于同一个Node类型
 * 他与适配模式是由很大区别的:
 * 适配模式主要适用于的结构是多继承,它将抽象和实现分开,抽象中桥接实现,实现和抽象可单独再去实例化,这样做到了单一原则
 * 和组合模式适用于层级结果,层级之间是耦合的
 * @author bk
 */
public class Application {

    public static void main(String[] args) {
        CombinationNode parentNode = new CombinationNode(1L,0,"1");
        CombinationNode node1 = new CombinationNode(2L,1,"2");
        CombinationNode node2 = new CombinationNode(3L,1,"3");
        CombinationNode node3 = new CombinationNode(4L,2,"4");

        node1.setChildes(List.of(node3));
        parentNode.setChildes(List.of(node1,node2));

    }
}
