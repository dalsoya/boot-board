package kr.co.songjava.configuration.exception;

import kr.co.songjava.configuration.http.BaseResponseCode;

public class AbstractBaseException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8457263559425202034L;
	
	protected BaseResponseCode responseCode;
	protected Object[] args;
	
	public AbstractBaseException() {
	}
	
	public AbstractBaseException(BaseResponseCode responseCode) {
		this.responseCode = responseCode;
	}
	
	public BaseResponseCode getResponseCode() {
		return responseCode;
	}
	
	public Object[] getArgs() {
		return args;
	}

}
