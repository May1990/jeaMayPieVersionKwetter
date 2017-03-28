package twitter_webservice.doa;

import twitter_webservice.domain.Tweet;
import twitter_webservice.domain.Userr;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;// ????
import java.util.List;

/**
 * Created by Anna-May on 09/03/2017.
 */
//@Stateless
public class TweetDAO_impl implements TweetDAO {
    @PersistenceContext
    EntityManager em;

    public void create(Tweet tweet) {
        em.persist(tweet);
    }

    public void edit(Tweet tweet) {
        em.merge(tweet);
    }

    public Tweet find(Long id) {
        return em.find(Tweet.class, id);
    }

    public List<Tweet> findAll() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Userr.class));
        return em.createQuery(cq).getResultList();
    }

    public List<Tweet> findByUserName(String userName) {
        List<Tweet> tweets;
        tweets = em.createNamedQuery("Tweet.tweetsByUser").setParameter("userName", userName).getResultList();
        return tweets;
    }

    public void removeTweet(Tweet tweet) {
        em.remove(em.merge(tweet));
    }
}
