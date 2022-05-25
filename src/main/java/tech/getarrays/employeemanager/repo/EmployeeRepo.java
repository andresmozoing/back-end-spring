package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    //Tenemos q decir q extiende al JPARepository, que objeto va a tener el repositorio(Employee) y
                                //de q tipo es la clave

    void  deleteEmployeeById(Long id); //Nombrandolo de esta forma, delete[NombreDeLaClase]By[Campo] Spring se da cuenta solo
                                        // q tiene q eliminarlo por id, con esto spring crea una query para eliminarlo con el parametro id
                                        // va acrear una query que haga delete en la tabla Employee

    Optional<Employee   > findEmployeeById(Long id); //Nombrandolo de esta forma, find[NombreDeLaClase]By[Campo] Spring se da cuenta solo y crea la query
    // Como no sabemos si la query nos retonrna un empleado o una exception le ponemos el Optional



}
