import GLOOP.*;
import java.math.*;
public class Asteroid {
    double radiusAsteroid;

    private GLKugel asteroid;
    //[...]

    public Asteroid() {
        radiusAsteroid = 40;
        asteroid = new GLKugel(0, 500, 0, radiusAsteroid);
        asteroid.verschiebe(Math.random() * 1000 - 500, 600, 0);
    }

    public double asteroidY() {
        return asteroid.gibY();
    }

    public void aufstartwert() {
        asteroid.setzePosition(Math.random() * 1000 - 500, 600, 0);
    }


    public void HitboxAsteroid(){


}
    public void Bewegen() {
        asteroid.verschiebe(0, -2, 0);
        if (asteroid.gibY() < 0) {
            this.aufstartwert();

        }
    }

    public void beruehrung(){


        }



    }


