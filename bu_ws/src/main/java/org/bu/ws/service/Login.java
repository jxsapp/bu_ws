package org.bu.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class Login {
	@WebMethod(action = "checkUser")
	public String checkUser(@WebParam(name = "username") String username, @WebParam(name = "pwd") String pwd) {
		return "this. is login";
	}

	@WebMethod(action = "getUserName")
	public String getUserName(@WebParam(name = "id") String id) {
		return "user name is Hello";
	}
}
