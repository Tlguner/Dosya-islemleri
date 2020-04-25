
package klasör.silme;

import java.io.File;

/**
 *
 * @author tlgun
 */
public class KlasörSilme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      File klasör =new File("C:\\Users\\tlgun\\Desktop\\oop\\klasör");// klasörün yeri ve adı verildi
        
        try {
            if (klasör.exists())                             //if içinde klasör varlığı kontrol edilir
            {
                klasör.delete();                               //klasör silindi
                System.out.println("klasör silindi");
            }
            else
            {
                System.out.println("klasör bulunamadı");
            }
            
        } catch (Exception e) {
        }
    }
    
}
