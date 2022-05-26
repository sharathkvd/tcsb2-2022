package ration.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ration.bean.Ration;
import ration.repo.MyRepo;
import ration.service.RationService;

@Service
public class MyRationService implements RationService{
	@Autowired
	MyRepo myrepo;
	@Override
	public Ration createRation(Ration ration) {
		
		
		Ration rat=myrepo.save(ration);
		return rat;
	}

}
