package lesson30.dao;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lesson30.entity.Order;
import lesson30.util.HibernateUtil;

import org.hibernate.query.MutationQuery;

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

//    // HQL
//    public void addOrder(Order order) {
//        Transaction transaction = null;
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            // Транзакція стартує
//            transaction = session.beginTransaction();
//
//            // HQL-запит для вставки нового замовлення
//            String hql = "INSERT INTO Order (user, productName, quantity, price) " +
//                    "VALUES (:user, :productName, :quantity, :price)";
//
//            // Створення HQL-запиту
//            MutationQuery query = session.createMutationQuery(hql);
//
//            // Формування конкретних значень для певного іменованого параметра
//            query.setParameter("user", order.getUser());
//            query.setParameter("productName", order.getProductName());
//            query.setParameter("quantity", order.getQuantity());
//            query.setParameter("price", order.getPrice());
//
//            // Виконання HQL-запиту
//            query.executeUpdate();
//
//            // Транзакція виконується
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback(); // Якщо сталася помилка, відкатуємо транзакцію
//            }
//            e.printStackTrace();
//        }
//    }

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
