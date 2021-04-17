 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myobserver;

/**
 *
 * @author st
 */
public class MyObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Followers fol = new Followers("Ankita");
        InstaPage ip = new InstaPage();
        ip.follow(fol);
        
        Followers fo2 = new Followers("Rutvi");
        ip.follow(fo2);
        
        Followers fo3 = new Followers("Minu");
        ip.follow(fo3);
        
        ip.unfollow(fol);
        ip.sendupdate();
        
        
        
    }
    
}
