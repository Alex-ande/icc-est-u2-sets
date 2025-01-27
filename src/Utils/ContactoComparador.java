package Utils;

import java.util.Comparator;

import Models.Contacto;

public class ContactoComparador implements Comparator <Contacto>{
   @Override
   public int compare (Contacto c1, Contacto c2){
      int comparacionApellido = c1.getApellido().compareToIgnoreCase(c2.getApellido());
//primero comparamos apellidos
if (comparacionApellido != 0) {
    return comparacionApellido;
}
// si los apellido son iguales , si los nomres son iguales
return c1.getNombre().compareToIgnoreCase(c2.getNombre());
   }
}
