package sample;

import java.awt.*;

/**
 * Created by Carlos Daniel on 28/11/2017.
 */
public class ArbolBinario {

    public static void preOrden(Nodo raiz ){
        if(raiz !=null){
            System.out.println (raiz.getDato ()+" ");
            preOrden ( raiz.getNodoIzquierdo () );
            preOrden ( raiz.getNodoDerecho () );
        }
    }
    public static void inOrden(Nodo raiz){
        if(raiz !=null){
            inOrden ( raiz.getNodoIzquierdo () );
            System.out.println (raiz.getDato ()+ " ");
            inOrden ( raiz.getNodoDerecho () );
        }
    }
    public static void postOrden(Nodo raiz){
        if(raiz !=null){
            postOrden ( raiz.getNodoIzquierdo () );
            postOrden ( raiz.getNodoDerecho () );
            System.out.println (raiz.getDato ()+ " ");
        }
    }

    int menor = 9999999;
    int mayor = -99999;
    public void mayorMenor(Nodo raiz, Label label){
        if (raiz != null){
            mayorMenor(raiz.getNodoIzquierdo(),label);

            mayorMenor(raiz.getNodoDerecho(), label);

            if (raiz.getDato() >= mayor ){
                mayor = raiz.getDato();
            }
            if (raiz.getDato() <= menor){
                menor = raiz.getDato();
            }
            label.setText("Número mayor: "+  mayor + "\nNúmero menor: "+ menor);
        }
    }
}
