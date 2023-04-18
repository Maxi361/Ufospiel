import GLOOP.*;
import java.math.*;
public class Asteroid {
    double radiusAsteroid;

    private GLKugel asteroid;
    private Ufo ufo;
    //[...]
    Ufo pUfoGlobal;

    public Asteroid(Ufo pUfo) {
        radiusAsteroid = 50;
        asteroid = new GLKugel(0, 500, 0, radiusAsteroid, "src/img/Krater.jpg");
        asteroid.verschiebe(Math.random() * 1000 - 500, Math.random() * 2000 + 1300, Math.random() * 1000 - 500);
        ufo = pUfo;
        pUfoGlobal = pUfo;
    }



    public void aufstartwert() {
        asteroid.setzePosition(Math.random() * 1000 - 500, Math.random() * 1700 + 1200, Math.random() * 1000 - 500);
    }


    public void HitboxAsteroid() {


    }

    public void Bewegen() {
        asteroid.verschiebe(0, -7, 0);
        if (asteroid.gibY() < -400) {
            this.aufstartwert();
        }
    }


    public double asteroidX() {
        return asteroid.gibX();
    }

    public double asteroidZ() {
        return asteroid.gibZ();
    }
    //public void beruehrung(){
    public double asteroidY() {
        return asteroid.gibY();
    }


    //}

    public boolean getroffen() {
        double ufoX = pUfoGlobal.gibX();
        double ufoZ = pUfoGlobal.gibZ();
        double ufoY = pUfoGlobal.gibY();
        double ufoRadius = 30;


        if (
                (((ufoX - ufoRadius < asteroidX() + radiusAsteroid && ufoX - ufoRadius > asteroidX() - radiusAsteroid)
                        && (ufoZ - ufoRadius < asteroidZ() + radiusAsteroid && ufoZ - ufoRadius > asteroidZ() - radiusAsteroid)
                        && (asteroidY() > -50) && (asteroidY() < 50))

                        || ((ufoX + ufoRadius < asteroidX() + radiusAsteroid && ufoX + ufoRadius > asteroidX() - radiusAsteroid)
                        && (ufoZ - ufoRadius < asteroidZ() + radiusAsteroid && ufoZ - ufoRadius > asteroidZ() - radiusAsteroid)
                        && (asteroidY() > -50) && (asteroidY() < 50))))
         {
                return true;
            }
        else{
            return false;
        }


    }


}


