package repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;


import model.RegisteredBean;


 @Repository
public class Repo {

	 //for getting session of hibernate
	public Session getSession()
	{
		org.hibernate.cfg.Configuration cfg=new org.hibernate.cfg.Configuration().configure().addAnnotatedClass(RegisteredBean.class);
		SessionFactory buildSessionFactory = cfg.buildSessionFactory();
		Session openSession = buildSessionFactory.openSession();
		return openSession;
	}
	
	// for insert object into database
	
	public int insert(RegisteredBean bean)
	{
		int i=0;
		Session session = this.getSession();
		Serializable save = session.save( bean);
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		session.close();
		return (Integer) save;
	}
	
	// for fetch all data from database
	// here RegisteredBean is Bean class name.
	public List<RegisteredBean> fetchAll()
	{
		Session session = this.getSession();
		Query createQuery = session.createQuery("from RegisteredBean");
		List<RegisteredBean> list = createQuery.list();
		 
		return list;
	}
	 //here we use "" below because we need to set in the form of String but id is in int form.
	// transaction should be kept above executeUpdate() method.
	public int delete(int id)
	{
		Session session = this.getSession();
		Query createQuery = session.createQuery("delete from RegisteredBean s where s.id=:i");
		createQuery.setString("i", id+"");	
		Transaction transaction = session.beginTransaction();
		int executeUpdate = createQuery.executeUpdate();
	
		transaction.commit();
		session.close();	
		return executeUpdate;
		
	}
	
	
	  public void update(RegisteredBean  bean) { 
		  
		  Session session = this.getSession();
		  Transaction transaction = session.beginTransaction();
	     session.saveOrUpdate(bean);
	     transaction.commit();
			session.close();	
	  
	  }
	 
}

