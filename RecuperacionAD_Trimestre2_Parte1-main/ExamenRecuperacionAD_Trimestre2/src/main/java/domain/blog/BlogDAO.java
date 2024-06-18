package domain.blog;

import domain.ObjectDBUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class BlogDAO {
    public Blog insertarCliente(Blog blog){
        EntityManager em = ObjectDBUtil.getEntityManagerFactory().createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(blog);
            em.getTransaction().commit();

        }finally {
            em.close();
        }
        return blog;
    }
    public void saveAll(List<Blog> clientes){

        EntityManager em = ObjectDBUtil.getEntityManagerFactory().createEntityManager();
        try{
            em.getTransaction().begin();
            for(Blog c : clientes){
                em.persist(c);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    public void showAll(){

        List<Blog> todosBlogs = new ArrayList<>();

        EntityManager em = ObjectDBUtil.getEntityManagerFactory().createEntityManager();
        try{
            TypedQuery<Blog> query =em.createQuery("select c from Blog c", Blog.class);
            todosBlogs = query.getResultList();
            for (Blog blog : todosBlogs){
                System.out.println(blog);
            }
        }finally {
            em.close();
        }
    }
    public void showLastThree(){

        List<Blog> todosBlogs = new ArrayList<>();

        EntityManager em = ObjectDBUtil.getEntityManagerFactory().createEntityManager();
        try{
            TypedQuery<Blog> query =em.createQuery("select c from Blog c", Blog.class);
            todosBlogs = query.getResultList();
            System.out.println(todosBlogs.get(todosBlogs.size()-1).toString());
            System.out.println(todosBlogs.get(todosBlogs.size()-2).toString());
            System.out.println(todosBlogs.get(todosBlogs.size()-3).toString());
        }finally {
            em.close();
        }
    }
}
