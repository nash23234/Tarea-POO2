import java.util.Random;

public class Dado { 
 
    public int caras = 0; 

    Random random = new Random(); 
  

    /**
     * 
     * @param caras
     */
    public Dado(int caras) {
        this.caras = caras;
    }

    /**
     * 
     * @method lanzar
     */
    public int lanzar() {
        return random.nextInt(1,caras) ;

    }
       
 
}