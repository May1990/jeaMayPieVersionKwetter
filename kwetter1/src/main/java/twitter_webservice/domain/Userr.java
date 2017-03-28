package twitter_webservice.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Anna-May on 09/03/2017.
 */

//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@NamedQueries({
        @NamedQuery(name = "User.all", query = "SELECT c FROM Userr c"),
        @NamedQuery(name = "User.userByName", query = "SELECT c FROM Userr c WHERE c.userName = :userName")
})
public class Userr implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String role;
    private String email;
    private String name;

    @Column(unique = true)
    private String userName;
    private String biografy;
    private String locationX;
    private String locationY;
    private String website;

    @ManyToMany
    private List<Userr> followers;
    @ManyToMany
    private List<Userr> following;

    @ManyToMany
    private List<Tweet> likedTweets;

    /*@OneToMany//(mappedBy = "id")
    private List<Tweet> ownTweets;*/

    public Userr() {
    }

    public Userr(String role, String email, String name, String userName, String biografy, String locationX, String locationY, String website, List<Userr> following, List<Userr> followers, List<Tweet> likedTweets) {
        this.role = role;
        this.email = email;
        this.name = name;
        this.userName = userName;
        this.biografy = biografy;
        this.locationX = locationX;
        this.locationY = locationY;
        this.website = website;
        this.following = following;
        this.followers = followers;
        this.likedTweets = likedTweets;
    }

    public Userr(String userName, List<Tweet> likedTweets) {
        this.userName = userName;
        this.likedTweets = likedTweets;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBiografy() {
        return biografy;
    }

    public void setBiografy(String biografy) {
        this.biografy = biografy;
    }

    public String getLocationX() {
        return locationX;
    }

    public void setLocationX(String locationX) {
        this.locationX = locationX;
    }

    public String getLocationY() {
        return locationY;
    }

    public void setLocationY(String locationY) {
        this.locationY = locationY;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public List<Userr> getFollowing() {
        return following;
    }

    public void setFollowing(List<Userr> following) {
        this.following = following;
    }

    public List<Userr> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Userr> followers) {
        this.followers = followers;
    }

    /*public List<Tweet> getOwnTweets() {
        return ownTweets;
    }
    
    public void setOwnTweets(List<Tweet> ownTweets) {
        this.ownTweets = ownTweets;
    }*/
    //*************************************************************************************************
    /*public Userr getFollower(String userName){
        return null;
    }

    public Userr getFollowedUser(String userName){
        return null;
    }*/

    /* nope
    public HashMap<Integer, Tweet> getTenMostRecentTweets(){
        int x;
        HashMap<Integer, Tweet> tempMap = new HashMap<Integer, Tweet>();

        // ophalen tweets uit database


        return this.ownTweets;
    }*/

    /*
    public List<Tweet> getMoreTweets(){

        // ophalen volgende 10 tweets uit het database

        return this.ownTweets;
    }

    public void addTweet(String content){
        // nieuwe tweet opbouwen

        // doorgeven aan het database

    }

    public boolean removeTweet(Tweet tweet){
        // tweet verwijderen uit het database


        // tweet verwijderen uit de lijst
        ownTweets.get(tweet.getId());
        return true;
    }*/
}
