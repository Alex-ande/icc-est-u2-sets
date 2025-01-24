import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public Set<String> construirHashSet (){
        Set<String> miHashSet = new HashSet<>();
        miHashSet.add("manzana");
        miHashSet.add("pera");
        miHashSet.add("melocoton");
        miHashSet.add("melon");
        miHashSet.add("uva");
        return miHashSet;
    }

    public static Set<String> construirLinkedHashSet (){
        Set<String> miLinkedHashSet = new LinkedHashSet<>();
        
        miLinkedHashSet.add("manzana");
        miLinkedHashSet.add("pera");
        miLinkedHashSet.add("melocoton");
        miLinkedHashSet.add("melon");
        miLinkedHashSet.add("pero");
        return miLinkedHashSet;
    }
    public Set<String> construirTreeSett () {
        Set<String> miTreeSet = new TreeSet<>();
        miTreeSet.add("manzana");
        miTreeSet.add("melovoton");
        miTreeSet.add("melon");
        miTreeSet.add("pera");
        return miTreeSet;
       
    }  
    public Set<String> construirTreeSetConComparador (){
        //implemetancion de comparador para ordenar por longuitud y 
        Comparator<String> comparadorPorLonguitud = new Comparator<String>() {
         @Override   
         public int compare (String s1, String s2){
       // primero comparamos la longuitud
       int resultado = Integer.compare(s1.length(), s2.length());
       if (resultado == 0) {
        resultado = s1.compareTo(s2);
       }
       return resultado;
         }

        };
        Set<String> miniTreeSetComparador = new TreeSet<>(comparadorPorLonguitud);
        miniTreeSetComparador.add("melon");
        miniTreeSetComparador.add("kiwi");
        miniTreeSetComparador.add("manzana");
        miniTreeSetComparador.add("fresa");
        miniTreeSetComparador.add("melocoton");
        miniTreeSetComparador.add("pera");
        return miniTreeSetComparador;
    } 


}
