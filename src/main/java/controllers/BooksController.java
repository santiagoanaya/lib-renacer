package controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.transaction.TransactionalOps;

import db.RepositorioProyectos;
import model.Proyecto;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class BooksController implements WithGlobalEntityManager, TransactionalOps{
	

	public static ModelAndView show(Request req, Response res){
		return new ModelAndView(null, "stock/show.hbs");
	}

	public ModelAndView mostrar(Request req, Response res){
		Map<String, Proyecto> model = new HashMap<>();
		String id = req.params("id");
		
		Proyecto proyecto = RepositorioProyectos.instancia.buscar(Long.parseLong(id));
		model.put("proyecto", proyecto);
		return new ModelAndView(model, "stock/show.hbs");
	}


}
