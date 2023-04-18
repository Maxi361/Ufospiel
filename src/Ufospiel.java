import GLOOP.*;
public class Ufospiel{
    private GLKamera kamera;
    private GLLicht licht,licht2;
    private GLTastatur tastatur;
    private GLHimmel himmel;

    private Ufo dasUfo;
    private Explosion explosion;
    private GLTafel ende, leben,hintergrund;
    int lebenAnzahl;




    Asteroid[] asteroid ;
    //[...]

    public Ufospiel() {
        //kamera = new GLEntwicklerkamera();
        kamera = new GLKamera();
        kamera.setzePosition(0, -700, 0);
        kamera.setzeBlickpunkt(0,0,0);
        licht = new GLLicht();
        licht2 = new GLLicht();
        licht2.setzePosition(0,-750,0);
        tastatur = new GLTastatur();
        //himmel = new GLHimmel("src/img/Weltraum.jpg");
        hintergrund = new GLTafel(0,10000,0,60000,30000,"src/img/Weltraum.jpg");
        hintergrund.drehe(90,90,0);

        dasUfo = new Ufo();
        explosion = new Explosion(dasUfo);

        ende = new GLTafel(0,0,0,300,300);
        ende.setzeText("Ende",250);
        ende.drehe(90,180,0);
        ende.setzeSichtbarkeit(false);

        lebenAnzahl = 4;
        leben = new GLTafel(-100,-350,50,150,150);
        leben.drehe(90,180,0);
        leben.setzeTextur("src/img/lebenGedreht.png");
        leben.setzeText(""+lebenAnzahl,100);
        leben.setzeSichtbarkeit(true);





        asteroid = new Asteroid [80];
        for (int i=0;i<asteroid.length ;i++){
            asteroid [i] = new Asteroid(dasUfo);


        }

        while(0==0) {
            this.weiter();
        }



        }



int b=0;
        public void weiter(){
            Sys.warte(3000);
            while (b<4){
                for (int i=0;i<asteroid.length ;i++) {
                    asteroid[i].Bewegen();
                }

                Sys.warte(5);
                for (int i=0;i<asteroid.length;i++) {
                        if (asteroid[i].getroffen()== true){
                            dasUfo.ufoExplodiere();
                            explosion.explodiere();
                            Sys.warte(3000);
                            explosion.resetExplosion();
                            dasUfo.zurücksetzen();
                            kamera.setzePosition(0,-700,-250);
                            b=b+1;
                            for (;i<asteroid.length ;i++) {
                                asteroid[i].aufstartwert();
                            }
                            lebenAnzahl=lebenAnzahl-1;
                            leben.setzeText(""+lebenAnzahl,100);
                            leben.setzePosition(-100,-350,50);


                        }
                    }

                    ende.setzePosition(dasUfo.gibX()+0,dasUfo.gibY()-200,dasUfo.gibZ()+0);

                    if (tastatur.istGedrueckt('a') && (dasUfo.ufoX() < 500)) {
                        dasUfo.bewegeLinks();
                        kamera.verschiebe(4,0,0);
                        leben.verschiebe(4,0,0);
                    }
                    if (tastatur.istGedrueckt('d') && (dasUfo.ufoX() > -500)) {
                        dasUfo.bewegeRechts();
                        kamera.verschiebe(-4,0,0);
                        leben.verschiebe(-4,0,0);


                    }
                    if (tastatur.istGedrueckt('s') && (dasUfo.ufoZ() > -500)) {
                        dasUfo.bewegeUnten();
                        kamera.verschiebe(0,0,-4);
                        leben.verschiebe(0,0,-4);


                    }
                    if (tastatur.istGedrueckt('w') && (dasUfo.ufoZ() < 500)) {
                        dasUfo.bewegeOben();
                        kamera.verschiebe(0,0,4);
                        leben.verschiebe(0,0,4);


                    }

                    if (!tastatur.istGedrueckt('w')
                            && !tastatur.istGedrueckt('s')
                            && !tastatur.istGedrueckt('d')
                            && !tastatur.istGedrueckt('a')){
                        dasUfo.ufoDrehung0();

                    }

                        kamera.setzeBlickpunkt(dasUfo.ufoX(),dasUfo.ufoY(),dasUfo.ufoZ());

                    explosion.explosionBewege();
            }

            ende.setzeSichtbarkeit(true);
            leben.setzeSichtbarkeit(false);

        }
}
