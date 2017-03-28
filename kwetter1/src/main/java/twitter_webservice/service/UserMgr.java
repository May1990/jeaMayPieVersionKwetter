package twitter_webservice.service;

import twitter_webservice.doa.UserrDAO_impl;
import twitter_webservice.domain.Tweet;
import twitter_webservice.domain.Userr;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Anna-May on 09/03/2017.
 */
@Stateless
public class UserMgr {
    /*
    private List<Userr> users;

    public UserMgr() {
        this.users = new List<Userr> ();
    }

    public List<Userr> getUsers() {
        return users;
    }

    public void setUsers(List<Userr> users) {
        this.users = users;
    }

    public Userr registerUser(String email, String userName, String password){
        return null;
    }

    public boolean setRole(String role){
        return false;
    }*/

    //@Inject
    UserrDAO_impl userDao_impl;

    public List<Userr> getUsers(){
        return userDao_impl.findAll();
    }

    public List<Userr> getFollowers(String username){
        return userDao_impl.findFollowersByUserName(username);
    }

    public List<Userr> getFollowing(String username){
        return userDao_impl.findFollowingByUserName(username);
    }

    public Userr getUserByUserName(String userName){
        return userDao_impl.findByUserName(userName);
    }

    public void createUser(Userr user){
        userDao_impl.create(user);
    }
}
