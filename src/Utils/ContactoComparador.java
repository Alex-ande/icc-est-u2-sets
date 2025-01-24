package Utils;

import Models.Contacto;

public class ContactoComparador implemets Comparator <Contacto>{
   @Override
   public int compare (Contacto c1, Contacto c2){
//primero comparamos apellidos
if (comparacionApellido != 0) {
    return comparacionApellido;
}
   }
}
