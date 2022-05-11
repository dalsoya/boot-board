package kr.co.songjava.configuration.exception;

import kr.co.songjava.configuration.http.BaseResponseCode;

public class BaseException extends AbstractBaseException {

	private static final long serialVersionUID = 8457263559425202034L;
	
	public BaseException () {
	}
	
	public BaseException(BaseResponseCode responseCode) {
		this.responseCode = responseCode;
	}
	
	public BaseException(BaseResponseCode responseCode, String[] args) {
		this.responseCode = responseCode;
		this.args = args;
	}
	
}
