package me.gacl.dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import me.gacl.dao.UserDaoI;
import me.gacl.model.User;
/*
 * 这里使用@Repository("userDao")注解完成dao注入， 使用@Autowired注解将sessionFactory注入到UserDaoImpl中。
 */
@Repository("userDao")
public class UserDaoImpl implements UserDaoI {
    
    /**
     * 使用@Autowired注解将sessionFactory注入到UserDaoImpl中
     */
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public Serializable save(User user) {
        return sessionFactory.getCurrentSession().save(user);
    }
}