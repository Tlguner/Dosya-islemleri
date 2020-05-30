/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosya.kontrol.etme;

import java.io.File;
import java.io.IOException;


/**
 *
 * @author tlgun
 */
public class DosyaKontrolEtme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File dosya=new File("C:\\Users\\tlgun\\Desktop\\oop\\deneme.exe");     //kontrol edilcek belgenin yeri ve adı girildi
         try {
            if (dosya.isDirectory()) //belgenin klasör olup olmadığını kontrol et
            {
                
                System.out.println("belgeniz klasör");
            }
            else
            {
                System.out.println("belgeniz dosya");
            }
            
        } 
        catch (Exception e) {
        }
    }
    
}
