package clases;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Una clase con un main() simple para probar la clase TSBHashtableDA.
 * @author Ing. Valerio Frittelli.
 * @version Octubre de 2017.
 */
public class Test 
{
    public static void main(String args[]) throws CloneNotSupportedException {
        // una tabla "corta" con factor de carga pequeño...
        TSBHashTableDA<Integer, String> ht1 = new TSBHashTableDA<>(3, 0.2f);

        System.out.println("Contenido inicial: " + ht1);
        // algunas inserciones...
        ht1.put(1, "Argentina");
        ht1.put(2, "Brasil");
        ht1.put(3, "Chile");
        ht1.put(4, "Mexico");
        ht1.put(5, "Uruguay");
        ht1.remove(3);
        //ht1.put(6, "Perú");
        //ht1.put(7, "Colombia");
        //ht1.put(8, "Ecuador");
        //ht1.put(9, "Paraguay");
        //ht1.put(10, "Bolivia");
        //ht1.put(11, "Venezuela");
        //ht1.put(12, "Estados Unidos");
        System.out.println("Luego de algunas inserciones: " + ht1);
        System.out.println("GET: " + ht1.get(3));
        System.out.println(ht1.contains("Uruguay"));
        TSBHashTableDA<Integer, String> ht2 = (TSBHashTableDA<Integer, String>) ht1.clone();
        System.out.println("Clone: " + ht2);
        /*
        TSBHashTableDA<Integer, String> ht2 = new TSBHashTableDA<>(ht1);
        System.out.println("Segunda tabla: " + ht2);
        
        System.out.println("Tabla 1 recorrida a partir de una vista: ");
        Set<Map.Entry<Integer, String>> se = ht1.entrySet();
        Iterator<Map.Entry<Integer, String>> it = se.iterator();
        while(it.hasNext())
        {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println("Par: " + entry);
        }*/
    }
}
