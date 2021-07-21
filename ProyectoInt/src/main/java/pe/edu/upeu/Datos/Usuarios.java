package pe.edu.upeu.Datos;

import java.io.Console;

import pe.edu.upeu.Datos.Appcrud;
import pe.edu.upeu.Datos.Usuario;
import pe.edu.upeu.Utils.LeerArchivo;
import pe.edu.upeu.Utils.LeerTeclado;
import pe.edu.upeu.Utils.Utilidades;

public class Usuarios extends Appcrud{
    LeerArchivo ver;
    Usuario usuGen;

    LeerTeclado teclado=new LeerTeclado();
    Utilidades ut=new Utilidades();

    public void registarUsuario() {
        usuGen=new Usuario();
        String usuario=teclado.leer("", "Ingrese un usuario:");
        if(validarExisteUser(usuario)){
            usuGen.setUsuario(usuario);        
            ver=new LeerArchivo("Administradores.txt");
            usuGen.setIdUsuario(generarId(ver, 0, "A", 1));
            usuGen.setPerfil(
            teclado.leer("", "Ingrese el cargo asignado: ").toUpperCase());        
            Console cons=System.console();
            System.out.println("Ingrese la clave:");
            char[] pws=cons.readPassword();
            usuGen.setClave(String.valueOf(pws));
            ver=new LeerArchivo("Administradores.txt");
            agregarContenido(ver, usuGen);
        }else{
            System.out.println("El administrador ya existe, pruebe con otro");
            registarUsuario();
        }
    }

    public boolean login(String usuario, String clave) {
        ver=new LeerArchivo("Administradores.txt");
        Object[][] datax=buscarContenido(ver, 1, usuario);
        if(datax!=null && datax.length>0 && datax[0][2].equals(clave)){
            return true;
        }
        return false;
    }

    public boolean eliminarUsuario() {
        ut.clearConsole();
        ver=new LeerArchivo("Administradores.txt");
        imprimirLista(listarContenido(ver));
        ver=new LeerArchivo("Usuario.txt");
        String idU=teclado.leer("", "Ingrese el Id del usuario que desea eliminar:");
        eliminarRegistros(ver, 0, idU);
        return false;
    }    

    public boolean validarExisteUser(String user) {
        ver=new LeerArchivo("Administradores.txt");
        Object[][] datax=buscarContenido(ver, 1, user);    
        if(datax==null || datax.length==0){
            return true;
        }
        return false;
    }
        
}