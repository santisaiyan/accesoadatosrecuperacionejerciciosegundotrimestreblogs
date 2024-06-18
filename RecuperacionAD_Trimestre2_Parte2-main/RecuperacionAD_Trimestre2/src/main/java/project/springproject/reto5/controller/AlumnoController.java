package project.springproject.reto5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.springproject.reto5.model.Alumno;
import project.springproject.reto5.repository.AlumnoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/api/alumno")
public class AlumnoController {
    @Autowired
    AlumnoRepository alumnoRepository;

    @GetMapping("/all")
    public List<Alumno> list(){
        List<Alumno> alumnos = alumnoRepository.findAll();
        return alumnos;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Alumno> getById(@PathVariable Long id){
        ResponseEntity<Alumno> alumno;
        if (alumnoRepository.existsById(id)){
            Optional<Alumno> lib = alumnoRepository.findById(id);
            alumno = new ResponseEntity<>(lib.get(), HttpStatus.OK);
        }else alumno = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return alumno;
    }
    @GetMapping("/suspensos/{modulo}")
    public List<Alumno> getSuspensosByModulo(@PathVariable String modulo){
        List<Alumno> suspensos = new ArrayList<>();
        List<Alumno> alumnos = alumnoRepository.findAll();
        if (Objects.equals(modulo, "ad")){
            for(Alumno alumno : alumnos){
                if (alumno.getAd()<5.0){
                    suspensos.add(alumno);
                }
            }
        }else if (Objects.equals(modulo, "di")){
            for (Alumno alumno: alumnos){
                if (alumno.getDi()<5.0){
                    suspensos.add(alumno);
                }
            }
        }

        return suspensos;
    }

}
