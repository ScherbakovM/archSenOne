package inMemoryModel;

import modelElements.Camera;
import modelElements.Flash;
import modelElements.Scene;
import modelElements.poligonal.PoligonalModel;

public class ModelStore implements IModelChanger, IModelChangeObserver{
    public PoligonalModel models;
    public Scene scene;
    public Flash flashes;
    public Camera cameras;
    private  IModelChangeObserver changeObserver;

    public ModelStore(PoligonalModel models, Scene scene, Flash flashes, Camera cameras, IModelChangeObserver changeObserver) {
        this.models = models;
        this.scene = scene;
        this.flashes = flashes;
        this.cameras = cameras;
        this.changeObserver = changeObserver;
    }


    @Override
    public void notifyChange(IModelChanger sender) {

    }

    public Scene getScena(int param ) {
        Scene scene = new Scene();
        return scene;
    }


}
