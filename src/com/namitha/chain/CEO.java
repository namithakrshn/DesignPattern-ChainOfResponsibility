package com.namitha.chain;

public class CEO extends Handler {

	@Override
	public void handleRequest(Request request) {
		System.out.println("CEO has approved your request for "+request.getRequestType().toString());
	}
	

}
