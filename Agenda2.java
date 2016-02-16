package agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private static class Contacto {

        String Nombre; 
        String Apellido;
        List Telefonos;
        List RedesSociales;
        List PaginaWeb;

        public void Contacto(String NombreRecibido, String ApellidoRecibido, String TelefonoRecibido,String RedesSocialesRecibidas, String PagiaWebRecibida) {
            
        }
    }

    public static void main(String[] args) {
        ArrayList<Contacto> Contactos;
        
        int Seleccion=0;
        do{
            System.out.println("Agenda");
        System.out.println("Selecciona lo que deseas hacer");
        }while(Seleccion==0);
        
        Contacto Contacto;
        //Contactos.add(Contacto);
    }
}
