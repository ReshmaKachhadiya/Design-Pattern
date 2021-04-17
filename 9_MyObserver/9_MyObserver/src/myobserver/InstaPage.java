/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myobserver;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author st
 */
public class InstaPage implements MySubject {
    List<Followers> follow = new ArrayList<>();
    @Override
    public void follow(Followers fl)
    {
        follow.add(fl);
    }
    
    @Override
    public void unfollow(Followers fl)
    {
        follow.remove(fl);
    }
    
    @Override
    public void sendupdate()
    {
        for(Followers fl : follow )
        {
            fl.update();
        }
    }
    
}
