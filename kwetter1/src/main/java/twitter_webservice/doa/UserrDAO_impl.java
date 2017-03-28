package twitter_webservice.doa;

import twitter_webservice.domain.Userr;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * Created by Anna-May on 09/03/2017.
 */
//@Stateless
public class UserrDAO_impl implements UsserDAO {

    @PersistenceContext
    EntityManager em;

    public void create(Userr user) {
        em.persist(user);
    }

    public void edit(Userr user) {
        em.merge(user);
    }

    public List<Userr> findAll() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Userr.class));
        return em.createQuery(cq).getResultList();
    }

    public Userr findByUserName(String userName) {
        return null;
    }

    public void remove(Userr user) {

    }

    public List<Userr> findFollowersByUserName(String userName) {
        return null;
    }

    public List<Userr> findFollowingByUserName(String userName) {
        return null;
    }
}
