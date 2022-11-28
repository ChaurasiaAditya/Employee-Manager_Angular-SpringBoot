/*
 * Author Name: Aditya Chaurasia
 * Date: 26-11-2022
 * Created With: IntelliJ IDEA Ultimate
 * Profile: github.com/ChaurasiaAditya
 * Website: ChaurasiaAditya.in
 */
package chaurasiaaditya.Employee_Manager.service;

import chaurasiaaditya.Employee_Manager.domain.Employee;
import chaurasiaaditya.Employee_Manager.exception.UserNotFoundException;
import chaurasiaaditya.Employee_Manager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private final EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		employee.setEmployeeCode(UUID.randomUUID().toString());
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee, long id) {
		Optional<Employee> optionalEmployee = this.employeeRepository.findById(id);
		if (optionalEmployee.isEmpty()) {
			return null;
		}
		Employee existingEmployee = optionalEmployee.get();
		if (employee.getName() != null) {
			existingEmployee.setName(employee.getName());
		}
		if (employee.getEmail() != null) {
			existingEmployee.setEmail(employee.getEmail());
		}
		if (employee.getJobTitle() != null) {
			existingEmployee.setJobTitle(employee.getJobTitle());
		}
		if (employee.getPhone() != null) {
			existingEmployee.setPhone(employee.getPhone());
		}
		if (employee.getImageUrl() != null) {
			existingEmployee.setImageUrl(employee.getImageUrl());
		}
		return employeeRepository.save(existingEmployee);
	}

	@Override
	public Optional<Employee> findById(long id) throws UserNotFoundException {
		return employeeRepository.findById(id);
	}

	@Override
	public String deleteEmployee(long id) {
		employeeRepository.deleteById(id);
		return "Employee Deleted Successful";
	}

	@Override
	public Employee getEmployeeByEmailAndEmployeePassword(String email, String password) {
		return this.employeeRepository.getEmployeeByEmailAndEmployeePassword(email,password);
	}
}
