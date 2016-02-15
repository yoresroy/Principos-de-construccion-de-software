package agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    public void Contacto(String Nombre,String Apellido,String Telefonos,String RedesSociales,String PaginaWeb) {
        
    }
    public class Contacto {

        public String Nombre;
        public String Apellido;
        public List Telefonos;
        public List RedesSociales;
        public List PaginaWeb;

        public Contacto() {
            
        }
    }

    public static void main(String[] args) {
        ArrayList<Contacto> Contactos;

        Contacto Contacto = new Contacto(String Nombre,String Apellido,String Telefonos,String RedesSociales,String PaginaWeb);
        Contactos.add(Contacto);
        
        System.out.println("Agenda");
        System.out.println("Selecciona lo que deseas hacer");
        
    }
}
