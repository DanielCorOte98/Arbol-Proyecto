package sample;

/**
 * Created by Carlos Daniel on 28/11/2017.
 */
public class Nodo {
    //Declaramos las variables
    private int dato;
    private Nodo izq;
    private Nodo der;

    //Definimos el constructor
    public Nodo (int dato){
        this.dato = dato;
    }

    //Espeificamos los get correspondientes
    public Nodo getNodoIzquierdo(){
        return izq;
    }
    public Nodo getNodoDerecho(){
        return der;
    }

    //Especificamos los set correspondientes.
    public void setNodoDerecho(Nodo nodo){
        der = nodo;
    }
    public void setNodoIzquierdo(Nodo nodo){
        izq = nodo;
    }

    //Para obtener el dato.
    public int getDato(){
        return dato;
    }
}
