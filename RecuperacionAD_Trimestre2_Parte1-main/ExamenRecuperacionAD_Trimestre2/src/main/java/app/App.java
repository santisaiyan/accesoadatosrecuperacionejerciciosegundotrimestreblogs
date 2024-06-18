package app;


import domain.blog.Blog;
import domain.blog.BlogDAO;
import domain.blog.DataBlog;

import java.util.Date;

public class App {
    public static void main(String[] args) {

        try{
            BlogDAO blogDAO = new BlogDAO();
            blogDAO.saveAll(DataBlog.blogs());
        }catch (Exception e){

        }
        System.out.println("Introduciendo nuevo Blog: \n");
        BlogDAO blogDAO = new BlogDAO();
        Blog blog = new Blog("Blog de Guille","Informatica","https://blogdeGuille.com",new Date(2005,3,9));
        blogDAO.insertarCliente(blog);

        System.out.println("Mostrando todos los Blogs: \n");
        blogDAO.showAll();

        System.out.println("Mostrando los tres ultimos Blogs Agregados:\n ");
        blogDAO.showLastThree();

    }
}