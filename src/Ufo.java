import GLOOP.*;
public class Ufo {

    //GLKugel ufo;
    GLQuader ufo;
    GLPrismoid nase, rumpfvorne, cockpit ;
    GLQuader frontscheibe;


    public Ufo() {

        //ufo = new GLKugel(0,0,0,30);
        ufo = new GLQuader(0,0,0,60,60,60);
        ufo.setzeTextur("src/img/Borgcube2.jpg");


        //rot = x links
        //blau = z runter
        // grün = y vor


    }


    //UFo nach links
    public void bewegeLinks(){
        ufo.verschiebe(4,0,0);
        ufo.setzeDrehung(0,-20,0);
    }
    //Ufo nach rechts
    public void bewegeRechts(){
        ufo.verschiebe(-4,0,0);
        ufo.setzeDrehung(0,20,0);

    }
    //Ufo nach oben
    public void bewegeOben(){
        ufo.verschiebe(0,0,4);
        ufo.setzeDrehung(20,0,0);
    }
    //Ufo nach rechts
    public void bewegeUnten(){
        ufo.verschiebe(0,0,-4);
        ufo.setzeDrehung(-20,0,0);
    }

    public void ufoDrehung0(){
        ufo.setzeDrehung(0,0,0);

    }




    //?????   //gibt X Wert von UFO
    public double ufoX(){
        return ufo.gibX();
    }
    public double ufoZ(){
        return ufo.gibZ();
    }

    public double ufoY(){
        return ufo.gibY();
    }



    public double gibX(){
        return ufo.gibX();
    }
    public double gibY(){
        return ufo.gibY();
    }
    public double gibZ(){
        return ufo.gibZ();
    }

    //auf starwert zurücksetzten
    public void zurücksetzen(){
        ufo.setzePosition(0,0,0);
        ufo.setzeDrehung(0,0,0);
        ufo.setzeSichtbarkeit(true);
    }



    public void ufoExplodiere(){
        ufo.setzeSichtbarkeit(false);
        
    }

}
