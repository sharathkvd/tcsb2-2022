package ration.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ration.bean.Ration;

@Repository
public interface MyRepo extends JpaRepository<Ration,Long>{
	

}
