package br.com.validador;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Map;



public class Handler implements RequestHandler<Map<String,String>,String> {

    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    @Override
    public String handleRequest(Map<String, String> event, Context context) {

        LambdaLogger logger = context.getLogger();
        logger.log("Exemplo de Lambda");
        logger.log("Event: " + gson.toJson(event));

        String url = System.getenv().get("url");
        logger.log(url);

        return "OK";
    }
}
