package com.qa.student.rest;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.qa.student.model.Movie;

public class MovieService {
    static Map<Integer,Movie> movieMap = new HashMap<Integer,Movie>();
    
    public void addMovie(String jsonString){
    	Gson gson = new Gson();
    	Movie mov = new Movie();
    	mov = gson.fromJson(jsonString, Movie.class);
    	movieMap.put(mov.getId(), mov);
    	System.out.println("Done");
    }
    
    public String getMovie(int id){
    	Gson gson = new Gson();
    	return gson.toJson(movieMap.get(id));
    }
    
    public String getMovies(){
    	Gson gson = new Gson();
    	return gson.toJson(movieMap);
    }
}
