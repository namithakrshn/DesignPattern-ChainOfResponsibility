package com.namitha.chain;

public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		Director director = new Director();
		VP vp = new VP();
		CEO ceo = new CEO();
		
		director.setSuccessor(vp);
		vp.setSuccessor(ceo);
		
		Request request=new Request();
		request.setRequestType(RequestType.COMPUTER);
		request.setAmount(200);
		director.handleRequest(request);
		
		Request request2=new Request();
		request2.setRequestType(RequestType.TRAVEL);
		request2.setAmount(200);
		director.handleRequest(request2);
		
		Request request3=new Request();
		request3.setRequestType(RequestType.TRAVEL);
		request3.setAmount(700);
		director.handleRequest(request3);
		
		Request request4=new Request();
		request4.setRequestType(RequestType.QUIT);
		request4.setAmount(200);
		director.handleRequest(request4);
		
		

	}

}
