package controllers;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class ContactController {

	
	public static ModelAndView show(Request req, Response res){
		return new ModelAndView(null, "contacto/contact.hbs");
	}

	
}
