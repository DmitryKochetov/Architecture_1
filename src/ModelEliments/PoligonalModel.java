package ModelEliments;

import java.util.ArrayList;
import java.util.List;

import InMemoryModel.iModelChangeObserver;

public class PoligonalModel {
    public List<Poligon> poligons;
    public List<Texture> textures;

     public PoligonalModel(texture[] textures) {
        this.textures = textures;
        this.poligons = new ArrayList<Poligon>();
    }

}