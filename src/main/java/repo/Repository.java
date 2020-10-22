package repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import bean.RegisterBean;

@org.springframework.stereotype.Repository
@Component
public class Repository {

	 private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	public void insertBean(RegisterBean user)
	{
		 hibernateTemplate.saveOrUpdate(user);
	}
	
	public List<RegisterBean> fetchAll()
	{
		List<RegisterBean> loadAll = hibernateTemplate.loadAll(RegisterBean.class);
		return loadAll;
	}
	
	public int delet(RegisterBean b)
	{
		hibernateTemplate.delete(b);
		
		return 1;
	}
	
	public RegisterBean repositoryUpdate(int id)
	{
		RegisterBean registerBean = hibernateTemplate.get(RegisterBean.class, id);
		return registerBean;
	}
	

}
