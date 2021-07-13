package pe.edu.upeu.Utils;

import java.net.URL;
import javax.swing.table.TableModel;
public class Utilidades {
    public URL getFile(String ruta){
        return this.getClass().getResource("/"+ruta);
        }
    
        public TableModel reporData() {
        return null;
        }
    
        public final void clearConsole(){
            try{            
                final String os = System.getProperty("os.name");    
                if (os.contains("Windows")){
                   new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                }
                else{
                    new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
                }
            }
            catch (final Exception e){
               System.out.println("Error: "+e.getMessage());
            }
           System.out.println("------------------------------------------------"); 
        }
}