package chaurasiaaditya.Employee_Manager.service;

import chaurasiaaditya.Employee_Manager.domain.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
	Employee addEmployee(Employee employee);

	List<Employee> getAllEmployee();

	Employee updateEmployee(Employee employee);

	Optional<Employee> findById(long id);

	String deleteEmployee(long id);
}