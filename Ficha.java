public class Ficha { //clase ficha

    public String color; //color de la ficha
    public int posicion; //posicion de la ficha

    Dado dado = new Dado(6); //crear un dado de 6 caras

    public Ficha (String color, int posicion) { //constructor
        this.color = color; //asignar color
        this.posicion = posicion;  //asignar posicion
    }

    public void avanzar(int caras) { //avanzar la ficha
        int resultado = dado.lanzar(); //lanzar el dado
        posicion += resultado; //avanzar la ficha
        System.out.println("La ficha ha avanzado " + resultado + " casillas"); //mostrar que ha avanzado
    }
}
