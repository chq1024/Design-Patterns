package bridging;

/**
 * 桥接模式
 * RefObj 与 AbstractClazz进行组合,避免了继承,减少了代码量
 * RefObj  RefPerson和RefBook是对实现化的具体实现
 * ExtendAbstractClazz 是扩展抽象化
 * 在ExtendAbstractClazz中就具备了操作RefPerson和RefBook的能力和操作AbstractClazz的能力
 * 即AbstractClazz也可扩展,RefObj也可扩展,都可在扩展抽象化中使用它们
 * @author bk
 */
public abstract class AbstractClazz {

    private RefObj refObj;

    public AbstractClazz(RefObj refObj) {
        this.refObj = refObj;
    }

    abstract void print();


    public void printUUID() {
        System.out.println(refObj.printUUID());
    }
}
