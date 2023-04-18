import GLOOP.*;

public class Explosion {
    GLTafel explosion;
    Ufo pUfoGlobal;
    public Explosion(Ufo pUfo) {
        explosion = new GLTafel(0, 0, 0, 200, 200);
        explosion.setzeTextur("src/img/explosion3.png");
        explosion.setzeSichtbarkeit(false);
        explosion.drehe(-90,90,0);
        pUfoGlobal = pUfo;
    }

    public void explodiere() {
        explosion.setzeSichtbarkeit(true);
        Sys.warte(100);
        explosion.skaliere(2);
        Sys.warte(100);
        explosion.skaliere(2);
        Sys.warte(100);
        explosion.skaliere(2);
        Sys.warte(100);

    }

    public void resetExplosion() {
        explosion.setzeSichtbarkeit(false);
        explosion.setzeSkalierung(1);
    }

    public void explosionBewege() {
        double ufoX = pUfoGlobal.gibX();
        double ufoY = pUfoGlobal.gibY();
        double ufoZ = pUfoGlobal.gibZ();

        explosion.setzePosition(ufoX,ufoY,ufoZ);



    }


}
