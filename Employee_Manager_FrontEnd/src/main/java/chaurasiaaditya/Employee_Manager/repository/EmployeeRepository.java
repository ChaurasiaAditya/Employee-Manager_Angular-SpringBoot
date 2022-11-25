package chaurasiaaditya.Employee_Manager.repository;

import chaurasiaaditya.Employee_Manager.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

