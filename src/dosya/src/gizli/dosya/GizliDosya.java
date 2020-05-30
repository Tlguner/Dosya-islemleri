/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gizli.dosya;

import java.io.File;

/**
 *
 * @author tlgun
 */
public class GizliDosya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File dosya=new File("C:\\Users\\tlgun\\Desktop\\oop\\gizli.txt");  //dosya nesnesi oluşturuldu
        try {
            if (dosya.isHidden())            //dosyanın gizli olup olmadığı sorgulandı
            {
                System.out.println("dosyanız gizli:");   
            }
            else
            {
                System.out.println("dosyanız gizli değil");
            }
        } catch (Exception e) {
        }
    }
    
}
