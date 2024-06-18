import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
public class EntradaDAO {
    private static final EntityManagerFactory emf;

    static {
        emf = Persistence.createEntityManagerFactory("data.odb");
    }


    public void addEntrada(EntityManager em, Entrada entrada) {
        EntityManager entityManager = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(entrada);
        em.getTransaction().commit();
        em.close();
    }

    public List<Entrada> listEntradas() {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Entrada> query = em.createQuery("SELECT e FROM Entrada e",Entrada.class);
        ArrayList<Entrada> entradas = (ArrayList<Entrada>) query.getResultList();
        em.close();
        return entradas;
    }

    public List<Entrada> listultimastresEntradas() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT e FROM Entrada e ORDER BY e.fecha DESC");
        query.setMaxResults(3);
        List<Entrada> entradas = query.getResultList();
        em.close();
        return entradas;
    }
}

