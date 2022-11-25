/*
 * Author Name: Aditya Chaurasia
 * Date: 26-11-2022
 * Created With: IntelliJ IDEA Ultimate
 * Profile: github.com/ChaurasiaAditya
 * Website: ChaurasiaAditya.in
 */
package chaurasiaaditya.Employee_Manager.service;

import chaurasiaaditya.Employee_Manager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl {
	private final EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
}
