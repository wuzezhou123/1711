package com.bw.service;

import java.util.List;

import com.bw.pojo.Movie;

public interface MovieService {

	List<Movie> query(Movie mv);

	boolean del(String ids);

}
