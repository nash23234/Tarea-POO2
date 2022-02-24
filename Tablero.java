import java.util.ArrayList;
import java.util.List;


public class Tablero {
    public List<Ficha> fichas = new ArrayList<Ficha>();
    public int cantidadCasillas = 0;
    public List<Casilla> casillas = new ArrayList<Casilla>();
    public int jugadores = 0;
    public int turno = 0;

    public Tablero(int cantidadCasillas, int jugadores) {

        this.cantidadCasillas = cantidadCasillas;
        this.jugadores = jugadores;
        this.turno = 0;
    }

    public void agregarFicha(Ficha ficha) {
        fichas.add(ficha);
    }   

    public void mostrarTablero() {
        for (int i = 0; i < fichas.size(); i++) {
            System.out.println("Ficha " + (i + 1) + ": " + fichas.get(i).color + " en la casilla " + fichas.get(i).posicion);
        }
    }


        
    
}







 

 
 

    
  


