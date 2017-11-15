/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blogapp;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author karlmorris
 */
public class SavableProxy implements Savable, Observer {

    
    @Override
    public void save(int userId, String post) {
        Savable savePost;
        
        if (Util.isConnectedToInternet())
            savePost = new InternetSave();
        else {
            savePost = new FilesystemSave();
            Util.toSync = true;
        }
        
        savePost.save(userId, post);
        
    }

    @Override
    public void update(Observable o, Object arg) {
        if (Util.toSync) {
            // Get data from hard drive
            new InternetSave().save(0, "Information retrieved from Hard Drive");
            Util.toSync = false;
        }
    }
    
}
