import GLOOP.*; 
public class Ufospiel{
    private GLKamera kamera;
    private GLLicht licht;
    private GLTastatur tastatur;
    private GLHimmel himmel;

    private Ufo dasUfo;
    private Asteroid asteroid1,asteroid2,asteroid3;
    //[...]

    public Ufospiel() {
        kamera = new GLSchwenkkamera();
        kamera.verschiebe(0, 200, 500);
        licht = new GLLicht();
        tastatur = new GLTastatur();
        himmel = new GLHimmel("src/img/Sterne.jpg");

        dasUfo = new Ufo();

        asteroid1 = new Asteroid();
        //[...]


        this.weiter();



        }


        public void weiter(){
            while (0==0) {
                asteroid1.bewegedich();
                Sys.warte(5);
                if (tastatur.istGedrueckt('a') && (dasUfo.ufoX() > -500)) {
                    dasUfo.bewegeLinks();
                }
                if (tastatur.istGedrueckt('d') && (dasUfo.ufoX() < 500)) {
                    dasUfo.bewegeRechts();
                }
            }




        }





}
