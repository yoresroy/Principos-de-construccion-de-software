/*l programa es una agenda para guardar contactos con distintas caracteristicas
El contacto debe tener nombre, apellido, telefonos, redes sociales y una pagina web.

Se usara un arreglo de  listas para poder guardar los contactos
 */
package agenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {

    private static class Contacto {//Clase contacto con sus atributos

        String Nombre;
        String Apellido;
        ArrayList<String> Telefonos = new ArrayList<String>();
        ArrayList<String> RedesSociales = new ArrayList<String>();
        ArrayList<String> PaginasWeb = new ArrayList<String>();

        public void Contacto(String nombreRecibido, String apellidoRecibido,
                String telefonoRecibido, String redesSocialesRecibidas, String paginaWebRecibida) {
            Nombre = nombreRecibido;
            Apellido = apellidoRecibido;
            Telefonos.add(telefonoRecibido);
            RedesSociales.add(redesSocialesRecibidas);
            PaginasWeb.add(paginaWebRecibida);
        }

        //Metodos de la clase agenda
        private void setNombre(String nombreRecibido) {
            Nombre = nombreRecibido;
        }

        private void setApellido(String apellidoRecibido) {
            Apellido = apellidoRecibido;
        }

        private void setTelefono(String numeroRecibido) {
            Telefonos.add(numeroRecibido);
        }

        private void setRedSocial(String redSocialRecibida) {
            RedesSociales.add(redSocialRecibida);
        }

        private void setPaginaWeb(String paginaWebRecibida) {
            PaginasWeb.add(paginaWebRecibida);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Contacto> Contactos = null;
        Contacto nuevo = new Contacto();
        //ArrayList<Contacto> Contactos = new ArrayList<Contacto>();
        //Se utuliza para las opciones del menu
        int Seleccion;
        char AgregarTelefono = '1';
        char AgregarRedSocial = '2';
        char AgregarPaginaWeb = '3';

        Boolean Repite = true;
        String Nombre, Apellido, Telefono, RedSocial, PaginaWeb, Auxiliar;
        do {
            System.out.println("Agenda");
            System.out.println("Selecciona lo que deseas hacer\n 1 Agregar nuevo contacto");
            Seleccion = teclado.nextInt();
            switch (Seleccion) {
                case 0:
                    System.out.println("Hasta luego");
                    Seleccion = 0;
                    break;
                case 1:

                    teclado.nextLine();
                    System.out.println("Ingrese el nombre");
                    Nombre = teclado.nextLine();
                    nuevo.setNombre(Nombre);
                    System.out.println("Ingrese el Apellido");
                    Apellido = teclado.nextLine();
                    nuevo.setApellido(Apellido);
                    while (Repite == true) {
                        System.out.println("Ingrese el Telefono");
                        Telefono = teclado.nextLine();
                        nuevo.setTelefono(Telefono);
                        System.out.println("Deseas agregar otro numero?[S]=Si, [N]=No");
                        Auxiliar = teclado.nextLine();
                        if ("N".equals(Auxiliar)||"n".equals(Auxiliar)) {
                            System.out.println("Perro muerto");
                            Repite=false;
                        } else {
                            System.out.println("Nuevo telefono");
                        }
                    }
                    Repite = true;
                    while (Repite == true) {
                        System.out.println("Ingrese su Red Social");
                        RedSocial = teclado.nextLine();
                        nuevo.setRedSocial(RedSocial);
                        System.out.println("Deseas agregar otra red social?[S]=Si, [N]=No");
                        Auxiliar = teclado.nextLine();
                        if ("N".equals(Auxiliar)||"n".equals(Auxiliar)) {
                            Repite = false;
                        } else {
                            System.out.println("Nuevo telefono");
                        }
                    }
                    Repite = true;
                    while (Repite == true) {
                        System.out.println("Ingrese su pagina web");
                        PaginaWeb = teclado.nextLine();
                        nuevo.setPaginaWeb(PaginaWeb);
                        System.out.println("Deseas agregar pagina web?[S]=Si, [N]=No");
                        Auxiliar = teclado.nextLine();
                        if ("N".equals(Auxiliar)||"n".equals(Auxiliar)) {
                            Repite = false;
                        } else {
                            System.out.println("Nuevo telefono");
                        }
                    }
                    Contactos.add(nuevo);
                default:
                    System.out.println("Seleccion incorrecta\nTrate de nuevo");
            }

        } while (Seleccion != 0);
    }
}
