package ModelEliments;

import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.AudioFileFormat.Type;

public class Scene <T extends Scene> {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

public Scene(PoligonalModel[] models, Flash[] flashes, Camera[] cameras) {
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

public Type method1(T n){
    return null;
}

public Type method2(T n, T m){
    return null;
}

}
