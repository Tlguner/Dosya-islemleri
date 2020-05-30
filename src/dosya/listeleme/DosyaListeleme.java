

package dosya.listeleme;

import java.io.File;

/**
 *
 * @author tlgun
 */
public class DosyaListeleme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File dosya =new File("C:\\Users\\tlgun\\Desktop\\oop");
        
        
        try 
        {
            String[] yol = dosya.list();
            System.out.println("dosyalar:");
            
            for (int i = 0; i < yol.length; i++) { 
                System.out.println(yol[i]); 
                
        } }
        catch (Exception e) 
        {
            
        }
        
    }
    
}
