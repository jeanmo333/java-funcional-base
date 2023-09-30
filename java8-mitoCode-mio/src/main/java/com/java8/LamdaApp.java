package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaApp {
    public void ordenar(){
        List<String> lista = new ArrayList<>();
        lista.add("mitocode");
        lista.add("code");
        lista.add("mito");

//        Collections.sort(lista, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });

        lista.sort((String p1, String p2) -> p1.compareTo(p2));

        for ( String elemento : lista){
            System.out.println(elemento);
        }
    }
    public static void main(String[] args) {
     LamdaApp app = new LamdaApp();

     app.ordenar();

    }
}
