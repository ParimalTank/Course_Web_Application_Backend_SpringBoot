package in.codersage.eLearning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.codersage.eLearning.entity.Course;
import in.codersage.eLearning.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	

}
