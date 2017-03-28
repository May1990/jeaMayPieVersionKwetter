package twitter_webservice.service;

import twitter_webservice.doa.TweetDAO_impl;
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
public class TweetMgr {

    /*
    private List<Tweet> tweets;

    public TweetMgr() {
        this.tweets = new List<Tweet>();
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(List<Tweet> tweets) {
        this.tweets = tweets;
    }

    public boolean removeTweet(int id){
        return true;
    }

    public void findTweetsWithTrend(String trend){

    }

    public List<Tweet> findTweetsWithUser(Userr user){
        return null;
    }

    public List<Tweet> findTweetsWithSearchword(String user){
        return null;
    }*/

    /*nope
    public HashMap<Integer, Tweet> getTenMostRecentTweetsFollowers(){

    }

    public HashMap<Integer, Tweet> getTenMostRecentTweetsFollowing(){

    }
    */
    /*
    public List<Tweet> getTwentyRecentTweets(Userr user){
        return null;
    }

    public List<Tweet> getTaggedTweets(Userr user){
        return null;
    }

    public List<Tweet> getMostRecentTweets(){
        return null;
    }

    public List<Tweet> getMoreRecentTweets(){
        return null;
    }

    public void refreshTweets(){
        // tweets uit het database halen
    }*/

//    @Inject
    TweetDAO_impl tweetDao_impl;

    public List<Tweet> getTweets(){
        return tweetDao_impl.findAll();
    }

    public List<Tweet> getTweetsByUserName(String userName){
        return tweetDao_impl.findByUserName(userName);
    }
}
