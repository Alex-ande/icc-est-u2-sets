package Models;

public class Contacto {
   String nombre;
   String apellido;
   String telefono;
   public Contacto (String nombre, String apellido, String telefono){
this.nombre = nombre;
this.apellido = apellido;
this.telefono = telefono;

   } 
   public String getNombre() {
    return nombre;
}

   public String getApellido() {
    return apellido;
}

   public String getTelefono() {
    return telefono;
    @
}
@Override
 public String toString (){
    return "Contacto [nombre ="+ nombre + ", apellido =" + apellido +", telefono ="+ telefono + "]";
 }
public boolean equals (Object obj) {
if (this == obj) 
    return false;
    if (obj == null)
    return false;
if (getClass() != obj.getClass())
return false;

Contacto other = (Contacto) obj;
return nombre.equals(other.apellido)&& apellido.equals(other.apellido);


}
   
}
