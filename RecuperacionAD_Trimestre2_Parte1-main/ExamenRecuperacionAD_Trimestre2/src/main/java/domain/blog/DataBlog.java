package domain.blog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataBlog {
    public static List<Blog> blogs(){
        List<Blog> listaClientes = new ArrayList<>();
        listaClientes.add(new Blog("Blog de Antonio","Carpinteria","https://blogdeAntonio.com",new Date(2008,9,9)));
        listaClientes.add(new Blog("Blog de Alberto","Cocina","https://blogdeAlberto.com",new Date(2023,12,31)));
        listaClientes.add(new Blog("Blog de Santiago","Porteros","https://blogdeSantiago.com",new Date(2015,10,9)));
        listaClientes.add(new Blog("Blog de Maria","Moda","https://blogdeMaria.com",new Date(2009,6,11)));
        listaClientes.add(new Blog("Blog de Francisco","Cocteles","https://blogdeFrancisco.com",new Date(2004,4,4)));

        return listaClientes;
    }
}
