/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosya.boyutu.bulma;

import java.io.File;

/**
 *
 * @author tlgun
 */
public class DosyaBoyutuBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File dosya=new File("C:\\Users\\tlgun\\Desktop\\oop\\örnek.txt");
        double bytes = dosya.length();
	double kilobytes = (bytes / 1024);
	double megabytes = (kilobytes / 1024);
        
        System.out.printf("dosya boyutu byte:%.2f ",bytes);
        System.out.printf("\ndosya boyutu kb:%.2f ",kilobytes);
        System.out.printf("\ndosya boyutu mb:%.2f ",megabytes);
    }
    
}
