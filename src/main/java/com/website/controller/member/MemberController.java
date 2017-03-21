package com.website.controller.member;

import javax.annotation.Resource;

import org.apache.ibatis.type.JdbcType;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.website.entity.publics.SmsEntity;
import com.website.service.member.MemberService;
import com.website.service.publics.SmsService;

@Controller  
@Scope("prototype")
@RequestMapping("/member")
public class MemberController {

	@Resource
	private MemberService memberService;
	@Resource
	private SmsService smsService;
	
	
	@ResponseBody
	@RequestMapping("/getmemberinfo")
	public void getMemberInfo()
	{
		Long id=1L;
		String account=memberService.getMemberAccountById(id);
		System.out.println(account);
	}
	
	@ResponseBody
	@RequestMapping("/getsmsinfo")
	public String getSmsInfo(Long id)
	{		
		SmsEntity sms=smsService.getSmsById(id);
		String resultStr=JSONObject.toJSONString(sms);
		System.out.println(resultStr);
		return resultStr;
	}
	
	@ResponseBody
	@RequestMapping("/addsms")
	public void addSmsInfo()
	{		
		SmsEntity smsEntity=new SmsEntity();
		smsEntity.setContent("您的验证码为:888888,请保管好!");
		smsEntity.setContent("info");
		smsEntity.setMobile("18807605300");
		smsEntity.setStatus(1);
		smsEntity.setStatusNote("短信发送成功！");
		System.out.println(JdbcType.TIMESTAMP);
		smsService.insertSms(smsEntity);			
	}
	
}
