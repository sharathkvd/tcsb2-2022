package employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import employee.bean.EmpDetails;

@Repository
public interface MyLocalRepository extends JpaRepository<EmpDetails, Long> {

}
