package inMemoryModel;

public interface IModelChanger {
    public default void notifyChange(IModelChanger sender) {
        System.out.println("notify");
    }
}
