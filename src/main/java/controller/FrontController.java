package controller;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.sun.media.sound.SF2GlobalRegion;

import model.RegisteredBean;

@Configuration
@ComponentScan({ "controller", "repository", "service" })
public class FrontController {

	/*
	 * DriverManagerDataSource ds;
	 * 
	 * Properties properties; LocalSessionFactoryBean lsfb;
	 * 
	 * SessionFactory factoryBean;
	 */

	@Bean
	public InternalResourceViewResolver view() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/jsp/");
		vr.setSuffix(".jsp");

		return vr;

	}

	/*
	 * public SessionFactory sf() { SessionFactory factoryBean = (SessionFactory)
	 * new LocalSessionFactoryBean(); return factoryBean; }
	 * 
	 * 
	 * @Bean public HibernateTransactionManager tx() { HibernateTransactionManager
	 * transactionManager=new HibernateTransactionManager();
	 * transactionManager.setSessionFactory(factoryBean); return transactionManager;
	 * }
	 * 
	 * @Bean public DriverManagerDataSource dmd() { DriverManagerDataSource ds=new
	 * DriverManagerDataSource(); ds.setDriverClassName("com.mysql.jdbc.Driver");
	 * ds.setUrl(
	 * "jdbc:mysql://localhost:3306/SpringMVC?createDatabaseIfNotExist=true");
	 * ds.setUsername("root"); ds.setPassword("root"); return ds; }
	 * 
	 * @Bean public LocalSessionFactoryBean lsfb() { lsfb=new
	 * LocalSessionFactoryBean(); lsfb.setDataSource(ds);
	 * //lsfb.setAnnotatedClasses(RegisteredBean.class);
	 * lsfb.setHibernateProperties(properties);
	 * 
	 * return lsfb; }
	 * 
	 * 
	 * public Properties prop() { properties=new Properties();
	 * properties.setProperty("hibernate.dialect",""+org.hibernate.dialect.
	 * MySQL57Dialect); properties.setProperty("hibernate.show_sql", "true");
	 * properties.setProperty("hibernate.hbm2ddl.auto", "true"); properties.se
	 * return properties; }
	 * 
	 * @Bean public HibernateTemplate ht() { HibernateTemplate ht=new
	 * HibernateTemplate(); ht.setSessionFactory(factoryBean); return ht; }
	 */

}
