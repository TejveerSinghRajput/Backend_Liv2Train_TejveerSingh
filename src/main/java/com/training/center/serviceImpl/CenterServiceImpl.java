package com.training.center.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.training.center.dao.CenterServiceDao;
import com.training.center.entity.CenterInformation;
import com.training.center.service.CenterService;

@Service
public class CenterServiceImpl implements CenterService {

	@Autowired
	private CenterServiceDao centerServiceDao;

	private static Logger log = LoggerFactory.getLogger(CenterServiceImpl.class);

	@Override
	public Object centerInsertData(CenterInformation centerInformation) {

		if (centerInformation.getCenterCode().length() < 12) {
			log.info("You have entered less than 12 digit center code.");
		} else if (centerInformation.getCenterCode().length() > 12) {
			log.info("You have entered greater than 12 digit center code");
		} else if (centerInformation.getContactPhone().length() < 12) {
			log.info("You have entered less than 12 digit ");
		} else if (centerInformation.getContactPhone().length() > 12) {
			log.info("You have entered greater than 12 digit center code");
		} else if (centerInformation.getCenterName().length() < 40) {
			log.info("You have entered more than 40 characters");
		} else
			centerServiceDao.save(centerInformation);
		return centerInformation;
	}

	@Override
	public List<CenterInformation> getAllCenter() {

		log.info("You are getAllCenter() method >>>>>>>>>>>>> ");
		return this.centerServiceDao.findAll();
	}

}
