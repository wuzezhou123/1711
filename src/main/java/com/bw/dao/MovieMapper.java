package com.bw.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bw.pojo.Movie;

@Repository
public interface MovieMapper {

	List<Movie> query(Movie mv);

	int del(String ids);
	
}
