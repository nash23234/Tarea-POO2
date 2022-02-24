import java.util.Random;

public class Dado { //clase dado
 
    public int caras = 0; //cantidad de caras
    
    //inicializar random
    Random random = new Random(); //crear un objeto random
  

    public Dado(int caras) { //constructor
        this.caras = caras; //asignar caras
    }

    public int lanzar() { //lanzar el dado
        int resultado = random.nextInt(caras) + 1; //generar un numero aleatorio entre 1 y caras (caras es el numero de caras del dado)
        return resultado; //devolver el resultado
    }
 
}