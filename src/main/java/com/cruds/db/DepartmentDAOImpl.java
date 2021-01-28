package com.cruds.db;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cruds.entity.Department;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO {

	@Autowired
	SessionFactory sessionfactory;
	
	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}
	
	public boolean Create(Department d) {
		
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		session.save(d);
		session.getTransaction().commit();
		session.close();
		
		return true;
	}

	public List<Department> getall() {
		
		
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		List<Department> dlist = (List<Department>) session.createQuery("from Department").list();
		session.getTransaction().commit();
		session.close();
		
		return dlist;
	}

	public boolean Delete(int deptid) {
		
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		Department d = (Department) session.load(Department.class,deptid);
		session.delete(d);
		session.getTransaction().commit();
		session.close();
		
		return true;
	}
	
	

}
