package Modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static synchronized void buildSessionFactory() {
         if (sessionFactory == null) {
             Configuration configuration = new Configuration();
             configuration.configure();
             configuration.setProperty("hibernate.current_session_context_class", "thread");
             StandardServiceRegistry serviceRegistry 
                     = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
             sessionFactory = configuration.buildSessionFactory(serviceRegistry);
         }
     }

     public static void openSessionAndBindToThread() {
         Session session = sessionFactory.openSession();
         ThreadLocalSessionContext.bind(session);
     }


     public static SessionFactory getSessionFactory() {
         if (sessionFactory==null)  {
             buildSessionFactory();
         }
         return sessionFactory;
     }

     public static void closeSessionAndUnbindFromThread() {
         Session session = ThreadLocalSessionContext.unbind(sessionFactory);
         if (session!=null) {
             session.close();
         }
     }

     public static void closeSessionFactory() {
         if ((sessionFactory!=null) && (sessionFactory.isClosed()==false)) {
             sessionFactory.close();
         }
     }
}
