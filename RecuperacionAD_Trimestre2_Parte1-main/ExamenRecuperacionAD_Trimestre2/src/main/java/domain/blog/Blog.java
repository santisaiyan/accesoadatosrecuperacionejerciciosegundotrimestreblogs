package domain.blog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
public class Blog {

    @Id
    @GeneratedValue
    private int id;
    private String titulo;
    private String contenido;
    private String url;
    private Date fecha;

    public Blog(String titulo, String contenido, String url, Date fecha) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.url = url;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String toString() {
        return "\nNombre de la página: "+titulo+
                "\nURL de la página: "+url +
                "\nContenido de la página: "+contenido+
                "\nFecha creación de la página: "+fecha+"\n";
    }
}

