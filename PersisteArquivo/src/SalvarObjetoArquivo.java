import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
 
public class SalvarObjetoArquivo {
 
    public static void salvar(Object objeto, String caminho) {
 
           try {
             ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(caminho));

             stream.writeObject(objeto);
 
             stream.close();
           } catch (Exception exc) {
             exc.printStackTrace();
           }
    }
}