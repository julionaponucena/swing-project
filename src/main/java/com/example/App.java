package com.example;
import com.example.states.ViemState;
import com.example.view.Viem;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import  com.example.Controller.ViemController;
/**
 * Hello world!
 *
 */
public class App 
{
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("context");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();
    public static void main( String[] args )
    {
        ViemState viemState = new ViemState();
        Viem viem = new Viem(viemState);
        ViemController viemController = new ViemController(viem,viemState);

    
        
        
    }
}
