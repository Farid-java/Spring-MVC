package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bean.RegisterBean;
import repo.Repository;

@Component
@Service
public class Service1 {
	
	@Autowired
	Repository repository ;
	
	@Transactional
	public void insert(RegisterBean user)
	{
		repository.insertBean(user);
	}

	public List<RegisterBean> fetchall(){
		
		List<RegisterBean> fetch = repository.fetchAll();
		
		return fetch;
	}
	
	@Transactional
	public int del(RegisterBean u)
	{
		repository.delet(u);
		return 1;
	}
	
	public RegisterBean serviceUpdate(int id) {
		
		RegisterBean repositoryUpdate = repository.repositoryUpdate(id);
		return  repositoryUpdate;
		
		
	}
}
