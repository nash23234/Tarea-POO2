public class Casilla {
    public int posicion = 0;

    
    public Casilla(int posicion) {
        this.posicion = posicion;
    }

    public void avanzar(int caras) {
        posicion += caras;
    }
    
    
}
