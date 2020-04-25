
package dosya.oluşturma.pkg1;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author tlgun
 */
public class DosyaOluşturma1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File dosya=new File("C:\\Users\\tlgun\\Desktop\\oop\\örnek.txt");
        //oluşturacağımız dosya masaüstünde ve oop adında txt formatında oluşucaktır
        
        try {
            if (!dosya.exists()) //verdiğimiz adreste aynı isimle dosya yoksa dosyayı oluştur
            {
                dosya.createNewFile();
                System.out.println("dosyanız oluştu");
            }
            else
            {
                System.out.println("Aynı isimde dosya var");
            }
            
        } 
        catch (IOException e) {
        }
        
    }
    
}
