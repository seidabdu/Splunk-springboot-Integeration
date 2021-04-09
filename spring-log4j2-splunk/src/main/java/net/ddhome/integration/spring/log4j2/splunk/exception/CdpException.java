package net.ddhome.integration.spring.log4j2.splunk.exception;

public class CdpException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int errorCode = 401;
	private String errorMessage = "Error Has occured";

	public CdpException(int errorCode) {
		super();
		this.errorCode = errorCode;
	}

	public CdpException(int errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return this.errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

}
