
package org.nav.solution.daoImpl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.nav.solution.dao.RegisterDao;
import org.nav.solution.model.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RegisterDaoImpl implements RegisterDao {
    @Autowired
    private SessionFactory sessionFactory;
    public void insert(Register register) {
        Session session=sessionFactory.openSession();
            session.save(register);
            session.beginTransaction().commit();
            session.close();
        }
    }

