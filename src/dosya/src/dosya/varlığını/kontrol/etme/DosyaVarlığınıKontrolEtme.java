/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosya.varlığını.kontrol.etme;

import java.io.File;

/**
 *
 * @author tlgun
 */
public class DosyaVarlığınıKontrolEtme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File dosya=new File("C:\\Users\\tlgun\\Desktop\\oop\\örnek.txt"); //dosya nesnesi oluşturuldu
        boolean durum=dosya.exists();          //boolean ile dosya varlığı kontrol edildi
        try {
            
            if(durum)
        {
            System.out.println("böyle bir dosya var");
        }
        else   
        {
            System.out.println("böyle bir dosya yok");
        }
            
        } catch (Exception e) {
        }
        
    }
    
}
