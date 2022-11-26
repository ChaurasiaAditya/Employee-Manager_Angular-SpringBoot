package chaurasiaaditya.Employee_Manager.service;

import chaurasiaaditya.Employee_Manager.domain.Employee;
import chaurasiaaditya.Employee_Manager.exception.UserNotFoundException;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
	Employee addEmployee(Employee employee);

	List<Employee> getAllEmployee();

	Employee updateEmployee(Employee employee, long id);

	Optional<Employee> findById(long id) throws UserNotFoundException;

	String deleteEmployee(long id);
}