package com.website.controller.member;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.website.service.member.MemberService;

@Controller  
@Scope("prototype")
@RequestMapping("/member")
public class MemberController {

	@Resource
	private MemberService memberService;
	
	
	@ResponseBody
	@RequestMapping("/getmemberinfo")
	public void getMemberInfo()
	{
		String id="1";
		String account=memberService.getMemberAccountById(id.trim());
		System.out.println(account);
	}
	
}
