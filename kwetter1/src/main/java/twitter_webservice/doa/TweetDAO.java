package twitter_webservice.doa;


import twitter_webservice.domain.Tweet;

import java.util.List;

/**
 * Created by Anna-May on 09/03/2017.
 */
public interface TweetDAO {
    void create(Tweet tweet);
    void edit(Tweet tweet);
    Tweet find(Long id);
    List<Tweet> findAll();
    List<Tweet> findByUserName(String username);
    void removeTweet(Tweet tweet);

}
