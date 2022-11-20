package librarymanagement;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
// Main class
public class App {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Create Configuration
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(librarymanagementsystem.class);
 
        // Create Session Factory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
 
        // Initialize Session Object
        Session session = sessionFactory.openSession();
 
        librarymanagementsystem Li = new librarymanagementsystem();
 
        Li.setId(1);
        Li.setName("Huma");
       
 
        session.beginTransaction();
 
        // Here we have used
        // save() method of JPA
        session.save(Li);
 
        session.getTransaction().commit();
    }
}



