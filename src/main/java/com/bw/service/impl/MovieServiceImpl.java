package com.bw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.dao.MovieMapper;
import com.bw.pojo.Movie;
import com.bw.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService{
	@Autowired
	private MovieMapper movieMapper;

	@Override
	public List<Movie> query(Movie mv) {
		// TODO Auto-generated method stub
		return movieMapper.query(mv);
	}

	@Override
	public boolean del(String ids) {
		// TODO Auto-generated method stub
		int i=movieMapper.del(ids);
		return i>0;
	}
}
