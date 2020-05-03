
package klasör.adı.değiştirme;
import java.io.File;
/**
 *
 * @author tlgun
 */
public class KlasörAdıDeğiştirme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File  klasör =new File ("C:\\Users\\tlgun\\Desktop\\oop\\klasör");
        File yeni_klasör=new File("C:\\Users\\tlgun\\Desktop\\oop\\yeni klasör adı");
        try
        {
             if (klasör.renameTo(yeni_klasör))
             {
               
                System.out.println("klasör adı değişti");
            }
             else
                 System.out.println("klasör adı değişmedi");
   
        } 
        catch (Exception e)
        {
            
        }
    }
    
}
