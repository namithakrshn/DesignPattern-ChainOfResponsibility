package com.namitha.chain;

public class VP extends Handler{

	@Override
	public void handleRequest(Request request) {
		if ( request.getAmount() < 500){
			System.out.println("VP has approved your requets for "+request.getRequestType().toString());
		}else{
			Successor.handleRequest(request);
		}
		
	}

}
