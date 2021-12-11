package com.mycom.myapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycom.myapp.board.BoardService;
import com.mycom.myapp.board.BoardVO;

@Controller
@RequestMapping(value="/board")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String boardlist (Model model) {
		model.addAttribute("list", boardService.getBoardList());
		return "board/list";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addPost () {
		return "board/addpostform";
	}
	
	@RequestMapping(value = "/addok", method = RequestMethod.POST)
	public String addPostOK (BoardVO vo) {
		int i= boardService.insertBoard(vo);
		if(i==0)
			System.out.println("데이터 추가 실패 ");
		else
			System.out.println("데이터 추가 성공!!!");
		return "redirect:list";
	}
	
	@RequestMapping(value = "/editpost/{id}", method = RequestMethod.GET)
	public String editPost (@PathVariable("id") int id, Model model) {
		BoardVO boardVO = boardService.getBoard(id);
		model.addAttribute("boardVO", boardVO);
		return "board/editform";
	}
	
	@RequestMapping(value = "/editok", method = RequestMethod.POST)
	public String editPostOK (BoardVO vo) {
		int i= boardService.updateBoard(vo);
		if(i==0)
			System.out.println("데이터 수정 실패 ");
		else
			System.out.println("데이터 수정 성공!!!");
		return "redirect:list";
	}
	
	@RequestMapping(value = "/deleteok/{id}", method = RequestMethod.GET)
	public String deletePostOK (@PathVariable("id") int id) {
		int i= boardService.deleteBoard(id);
		if(i==0)
			System.out.println("데이터 삭제 실패 ");
		else
			System.out.println("데이터 삭제 성공!!!");
		return "redirect:../list";
	}
}
