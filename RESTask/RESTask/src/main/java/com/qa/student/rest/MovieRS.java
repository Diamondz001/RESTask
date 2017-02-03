
package com.qa.student.rest;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONObject;

import com.qa.student.model.Movie;

@Path("/json")
public class MovieRS {
    
	@Inject 
	MovieService movieService;
	
    @GET
    @Path("/getAll")
    @Produces({"application/json"})
    public String getAllMoviesJSON() {
    	return movieService.getMovies();
    }
    
    @GET
    @Path("/get")
    @Produces({"application/json"})
    public String getMovieJSON(int id) {
    	return movieService.getMovie(id);
    }
    
    @POST
    @Path("/post")
    @Consumes({"application/json"})
    @Produces({MediaType.TEXT_PLAIN})
    public String putMovieJSON(String jsonString){
    	movieService.addMovie(jsonString);
    	return "Movie inserted successfully";
    }
}
