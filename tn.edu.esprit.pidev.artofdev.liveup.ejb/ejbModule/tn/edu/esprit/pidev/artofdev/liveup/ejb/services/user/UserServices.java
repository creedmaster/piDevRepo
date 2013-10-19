package tn.edu.esprit.pidev.artofdev.liveup.ejb.services.user;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.edu.esprit.pidev.artofdev.liveup.ejb.persistences.User;

/**
 * Session Bean implementation class UserServices
 */
@Stateless
public class UserServices implements UserServicesRemote, UserServicesLocal {
	@PersistenceContext
	EntityManager entityManager;

    /**
     * Default constructor. 
     */
    public UserServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public User authentification(String login, String password) {
		User user =null;
		Query query=entityManager.createQuery("Select u from User u where u.login=:l and u.pwd=:p ");
		query.setParameter("l", login).setParameter("p", password);
		try{
			user=(User) query.getSingleResult();
		}catch(Exception e){
			user=null;
		}
		return user;
		
	}

	

}