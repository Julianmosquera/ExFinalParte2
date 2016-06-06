
package examenfinalparte2;

import static examenfinalparte2.Principal.p;

/**
 *
 * @author julian
 */
public class Metodos {
    
    int dig = 2;
    int ndig = 0;
    
   
    
    /**
     * Método que comprueba si es positivo
     */
    public void comp(){
        if (dig <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
    }
     
    /**
     *  Es un metodo con un blucle que recorre la variable i mientras el valor sea entre 1 y 99999
     */
    public void calcprim(){
         for (int i = 1; i <= 99999; i++) {
            int aux = i;

            int contador = 0;

            while (aux != 0) {
                aux = aux / 10;
                contador++;
            }
           /**
            * Se iguala la variable ndig al contador 
            */
            ndig = contador;

         
            
            if (ndig == dig) {
                if (i < 4) {
                    p = true;
                } else {
                    if (i % 2 == 0) {
                        p = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int k = (i - 1) / 2;
                        if (k % 2 == 0) {
                            k--;
                        }

                        while (i1 <= k) {
                            if (i % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = k + 1;
                            }
                        }

                        if (contador1 == 1) {
                            p = true;
                        }
                    }
                }

                if (p == true) {
                    System.out.println(i);
                }
            }
        }
    }
    
    
    
}
