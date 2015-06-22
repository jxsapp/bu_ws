package org.bu.ws.service;

import javax.jws.WebService;

@WebService(endpointInterface = "org.bu.ws.service.Hey")
public class HeyImpl implements Hey {

	@Override
	public String getValue() {
		return "this is hello world";
	}

}
