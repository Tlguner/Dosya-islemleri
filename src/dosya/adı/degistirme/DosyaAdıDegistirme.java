
package dosya.adı.degistirme;

import java.io.File;

/**
 *
 * @author tlgun
 */
public class DosyaAdıDegistirme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File dosya= new File("oop.txt");
        File yeni_dosya=new File("nesne tabanlı programlama");
        
        
        try {
                  if (dosya.renameTo(yeni_dosya)) //dosyanın ismini nesne tabanlı programlama şeklinde değiştirecek
        {
            System.out.println("dosyanın adı değişti");//işlem başarılı olursa dosya adı değiştirildi yazıcak
        }
        else
        {
            System.out.println("dosyanın adı degistirilemedi"); //işlem başarısız olursa dosyanın adı degistirilemedi yazıcak
        }
            
          } catch (Exception e) {
        }
        }
            
         

            
       
        
          
             
      
        }

                 

        

                   
        

