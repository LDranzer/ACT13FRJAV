/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marvelsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author a
 */
public class MarvelSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        //Se declara la lista, en este caso MarvelHeroes
        List<String> marvelHeroes = new ArrayList<>();

        //Se agregan los valores de String al ArrayList
        marvelHeroes.add("SpiderMan ");
        marvelHeroes.add("Wolverine ");
        marvelHeroes.add("Xavier ");
        marvelHeroes.add("Cap America ");
        marvelHeroes.add("IronMan ");
        marvelHeroes.add("Cyclops ");
        marvelHeroes.add("Hawkeye ");
        marvelHeroes.add("Hulk ");
        marvelHeroes.add("Dr. Strange ");
        marvelHeroes.add("Ant Man ");

        //Se le llama a la clase anonima con el Collections, 
        //comparando alfabéticamente con referencia
        
       /* Collections.sort(marvelHeroes, new Comparator<String>() {
            @Override
            public int compare(String hero1, String hero2) {
                return hero1.compareTo(hero2);
            }
        });*/

       // O SE PUEDE ESCRIBIR ASI EL METODO, SIENDO LA EXPRESION LAMBDA
        Collections.sort(marvelHeroes, (m1, m2) -> m1.compareTo(m2));
        

        //O INCLUSO ASI
        //Collections.sort(marvelHeroes, Comparator.naturalOrder());
        
        

        //Se imprime el resultado final
        marvelHeroes.forEach(System.out::print);
        
    }
    
}
