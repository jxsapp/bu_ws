package org.bu.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface Jxs {
	@WebMethod(action = "getJxs")
	public String getJxs(@WebParam(name = "key") String key, @WebParam(name = "age") int age);

	@WebMethod(action = "getValue")
	public void getValue(@WebParam(name = "p") String p);
}
