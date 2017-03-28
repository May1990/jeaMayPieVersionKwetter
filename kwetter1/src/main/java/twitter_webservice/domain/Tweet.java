package twitter_webservice.domain;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;
import java.util.Date;
import java.util.List;

/**
 * Created by Anna-May on 09/03/2017.
 */
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@NamedQueries({
        @NamedQuery(name = "Tweet.all", query = "SELECT c FROM Tweet c"),
        @NamedQuery(name = "Tweet.tweetsByUser", query = "SELECT c FROM Tweet c WHERE c.userName = :userName")
})
public class Tweet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date date;
    private String content;
    private String userName;
    //@ElementCollection
    //@CollectionTable(name ="likes")

    @ManyToMany(mappedBy = "likedTweets")
    private List<Userr> likes;

    public Tweet() {

    }

    public Tweet(Date date, String content, String userName, List<Userr> likes) {
        this.date = date;
        this.content = content;
        this.userName = userName;
        this.likes = likes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public List<Userr> getLikes() {
        return likes;
    }

    public void setLikes(List<Userr> likes) {
        this.likes = likes;
    }

    //**********************************************************************************************************
    /*public boolean addLike(Userr user){
        if(user instanceof Userr && !likes.contains(user)){
            // ook database he :P
            likes.add(user);
            return true;
        }else{
            return false;
        }
    }

    public boolean removeLike(Userr user){
        if(user instanceof Userr && likes.contains(user)){
            //verwijderen met id, referencie niet het zelfde
            likes.remove(user);
            return true;
        }else{
            return false;
        }
    }*/
}
