package jp.urgm.demo.wildfly;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingAPI {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Greeting sayHello() {
		return new Greeting("Hello, world!");
	}

	public static final class Greeting {

		private final String message;

		public Greeting(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}
	}
}
