package practica4;
public class Mesa {
    //atributos
    private int numero;
    private boolean ocupada;
    private int numLugares;

    public Mesa(int numero, int numLugares, boolean ocupada) {
        this.numero = numero;
        this.ocupada = ocupada;
        this.numLugares = numLugares;
    }
    public boolean getOcupada(){
      return ocupada;
    }
}
