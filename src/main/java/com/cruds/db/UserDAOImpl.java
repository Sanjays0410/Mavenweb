package com.cruds.db;

import java.io.Serializable;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cruds.entity.User;

@Repository
public class UserDAOImpl implements UserDAO{

	SessionFactory sessionfactory;
	
	
	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}


	public boolean check(String username,String password) {
		
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		
		//String hql="from Department d where d.deptid=:dept";
		
		// String sql = "from User u where u.username=:username and u.password=:password";
		 
		 User u = (User) session.createQuery("FROM User U WHERE U.username = :username").setParameter("username", username)
	                .uniqueResult();
		 
	//	 User u=(User) session.createQuery(sql).uniqueResult();
		//Query query=session.createQuery(sql);
		//query.setParameter("username",username);
		//query.setParameter("password",password);
		session.getTransaction().commit();
		session.close();
		
		  if (u != null && u.getPassword().equals(password)) {
              return true;
          }
		  else
		  {
			  return false;
		  }
		
		
		
		
	}

}
