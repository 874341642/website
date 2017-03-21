package com.website.service.publics;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.website.dao.publics.SmsDao;
import com.website.entity.publics.SmsEntity;

@Service
@Scope
public class SmsService {
	@Resource
	private SmsDao smsDao;

	public SmsEntity getSmsById(Long id) {
		return (SmsEntity) smsDao.getById(id);
	}

	public void insertSms(SmsEntity smsEntity) {
		smsDao.insert(smsEntity);
	}
}
