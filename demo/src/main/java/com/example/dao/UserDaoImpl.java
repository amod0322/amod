package com.example.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory _sessionFactory;
	
	@Override
	public void save(User user){
		_sessionFactory.getCurrentSession().save(user);
	}
	
	public void delete(User user) {
	    _sessionFactory.getCurrentSession().delete(user);
	    return;
	  }

}
