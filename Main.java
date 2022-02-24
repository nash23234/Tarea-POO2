public class Main {
    public static void main(String[] args) {
        Tablero tablero = new Tablero(20, 4);
        
        
        tablero.agregarFicha(new Ficha("rojo", 0)); //ficha 1
        tablero.agregarFicha(new Ficha("azul", 0)); //ficha 2
        tablero.agregarFicha(new Ficha("verde", 0)); //ficha 3
        tablero.agregarFicha(new Ficha("amarillo", 0)); //ficha 4

        
        System.out.println("Cantidad de casillas: " + Tablero.cantidadCasillas);
        System.out.println("Cantidad de jugadores: " + tablero.jugadores);
        System.out.println("\n");

        System.out.println("Fichas: \n");
        tablero.mostrarTablero();
        System.out.println("\n");

        
        for (int i = 0; i < tablero.fichas.size(); i++) {
            while(tablero.fichas.get(i).posicion != tablero.getCantidadCasillas()) {
                if(tablero.fichas.get(0).posicion == 20) {
                    System.out.println("Ficha " + (i + 1) + ": " + tablero.fichas.get(i).color + " no es el ganador");   
                   
                    break;
                }else if (tablero.fichas.get(1).posicion == 20) {
                    System.out.println("Ficha " + (i + 1) + ": " + tablero.fichas.get(i).color + " no es el ganador");
                    
                    break;
                }else if (tablero.fichas.get(2).posicion == 20) { //si la ficha 3 esta en la casilla 20, se detiene
                    System.out.println("Ficha " + (i + 1) + ": " + tablero.fichas.get(i).color + " no es el ganador");   
                   
                    break;
                }else if (tablero.fichas.get(3).posicion == 20) { //si la ficha 4 esta en la casilla 20, se detiene
                    System.out.println("Ficha " + (i + 1) + ": " + tablero.fichas.get(i).color + " no es el ganador"); 
                    
                    break;
                }

                        
            tablero.aumentarRound();
            System.out.println("\nRound: " + tablero.getRound()); 
            System.out.println("\n");
                        
            System.out.println("Tirando el dado...\n");
            tablero.avanzar();
            System.out.println("\n");
                        
            System.out.println("posicion actual de las fichas\n");
            tablero.mostrarTablero();
            System.out.println("\n"); 
        }
    } 
}
           
}
    
  //end class