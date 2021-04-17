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
class Followers implements IObservers {

    String Name;
    public Followers(String Name) {
    
        this.Name = Name;
    }
    
    
         
    @Override
    public void update()
    {
        System.out.println(Name +" My New post Check Now...");
    }
}
