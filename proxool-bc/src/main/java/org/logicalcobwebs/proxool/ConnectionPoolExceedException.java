package org.logicalcobwebs.proxool;

public class ConnectionPoolExceedException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2317851459631366447L;

	public ConnectionPoolExceedException(String msg){
		super(msg);
	}
	
	public ConnectionPoolExceedException(String msg, Throwable ex){
		super(msg,ex);
	}
}
