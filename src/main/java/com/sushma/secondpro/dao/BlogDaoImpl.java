package com.sushma.secondpro.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sushma.secondpro.model.Blog;

@Repository
@Component
@Transactional
public class BlogDaoImpl implements BlogDao{
	@Autowired
	SessionFactory sessionfactory;
	public BlogDaoImpl(SessionFactory sessionfactory)
	{
		this.sessionfactory=sessionfactory;
	}
public boolean save_blog(Blog blog)
{
	sessionfactory.getCurrentSession().save(blog);
	return true;

}
@Override
public List getAllBlog() {
	Session session=sessionfactory.openSession();
	Query query= session.createQuery("from Blog");
	query.list();
	List blogList=query.list();
	session.close();
	return blogList;
}
}
