package pe.edu.upeu;
import java.io.Console;
import pe.edu.upeu.Datos.Usuarios;
import pe.edu.upeu.Contactos.Menucontactos;
import pe.edu.upeu.Contactos.Contactos1;

import pe.edu.upeu.Utils.*;

public class App {
    public static void validarAccesoAdministrador() {
        int adminop;
        LeerTeclado teclado=new LeerTeclado();
        System.out.println("|--------------Ingresar al Sistema de Administración-----------------|");
        String usuario=teclado.leer("", "Ingrese el Usuario:");
        Console cons=System.console();
        System.out.println("Ingrese la clave:");
        char[] clave=cons.readPassword();
        Usuarios Usuariogen=new Usuarios();

        if(Usuariogen.login(usuario, String.valueOf(clave))){
            menuadministrador();
        }else{
            System.out.println("Error: inténtelo nuevamente.");
            validarAccesoAdministrador();
        }
    }
    public static void menuadministrador() {
        LeerTeclado teclado=new LeerTeclado();
        int adminop;
        System.out.println("1.- Registrar nuevo administrador"+"\n2.- Eliminar administrador"+"\n3.- Administrar contactos");
        adminop=teclado.leer(0, "Ingrese la opción correspondiente:");
        switch(adminop){
            case 1: Usuarios registro=new Usuarios();
            registro.registarUsuario();
            case 2: Usuarios registros=new Usuarios();
            registros.eliminarUsuario();
            case 3: Contactos1 registr=new Contactos1();
            registr.Menucontacos();
            break;
    
        }
    }
    


    public static void Menuinicio() {
        LeerTeclado opcion=new LeerTeclado();
        int inicio=0;
        String mensaje="|--------|Bienvenido al sistema de registro de habilidades con competencias especificas en el Area de sistemas|--------|"+
        "\n1.- Ingresar como Administrador"+
        "\n2.- Ingresar como cliente";
        System.out.println(mensaje);
        inicio=opcion.leer(0,"Ingrese la opción correspondiente:");
        
        do {                        
            switch (inicio) {
                case 1:validarAccesoAdministrador();
                break;
                case 2:Menucontactos menutr=new Menucontactos();
                menutr.Menuprincipal();
                break;
                default: System.out.println("Error: la opción que coloco no existe."); break;    
            }             
            if (inicio!=0) {  
                String dato=opcion.leer("", "¿Desea volver al menú?: Si/No");              
                if(dato.toUpperCase().equals("SI")){
                    inicio=opcion.leer(0, mensaje);}
                if(dato.toUpperCase().equals("S")){
                    inicio=opcion.leer(0, mensaje);        
                }else{
                    inicio=0;
                }                
            }
        } while (inicio!=0);        
    }
        
    
    


    public static void main(String[] args) {
        Menuinicio();
    }
}
