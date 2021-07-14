package pe.edu.upeu.Contactos;

import pe.edu.upeu.Datos.Appcrud;
import pe.edu.upeu.Utils.LeerArchivo;
import pe.edu.upeu.Utils.LeerTeclado;
import pe.edu.upeu.Datos.Usuarios;


public class Menucontactos{
    LeerTeclado leer=new LeerTeclado();
    
    public void Matematicas() {
        System.out.println("Tenemnos especialdiades en:"+
        "\na.	GEOMETRIA"+
        "\nb.	ALGEBRA"+
        "\nc.	ARITMETICA"+
        "\nd.	TRIGONOMETRIA");
        }
        
    public void Ingles() {
        
    }

    public void programacion() {

    }

    public void estadistica() {
        
    }
    public void informacion() {
        System.out.println("info de la app");
        
    }
    public void apoyo() {
        System.out.println("datos y redes sociales");
    }


    public void Menuprincipal() {
        System.out.println("|---Bievenido al sistema de ayuda de estudiantes.---|"
        +"\n Encuentrar ayuda con:"
        +"\n 1.- Matemáticas"
        +"\n 2.- Inglés"
        +"\n 3.- Programación"
        +"\n 4.- Estadística"
        +"\n ------------------------"
        +"\n 5.- Conocer más sobre la aplicación"
        +"\n 6.- Deseo apoyar esta app");
    int opcionesc=leer.leer(0,"Ingresa la opción correspondiente");
    switch(opcionesc){
            case 1: Matematicas();
            break;
            case 2: Ingles();
            break;
            case 3: programacion();
            break;
            case 4: estadistica();
            break;
            case 5: informacion();
            break;
            case 6: apoyo();
            break;
        default: System.out.println("Opción incorrecta");
        }
        
    }

}