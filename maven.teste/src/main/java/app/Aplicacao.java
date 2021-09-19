package app;

import static spark.Spark.*;

import service.CarroService;

public class Aplicacao {
	
	private static CarroService carroService = new CarroService();
	
    public static void main(String[] args) {
        port(6789);

        post("/produto", (request, response) -> carroService.add(request, response));

        get("/produto/:id", (request, response) -> carroService.get(request, response));

        get("/produto/update/:id", (request, response) -> carroService.update(request, response));

        get("/produto/delete/:id", (request, response) -> carroService.remove(request, response));

        get("/produto", (request, response) -> carroService.getAll(request, response));
               
    }
}