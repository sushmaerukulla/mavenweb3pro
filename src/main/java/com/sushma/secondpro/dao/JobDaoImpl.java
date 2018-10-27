package com.sushma.secondpro.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sushma.secondpro.model.Job;
@Component
@Repository
@Transactional
public class JobDaoImpl implements JobDao{
@Autowired
SessionFactory sessionfactory;
	public JobDaoImpl(SessionFactory sessionfactory)
	{
		this.sessionfactory=sessionfactory;
	}
	public boolean save_job(Job job) {
		sessionfactory.getCurrentSession().save(job);
		return true;
	}

}
