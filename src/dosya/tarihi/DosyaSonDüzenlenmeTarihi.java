
package dosya.son.düzenlenme.tarihi;


import java.io.File;
import java.util.Date;



public class DosyaSonDüzenlenmeTarihi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File dosya=new File("C:\\Users\\tlgun\\Desktop\\oop\\deneme.exe");//belgenin konumu adı ve formatı girildi
        long son_düz;
        
        try {
            if (dosya.exists())            //varlığı sorgulandı
            {
                son_düz=dosya.lastModified();    //lastModified metotu ile tarih alındı
                Date tarih=new Date(son_düz);    //tarih nesnesini oluşturup içine atama yaptık
                
                System.out.println(" en son düzenlenme:"+tarih);
            }
            
            
        }
        catch (Exception e) {
        }
    }
    
}
