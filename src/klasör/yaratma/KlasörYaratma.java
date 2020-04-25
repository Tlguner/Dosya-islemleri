
package klasör.yaratma;

import java.io.File;

/**
 *
 * @author tlgun
 */
public class KlasörYaratma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File klasör =new File("C:\\Users\\tlgun\\Desktop\\oop\\klasör");//oluşturacağımız klasörün yeri ve adı verildi
        
        try {
            if (!klasör.exists())                             //if içinde klasör varlığı kontrol edilir
            {
                klasör.mkdir();                               //klasör oluştur
                System.out.println("klasör oluştu");
            }
            else
            {
                System.out.println("aynı isimle klasör var");
            }
            
        } catch (Exception e) {
        }
        
    }
    
}
