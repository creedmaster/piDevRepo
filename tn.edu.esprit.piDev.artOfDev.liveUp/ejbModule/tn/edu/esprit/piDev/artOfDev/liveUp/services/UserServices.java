package tn.edu.esprit.piDev.artOfDev.liveUp.services;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class UserServices
 */
@Stateless
public class UserServices implements UserServicesRemote, UserServicesLocal {
	private  int a  ;

    /**
     * Default constructor. 
     */
    public UserServices() {
        // TODO Auto-generated constructor stub
    }

}
