package org.bu.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

@WebService(endpointInterface = "org.bu.ws.service.Jxs")
@Service
public class JxsImpl implements Jxs {

	@Override
	@WebMethod
	public String getJxs(String key, int age) {
		return "this is jxs world";
	}

	@Override
	public void getValue(String p) {
		System.out.println(p);
	}

}
