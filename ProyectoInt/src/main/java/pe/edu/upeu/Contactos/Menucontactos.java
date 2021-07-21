package pe.edu.upeu.Contactos;

import pe.edu.upeu.Datos.Appcrud;
import pe.edu.upeu.Utils.LeerArchivo;
import pe.edu.upeu.Utils.LeerTeclado;
import pe.edu.upeu.Datos.Usuarios;
import pe.edu.upeu.Contactos.Contactos1;

public class Menucontactos{
    LeerTeclado leer=new LeerTeclado();
    String saltolin = "-----------------------------------------------------------------\n";

    public void Matematicas() {
        System.out.println(saltolin);
        System.out.println("Tenemnos especialdiades en:"+
        "\na.   GEOMETRIA"+
        "\nb.   ALGEBRA"+
        "\nc.   ARITMETICA"+
        "\nd.   TRIGONOMETRIA");
        System.out.println("");
        Contactos1 listar=new Contactos1();
        System.out.println("Aquí tienes información de personas que te puedan ayudar:");
        listar.reportegeneral();


        }
        
    public void Ingles() {
        System.out.print(saltolin);
        System.out.println("Tenemnos especialdiades en:"+
        "\na.   ingles basico"+
        "\nb.   ingles intermedio"+
        "\nc.   ingles avanzado");
    }
 
    public void programacion() {
        System.out.println(saltolin);
        System.out.println("Tenemnos especialdiades en:"+
        "\na.   programacion orientada a objetos"+
        "\nb.   programacion basica de python"+
        "\nc.   programacion basica en java"+
        "\nd.   programacion intermedia en java"+
        "\ne.   progrmacion intermedia de python");
    }
 
    public void estadistica() {
        System.out.println(saltolin);
        System.out.println("Tenemnos especialdiades en:"+
        "\na.   estadistica basica"+
        "\nb.   estadistica intermedia");
    }
    public void informacion() {
        System.out.println(saltolin);
        System.out.println("la app esta orientada para al apoyo orientado a los alumnos"+
        "\nde la universidad peruana union de la ciudad de juliaca, la app esta constituida"+
        "\npara ayudar tanto en materias de diferentes cursos como en orientacion de la facultad"+
        "\nde ingenierias.");
    }
    public void apoyo() {
        System.out.println(saltolin);
        System.out.println("puedes apoyar esta app compartiendola con tus compañeros de clase"+
        "\no mandandonos un mensaje a nuestros correos personales"+
        "\na. legion1591@gmail.com"+
        "\nb. miguel2dre@gmail.com");
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