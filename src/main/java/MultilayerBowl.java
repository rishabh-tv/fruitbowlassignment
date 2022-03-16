

import java.util.ArrayList;
import java.util.List;
public class MultilayerBowl extends Segregator{

    public int Redfruitcolor(){
        List<Fruits> redFruit = new ArrayList<Fruits>();
        redFruit.addAll(segregateByColor("Red"));
        return redFruit.size();
    }

    public int yellowfruitcolor(){
        List<Fruits> yellowfruitcolor = new ArrayList<Fruits>();
        yellowfruitcolor.addAll(segregateByColor("Yellow"));
        return yellowfruitcolor.size();
    }

    public int mediumfruitsize(){
        List<Fruits> mediumFruit = new ArrayList<Fruits>();
        mediumFruit.addAll(segregateBySize("Medium"));
        return mediumFruit.size();
    }

    public int smallfruitsize(){
        List<Fruits> smallFruit = new ArrayList<Fruits>();
        smallFruit.addAll(segregateBySize("Small"));
        return smallFruit.size();
    }

    public int sourfruittaste(){
        List<Fruits> sourFruit = new ArrayList<Fruits>();
        sourFruit.addAll(segregateByType("Sour"));
        return sourFruit.size();
    }

    public int sweetfruittaste(){
        List<Fruits> sweetFruit = new ArrayList<Fruits>();
        sweetFruit.addAll(segregateByType("Sweet"));
        return sweetFruit.size();
    }

}

