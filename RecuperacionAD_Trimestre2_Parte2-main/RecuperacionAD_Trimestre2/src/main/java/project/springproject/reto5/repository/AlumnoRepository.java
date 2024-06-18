package project.springproject.reto5.repository;
import org.springframework.data.repository.query.Param;
import project.springproject.reto5.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

    //boolean existsById(@Param("id") String Id);
    //Alumno findById(@Param("id")String id);
    //boolean existsByCategoria(@Param("Categoria") String Categoria);
    //List<Alumno> findByCategoria(@Param("Categoria") String Categoria);
    //boolean existsByAutor(@Param("Autor") String Autor);
    //List<Alumno> findByAutor(@Param("Autor") String Autor);
}
