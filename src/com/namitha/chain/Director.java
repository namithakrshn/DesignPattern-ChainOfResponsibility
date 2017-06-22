package com.namitha.chain;

public class Director extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getRequestType() == RequestType.COMPUTER){
			System.out.println("Director has approved your request for a new computer");
		}else{
			Successor.handleRequest(request);
		}
	}

	
}
