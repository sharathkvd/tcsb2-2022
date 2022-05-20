package employee.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import employee.service.EmpService;
import employee.bean.EmpDetails;
import employee.repository.MyLocalRepository;

@Service
public class EmployeeServiceImp implements EmpService{
	@Autowired
	MyLocalRepository myLocalRepository;

	public EmpDetails addProduct(EmpDetails product) {

		EmpDetails addprodcut = myLocalRepository.save(product);

		return addprodcut;  // returning to controler
}

	@Override
	public EmpDetails addEmpDetails(EmpDetails employee) {
		// TODO Auto-generated method stub
		return null;
	}
}