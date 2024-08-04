
package Diccionarios;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Diccionario {
      private HashMap<String, String> diccionario;
      
          public Diccionario() {
        diccionario = new HashMap<>();
    }
          
             public void agregarPalabra(String palabra, String significado) {
        diccionario.put(palabra, significado);
    }
             
              public String buscarPalabra(String palabra) {
        return diccionario.get(palabra);
    }
              
               public String listarPalabras() {
        StringBuilder sb = new StringBuilder();
        Set<Map.Entry<String, String>> entradas = diccionario.entrySet();
        
        for (Map.Entry<String, String> entrada : entradas) {
            sb.append(entrada.getKey()).append(" - ").append(entrada.getValue()).append("\n");
        }
        
        return sb.toString();
    }
}
