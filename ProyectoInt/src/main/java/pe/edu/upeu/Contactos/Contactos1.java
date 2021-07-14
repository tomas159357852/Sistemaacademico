package pe.edu.upeu.Contactos;

import java.io.Console;

import pe.edu.upeu.Datos.Appcrud;
import pe.edu.upeu.Utils.LeerArchivo;
import pe.edu.upeu.Utils.LeerTeclado;
import pe.edu.upeu.Utils.Utilidades;
import pe.edu.upeu.Datos.Usuario;
import pe.edu.upeu.Datos.Contacos;

public class Contactos1 extends Appcrud {
    LeerArchivo ver;
    Contacos usuCont;

    LeerTeclado teclado = new LeerTeclado();
    Utilidades ut = new Utilidades();

    public void registrarContactos() {
        usuCont = new Contacos();
        String usuario = teclado.leer("", "Ingrese el contacto:");
        if (validarExisteUser(usuario)) {
            usuCont.setUsuario(usuario);
            ver = new LeerArchivo("Contactos.txt");
            usuCont.setIdUsuario(generarId(ver, 0, "U", 1));
            usuCont.setEspecialidad(teclado.leer("", "Ingrese la especialidad (Matematicas, ingles, programación, estadística): ").toUpperCase());
            ver = new LeerArchivo("Contactos.txt");
            usuCont.setNumero(teclado.leer("", "Ingrese el numero de contacto: ").toUpperCase());
            agregarContenido(ver, usuCont);
        } else {
            System.out.println("El usuario ya existe....coloque otro usuario");
            registrarContactos();
        }
    }

    public boolean login(String usuario, String clave) {
        ver = new LeerArchivo("Contactos.txt");
        Object[][] datax = buscarContenido(ver, 1, usuario);
        if (datax != null && datax.length > 0 && datax[0][2].equals(clave)) {
            return true;
        }
        return false;
    }

    public boolean EliminarContacto() {
        ut.clearConsole();
        ver = new LeerArchivo("Contactos.txt");
        imprimirLista(listarContenido(ver));
        ver = new LeerArchivo("Contactos.txt");
        String idU = teclado.leer("", "Ingrese el Id del usuario que desea eliminar:");
        eliminarRegistros(ver, 0, idU);
        return false;
    }

    public boolean validarExisteUser(String user) {
        ver = new LeerArchivo("Contactos.txt");
        Object[][] datax = buscarContenido(ver, 1, user);
        if (datax == null || datax.length == 0) {
            return true;
        }
        return false;
    }

    public void Menucontacos(){
        System.out.println(":::::::Bienvenido::::::::"+"\n1.-Registrar Contacto"+"\n2.-Eliminar Contacto");
        int opc=teclado.leer(0,"Ingrese la opción correspondiente");
        switch(opc){
            case 1: registrarContactos();
            break;
            case 2: EliminarContacto();
            break;
            default: System.out.println("Error: opción incorrecta.");
        }
        
    }
}