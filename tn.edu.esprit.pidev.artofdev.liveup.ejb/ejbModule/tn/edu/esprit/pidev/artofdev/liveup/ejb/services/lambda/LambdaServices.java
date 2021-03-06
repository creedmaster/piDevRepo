package tn.edu.esprit.pidev.artofdev.liveup.ejb.services.lambda;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import tn.edu.esprit.pidev.artofdev.liveup.ejb.persistences.Lambda;
import tn.edu.esprit.pidev.artofdev.liveup.ejb.persistences.Player;

/**
 * Session Bean implementation class LambdaServices
 */
@Stateless
public class LambdaServices implements LambdaServicesRemote, LambdaServicesLocal {

    /**
     * Default constructor. 
     */
	EntityManager entityManager ;
	
    public LambdaServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void createLambda(Lambda lambda) {
		entityManager.persist(lambda);
		
	}

	@Override
	public void updateLambda(Lambda lambda) {
		entityManager.merge(lambda);
		
	}

	@Override
	public void deleteLambda(Lambda lambda) {
		entityManager.remove(entityManager.merge(lambda));
		
	}

	@Override
	public Lambda findLambdaById(int idLambda) {
	    Lambda lambda =entityManager.find(Lambda.class, idLambda);
		return lambda;
	}

	@Override
	public List<Lambda> findAllLambda() {
		Query query=entityManager.createQuery("select l from Lambda l");
		return query.getResultList();
	}

}
