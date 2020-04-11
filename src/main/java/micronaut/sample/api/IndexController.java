package micronaut.sample.api;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/user")
public class IndexController {

	@Get("/")
	public HttpStatus index() {
		return HttpStatus.OK;
	}

	@Get("/getUser")
	public User getUser() {
		return new User(101L, "firstName", "lastName");
	}
}