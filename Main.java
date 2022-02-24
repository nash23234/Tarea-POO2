public class Main {
    public static void main(String[] args) {
        Tablero tablero = new Tablero(40, 4);
        tablero.agregarFicha(new Ficha("rojo", 0)); //ficha 1
        tablero.agregarFicha(new Ficha("azul", 0)); //ficha 2
        tablero.agregarFicha(new Ficha("verde", 0)); //ficha 3
        tablero.agregarFicha(new Ficha("amarillo", 0)); //ficha 4

    }
        
}