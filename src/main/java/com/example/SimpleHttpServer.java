package com.example;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

/**
 * @author ashraf
 * 
 */
@SuppressWarnings("restriction")
public class SimpleHttpServer {

	private HttpServer httpServer;

	/**
	 * Instantiates a new simple http server.
	 *
	 * @param port the port
	 * @param context the context
	 * @param handler the handler
	 */
	public SimpleHttpServer() 
	{
//		//public SimpleHttpServer(int port, String context, HttpHandler handler) {
//		try {
//			//Create HttpServer which is listening on the given port 
//			httpServer = HttpServer.create(new InetSocketAddress(8090), 0);
//			//Create a new context for the given context and handler
//			
//			httpServer.createContext("/", new HttpRequestHandler());
//			//Create a default executor
//			httpServer.setExecutor(null);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	/**
//	 * Start.
//	 */
//	public void start() {
//		this.httpServer.start();
//	}
	}
	 public static void main(String[] args) throws Exception 
	    {
	        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
	        server.createContext("/",new HttpRequestHandler());
	        //server.createContext("/jenkins-handler", new MyHandler());
	        server.setExecutor(null); // creates a default executor
	        server.start();
	    }

}
