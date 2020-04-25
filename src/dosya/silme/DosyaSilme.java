
package dosya.silme;

import java.io.File;

/**
 *
 * @author tlgun
 */
public class DosyaSilme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        File dosya = new File("silinecek dosya.txt");//silinecek dosya adında nesne oluştu
        try {
 
            if (dosya.exists()) //if içinde dosyanın varlığını kontrol ediyor
            {  
                   dosya.delete(); //dosya olduğu için siliyor
                    System.out.println("dosya silindi"); 
                
            }
            else
            {
                System.out.println("dosya silinemedi");
            }
            }
        catch (Exception e)
        {
            
        }
    }
}

