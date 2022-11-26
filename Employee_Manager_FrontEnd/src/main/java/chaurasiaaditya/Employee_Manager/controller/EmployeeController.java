/*
 * Author Name: Aditya Chaurasia
 * Date: 26-11-2022
 * Created With: IntelliJ IDEA Ultimate
 * Profile: github.com/ChaurasiaAditya
 * Website: ChaurasiaAditya.in
 */
package chaurasiaaditya.Employee_Manager.controller;

import chaurasiaaditya.Employee_Manager.domain.Employee;
import chaurasiaaditya.Employee_Manager.exception.UserNotFoundException;
import chaurasiaaditya.Employee_Manager.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {
	private final EmployeeServiceImpl employeeService;

	@Autowired
	public EmployeeController(EmployeeServiceImpl employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping("all")
	public ResponseEntity<?> getAllEmployee() {
		return ResponseEntity.ok(employeeService.getAllEmployee());
	}

	@GetMapping("find/{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable long id) {
		try {
			return ResponseEntity.ok(employeeService.findById(id));
		} catch (UserNotFoundException exception) {
			throw new RuntimeException(exception);
		}
	}

	@PostMapping("add")
	public ResponseEntity<?> addEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<>(employeeService.addEmployee(employee), HttpStatus.CREATED);
	}

	@DeleteMapping("delete/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable long id) {
		return ResponseEntity.ok(employeeService.deleteEmployee(id));
	}
}
