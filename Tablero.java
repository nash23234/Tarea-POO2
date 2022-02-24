import java.util.ArrayList;
import java.util.List;


public class Tablero {
    public List<Ficha> fichas = new ArrayList<Ficha>();
    public static int cantidadCasillas = 0; //cantidad de casillas del tablero (no se puede modificar) (no se puede modificar)
    public int jugadores = 0;
    public int round = 0;
    Dado dado = new Dado(6);
    
    /**
     * Constructor
     * @param cantidadCasillas
     * @param jugadores
     */
    public Tablero(int cantidadCasillas, int jugadores) {
        Tablero.cantidadCasillas = cantidadCasillas;
        this.jugadores = jugadores;
    }

    /**
     * @method agregarFicha
     * @param ficha ficha a agregar
     * 
     */
    public void agregarFicha(Ficha ficha) {
        fichas.add(ficha);
    }   

    /** 
     * @method avanzar
     * 
     */
    public void avanzar() {
        for (Ficha ficha : fichas) { //recorrer las fichas y avanzar 
            ficha.avanzar();
        }
    }
    
    /** 
     * @method mostrarTablero
     * 
     */
    public void mostrarTablero() {
        for (int i = 0; i < fichas.size(); i++) {
            System.out.println("Ficha " + (i + 1) + ": " + fichas.get(i).color + " en la casilla " + fichas.get(i).posicion);
        }
    }

   
    /**
     * @method aumentarRound
     */

    public void aumentarRound() {
        round++;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public  int getCantidadCasillas() {
        return cantidadCasillas;
    }

    public void setCantidadCasillas(int cantidadCasillas) {
        Tablero.cantidadCasillas = cantidadCasillas;
    }

    public int getJugadores() {
        return jugadores;
    }

    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }

    public List<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }

    public Dado getDado() {
        return dado;
    }

    public void setDado(Dado dado) {
        this.dado = dado;
    }

    public Object getFicha(int i) {
        return fichas.get(i);
    }

    
 

        
    
}







 

 
 

    
  


