package ModelEliments;

import java.util.ArrayList;
import java.util.List;

import InMemoryModel.iModelChangeObserver;

public class PoligonalModel {
    public List<Poligon> Poligons;
    public List<Texture> Textures;

     public PoligonalModel(texture[] textures) {
        this.textures = textures;
        this.Poligons = new ArrayList<Poligon>();
    }

}