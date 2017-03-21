package com.website.dao.member;

import java.util.List;

import com.website.entity.MemberEntity;


public interface MemberDao {

	public MemberEntity getMember(String studentID);

	public MemberEntity getStudentAndClass(String studentID);

	public List<MemberEntity> getMemberAll();

	public void insertStudent(MemberEntity entity);

	public void deleteStudent(MemberEntity entity);

	public void updateStudent(MemberEntity entity);
}
