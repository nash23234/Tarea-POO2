public class Ficha { 

    public String color; 
    public int posicion;
    Dado dado = new Dado(6); 

    /**
     * 
     * @param color
     * @param posicion
     */
    public Ficha(String color, int posicion) { 
        this.color = color; 
        this.posicion = posicion; 
    }

    /** 
     * 
     * @method avanzar
     */
    public void avanzar() {
        int resultado = dado.lanzar(); 
        if (posicion + resultado <= Tablero.cantidadCasillas - 1) { 
            posicion += resultado;
            if (posicion == Tablero.cantidadCasillas - 1) {
                posicion += 1;
            }
        }
        System.out.println("La ficha " + color + " obtuvo " + resultado + " en el dado");
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}