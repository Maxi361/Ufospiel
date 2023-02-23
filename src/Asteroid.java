import GLOOP.*;
import java.math.*;
public class Asteroid{


    private GLKugel asteroid;
    //[...]

    public Asteroid(){
    asteroid = new GLKugel(0,500,0,40);
    asteroid.verschiebe(Math.random() *1000 -500,600,0);
    }

    public double asteroidY(){
        return asteroid.gibY();
    }
    public void aufstartwert(){
        asteroid.verschiebe(Math.random() *1000 -500,600,0);
    }

    public void bewegedich(){
        asteroid.verschiebe(0,-2,0);

    }

    }


