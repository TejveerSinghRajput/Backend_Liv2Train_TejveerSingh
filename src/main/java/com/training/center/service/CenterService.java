package com.training.center.service;

import java.util.List;

import com.training.center.entity.CenterInformation;

public interface CenterService {

	Object centerInsertData(CenterInformation centerInformation);

	List<CenterInformation> getAllCenter();

}
