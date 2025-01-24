import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        runHashSet ();
        runLinkedHashSet ();
        runTreeSet ();
        runTreeSetConComparador ();
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
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator);
    }
}
