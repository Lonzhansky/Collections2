package lesson30.dao;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lesson30.entity.Order;
import lesson30.util.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class OrderDAO {
    public void addOrder(Order order) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(order);
            transaction.commit();
        }
    }

    // Criteria API
//    public void addOrder(Order order) {
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Transaction transaction = session.beginTransaction();
//
//            // Створюємо об'єкт Criteria для створення запиту
//            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
//            CriteriaQuery<Order> criteriaQuery = criteriaBuilder.createQuery(Order.class);
//            Root<Order> root = criteriaQuery.from(Order.class);
//            criteriaQuery.select(root);
//
//            // Збереження об'єкта все одно здійснюється через session.save()
//            session.save(order);  // Для збереження ми використовуємо session.save(), а не Criteria
//
//            transaction.commit();
//        }
//    }

    public List<Order> getAllOrders() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Order> query = session.createQuery("from Order", Order.class);
            return query.list();
        }
    }

    public void deleteOrder(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Order order = session.get(Order.class, id);
            if (order != null) {
                session.delete(order);
            }
            transaction.commit();
        }
    }
}
