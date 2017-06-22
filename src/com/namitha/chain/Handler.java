package com.namitha.chain;

public abstract class Handler {
	protected Handler Successor;

	public Handler getSuccessor() {
		return Successor;
	}

	public void setSuccessor(Handler successor) {
		Successor = successor;
	}
	
	public abstract void handleRequest(Request request);
	
}
