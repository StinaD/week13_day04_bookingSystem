package com.codeclan.week13.day04.bookingLab.bookingLab.repositories.courseRepository;

import com.codeclan.week13.day04.bookingLab.bookingLab.models.Course;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Course> getCoursesByCustomer(Long customer_id){
        List<Course> result = null;
        Session session = entityManager.unwrap(Session.class);
        Criteria cr = session.createCriteria(Course.class);
        cr.createAlias("bookings", "bookingAlias");
        cr.add(Restrictions.eq("bookingAlias.customer.id", customer_id));
        try {
            result = cr.list();
            }
        catch (HibernateException ex){
                ex.printStackTrace();
            }
        finally{
                session.close();
            }
        return result;
    }
}
