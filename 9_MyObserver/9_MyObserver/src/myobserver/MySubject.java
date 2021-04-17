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
public interface MySubject {

    void follow(Followers fl);

    void sendupdate();

    void unfollow(Followers fl);
    
}
