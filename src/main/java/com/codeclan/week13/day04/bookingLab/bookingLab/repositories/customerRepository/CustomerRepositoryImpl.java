package com.codeclan.week13.day04.bookingLab.bookingLab.repositories.customerRepository;

import com.codeclan.week13.day04.bookingLab.bookingLab.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CustomerRepositoryImpl {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> getCustomersByCourse(Long courseId) {

        List<Customer> result = null;

        Session session = entityManager.unwrap(Session.class);
        Criteria cr = session.createCriteria(Customer.class);
        cr.createAlias("bookings", "bookingsAlias");
        cr.add(Restrictions.eq("bookingsAlias.course.id", courseId));
        try {
            result = cr.list();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            session.close();
        }

        return result;
    }

    @Transactional
    public List<Customer> getCustomersByTownByCourse(String town, Long courseId){

        List<Customer> result = null;

        Session session = entityManager.unwrap(Session.class);
        Criteria cr = session.createCriteria(Customer.class);
        cr.createAlias("bookings", "bookingsAlias");
        cr.add(Restrictions.eq("bookingsAlias.course.id", courseId));
        cr.add(Restrictions.eq("town", town));

        try {
            result = cr.list();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            session.close();
        }

        return result;
    }


    @Transactional
    public List<Customer> getCustomersByTownByCourseByAge(String town, Long courseId, int age){

        List<Customer> result = null;

        Session session = entityManager.unwrap(Session.class);
        Criteria cr = session.createCriteria(Customer.class);
        cr.createAlias("bookings", "bookingsAlias");
        cr.add(Restrictions.eq("bookingsAlias.course.id", courseId));
        cr.add(Restrictions.eq("town", town));
        cr.add(Restrictions.gt("age", age));

        try {
            result = cr.list();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            session.close();
        }

        return result;
    }
}
