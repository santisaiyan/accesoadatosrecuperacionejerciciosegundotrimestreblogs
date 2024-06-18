import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        private static final EntityManagerFactory emf;

        static {
            emf = Persistence.createEntityManagerFactory("data.odb");
            EntityManager em = emf.createEntityManager();


            EntradaDAO dao = new EntradaDAO();


            Entrada entrada1 = new Entrada();
            Entrada entrada2 = new Entrada();
            Entrada entrada3 = new Entrada();
            Entrada entrada4 = new Entrada();
            Entrada entrada5 = new Entrada();


            dao.addEntrada(em, entrada1);
            dao.addEntrada(em, entrada2);
            dao.addEntrada(em, entrada3);
            dao.addEntrada(em, entrada4);
            dao.addEntrada(em, entrada5);

            em.close();
            emf.close();
        }
    }