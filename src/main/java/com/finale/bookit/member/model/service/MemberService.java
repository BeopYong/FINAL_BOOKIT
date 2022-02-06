package com.finale.bookit.member.model.service;

import java.util.HashMap;
import java.util.Map;

import com.finale.bookit.member.model.vo.Address;
import com.finale.bookit.member.model.vo.Member;

public interface MemberService {

	int insertMember(Member member);

	int insertMember(Member member, Address address);

	Member selectOneMember(String id);

	int insertAddress(Address address);

	int memberUpdate(Map<String, Object> param);

	int selectOneMemberCount(String id);

	int selectOneMemberNicknameCount(String nickname);

	String getAccessToken(String code);

	Member getUserInfo(String access_Token);

}
