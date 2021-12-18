package com.mycom.myapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycom.myapp.member.MemberService;
import com.mycom.myapp.member.MemberVO;

@Controller
@RequestMapping(value="/board")
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = "/list2", method = RequestMethod.GET)
	public String memberlist (Model model) {
		model.addAttribute("list", memberService.getMemberList());
		return "board/list2";
	}
	
	@RequestMapping(value = "/add2", method = RequestMethod.GET)
	public String addPost () {
		return "board/addpostform2";
	}
	
	@RequestMapping(value = "/addok2", method = RequestMethod.POST)
	public String addPostOK (MemberVO vo) {
		int i= memberService.insertMember(vo);
		if(i==0)
			System.out.println("팀원 추가 실패 ");
		else
			System.out.println("팀원 추가 성공");
		return "redirect:list2";
	}
	
	@RequestMapping(value = "/editpost2/{id}", method = RequestMethod.GET)
	public String editPost (@PathVariable("id") int id, Model model) {
		MemberVO memberVO = memberService.getMember(id);
		model.addAttribute("memberVO", memberVO);
		return "board/editform2";
	}
	
	@RequestMapping(value = "/editok2", method = RequestMethod.POST)
	public String editPostOK (MemberVO vo) {
		int i= memberService.updateMember(vo);
		if(i==0)
			System.out.println("팀원정보 수정실패");
		else
			System.out.println("팀원정보 수정성공");
		return "redirect:list2";
	}
	
	@RequestMapping(value = "/deleteok2/{id}", method = RequestMethod.GET)
	public String deletePostOK (@PathVariable("id") int id) {
		int i= memberService.deleteMember(id);
		if(i==0)
			System.out.println("팀원정보 삭제실패");
		else
			
			System.out.println("팀원정보 삭제성공");
		return "redirect:../list2";
	}
}
