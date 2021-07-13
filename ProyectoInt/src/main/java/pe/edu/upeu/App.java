package pe.edu.upeu;
import java.io.Console;
import pe.edu.upeu.Datos.Usuarios;
import pe.edu.upeu.Contactos.Menucontactos.*;

import pe.edu.upeu.Utils.*;
/**
 * Hello world!
 *
 */
public class App {
    
    public static void validarAccesoAdministrador() {
        int adminop;
        LeerTeclado teclado=new LeerTeclado();
        System.out.println("****************Ingresar al Sistema*************");
        String usuario=teclado.leer("", "Ingrese su Usuario:");
        Console cons=System.console();
        System.out.println("Ingrese su clave:");
        char[] clave=cons.readPassword();
        Usuarios Usuariogen=new Usuarios();

        if(Usuariogen.login(usuario, String.valueOf(clave))){
            registro();
        }else{
            System.out.println("Error!...Intente Nuevamente!!");
            validarAccesoAdministrador();
        }
    }
    public static void registro() {
        LeerTeclado teclado=new LeerTeclado();
        int adminop;
        System.out.println("1.- Registrar nuevo administrador"+"\n2.-Eliminar administrador"+"\n3.- Administrar contactos");
        adminop=teclado.leer(0, "Ingrese la opción correspondiente:");
        switch(adminop){
            case 1: Usuarios registro=new Usuarios();
            registro.registarUsuario();
            case 2: Usuarios registros=new Usuarios();
            registros.eliminarUsuario();
            break;
    
        }
    }
    


    public static void Menuinicio() {
        LeerTeclado opcion=new LeerTeclado();
        int inicio=0;
        String mensaje="|-----|Bienvenido al sistema de registro de habilidades con competencias especificas en el Area de sistemas|-----|"+
        "\n1.- Ingresar como Administrador"+
        "\n2.- Ingresar como cliente";
        System.out.println(mensaje);
        inicio=opcion.leer(0,"Ingrese la opción correspondiente:");
        
        do {                        
            switch (inicio) {
                case 1:validarAccesoAdministrador();
                break;
                case 2:
                break;
                default: System.out.println("La opcion no existe!"); break;    
            }             
            if (inicio!=0) {  
                String dato=opcion.leer("", "Desea volver?: SI/NO");              
                if(dato.toUpperCase().equals("SI")){
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
