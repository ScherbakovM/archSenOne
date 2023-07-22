package inMemoryModel;

public interface IModelChangeObserver {
    public static  void applyUpdateModel(){
        System.out.println("update model");
    }
}
