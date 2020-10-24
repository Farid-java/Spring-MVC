package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.RegisteredBean;
import repository.Repo;

@Service
public class ServiceClass {

	@Autowired
	Repo repo;
	
	public int insert(RegisteredBean bean) {
		int insert = repo.insert(bean);
		return insert;
	}
	
	public List<RegisteredBean> fetchall()
	{
		List<RegisteredBean> fetchAll = repo.fetchAll();
		
		return fetchAll;
	}
	
	public int delte(int id)
	{
		int delete = repo.delete(id);
		return delete;
	}
	
	public void update(RegisteredBean bean)
	{
		  repo.update(bean);
	}
}
