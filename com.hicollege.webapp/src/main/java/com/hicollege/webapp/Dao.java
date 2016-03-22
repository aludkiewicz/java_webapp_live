package com.hicollege.webapp;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Component
@Repository
public class Dao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    @Transactional
    public void createAndSaveObject(Object user) {
        sessionFactory.getCurrentSession().save(user);
    }
    
    

}
