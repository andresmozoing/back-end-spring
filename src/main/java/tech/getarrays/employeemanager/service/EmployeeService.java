package tech.getarrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.employeemanager.exception.UserNotFoundException;
import tech.getarrays.employeemanager.model.Employee;
import tech.getarrays.employeemanager.repo.EmployeeRepo;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;

@Service //Agregamos esta etiqta
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    @Autowired //Se usa esta etiqueta para enlazar el Servicio con el repositorio
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee (Employee employee){
        employee.setCodigoEmpleado(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }


    public List<Employee> findAllEmployees ( ){
        return employeeRepo.findAll();
    }

    public Employee updateEmployee (Employee employee ){
        return employeeRepo.save(employee);
    }

    public void deleteEmployee (Employee employee){
        employeeRepo.delete(employee);
    }

    public void deleteEmployee (Long id){
        employeeRepo.deleteEmployeeById(id);
    }

    public Employee findEmployeeById(Long id){
        return employeeRepo.findEmployeeById(id).orElseThrow(()-> new UserNotFoundException("User by id "+ id + " no se encontro "));
    }  //Si no nos retorna un empleado le decimos que cree una exception con ese mensaje

}
