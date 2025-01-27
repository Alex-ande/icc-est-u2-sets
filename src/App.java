import java.util.Set;
import java.util.TreeSet;

import Models.Contacto;
import Utils.ContactoComparador;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
       // runHashSet ();
       // runLinkedHashSet ();
       // runTreeSet ();
       // runTreeSetConComparador ();
        runEjercicio();
    }
    public static void runHashSet (){
        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.construirHashSet();
        System.out.println("-------HashSet-----");
        System.out.println("elemetos del HashSet : nose garantisa orden");
        for (String elemeto : ejemploHashSet) {
            System.out.println(elemeto);
        }
    }
    public static void runLinkedHashSet (){
        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.construirLinkedHashSet();
        System.out.println("-------LinkedHashSet-----");
        System.out.println("elemetos del HashSet : respeta orden deinsercion"); 
        for (String elemplo : ejemploHashSet) {
            System.out.println(elemplo);
        }
    }
    public static void runTreeSet(){
        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.construirTreeSett();
        System.out.println("-------runTreeSet-----");
        System.out.println("elemetos del HashSet : orden alfabetico");  
        for (String elemento : ejemploHashSet) {
        System.out.println(elemento);
        } 
    }
    public static void runTreeSetConComparador (){
        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.construirTreeSetConComparador();
        System.out.println("-----ComparadorconstruirTreeSe-------");
        System.out.println("elemetos del HashSet : respeta orden deinsercion"); 
        for (String elemplo : ejemploHashSet) {
            System.out.println(elemplo);
        }  
    }
    public static void runEjercicio (){
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparador());
        Contacto c1 = new Contacto("pedro", "lopez", "123456789");
        Contacto c2 = new Contacto("pedro", "lopez", "123456789");
        System.out.println(c1);
        System.out.println(c2);

        System.out.println("referencia en memoria");
        boolean comparacionReferencia = c1 == c2;

        System.out.println(comparacionReferencia);
        System.out.println("c1:"+ c1+ "==c2"+ c2+ "="+comparacionReferencia);

        System.out.println("Comparacion con equals");
        System.out.println(c1.equals(c2));
        boolean comparacionEquals = c1.equals(c2);
        System.out.println( "c1"+ c1+ "==c2:"+ c2+ "="+ comparacionEquals);

        System.out.println("comparciob  con hascode");
        boolean comparcionHashCode = c1.hashCode() == c2.hashCode();
        System.out.println(comparcionHashCode);
        System.out.println("c1:"+ c1.hashCode()+ "==c2:"+ c2.hashCode()+ "="+comparcionHashCode);

        // agregamos algunos contactos
        
        agenda.add(new Contacto("pedro", "lopez", "2222222222"));
        agenda.add(new Contacto("luis", "Perez", "1111111111"));
        agenda.add(new Contacto("ana", "perz", "987654321"));
        agenda.add(new Contacto("pedro", "lopez", "123456789"));

        System.out.println("contactamos en la agenda : Ordenasdas por apellido y luego nombre");
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }

    }
}
