package com.website.service.member;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.website.dao.member.MemberDao;
import com.website.entity.MemberEntity;

@Service
public class MemberService {

	@Resource
	private MemberDao memberMapper;

	public String getMemberAccountById(String id) {
		MemberEntity entity = memberMapper.getMember(id);
		System.out.println("member：" + JSONObject.toJSON(entity));
		List<MemberEntity> list = memberMapper.getMemberAll();		
		System.out.println("members：" +JSONObject.toJSON(list));
		entity = memberMapper.getMember(id);
		return entity.getAccount();
	}
}
