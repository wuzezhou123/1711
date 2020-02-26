package com.bw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.pojo.Movie;
import com.bw.service.MovieService;
import com.bw.vo.MovieVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class MovieController {
	@Autowired
	private MovieService movieService;
	@RequestMapping("list.do")
	public String list(Model model,MovieVO mv) {
		if(mv.getPageNum()==null) {
			mv.setPageNum(1);
		}
		System.out.println(mv.getOrderName()+mv.getOrderMethod());
		PageHelper.startPage(mv.getPageNum(), 3);
		List<Movie> movies=movieService.query(mv);
		PageInfo<Movie> page=new PageInfo<>(movies);
		model.addAttribute("list",movies);
		model.addAttribute("page",page);
		model.addAttribute("vo",mv);
		return "list";
	}
	@ResponseBody
	@RequestMapping("del.do")
	public Object del(String ids) {
		boolean b=false;
		b=movieService.del(ids);
		return  b;
	}
}
