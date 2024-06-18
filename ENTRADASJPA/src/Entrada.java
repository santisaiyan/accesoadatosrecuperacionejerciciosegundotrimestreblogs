import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Entrada implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String titulo;
    private String contenido;
    private String url;
    private Date fecha;
}