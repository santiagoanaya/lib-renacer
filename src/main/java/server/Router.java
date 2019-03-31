package server;

import controllers.HomeController;
import controllers.ContactController;
import controllers.BooksController;
import spark.Spark;
import spark.template.handlebars.HandlebarsTemplateEngine;
import spark.utils.BooleanHelper;
import spark.utils.HandlebarsTemplateEngineBuilder;

public class Router {

	public static void configure() {
		HandlebarsTemplateEngine engine = HandlebarsTemplateEngineBuilder
				.create()
				.withDefaultHelpers()
				.withHelper("isTrue", BooleanHelper.isTrue)
				.build();
		
		Spark.staticFiles.location("/public");
		
		BooksController booksController = new BooksController();
		
		Spark.get("/", HomeController::home, engine);
		Spark.get("/contacto", ContactController::show, engine);
		Spark.post("/books", BooksController::show, engine);
	}

}