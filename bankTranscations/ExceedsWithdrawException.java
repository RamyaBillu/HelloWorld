package bankTranscations;

public class ExceedsWithdrawException extends Exception {
	private String mesage;

	public ExceedsWithdrawException(String mesage) {
		super();
		this.mesage = mesage;
	}

	public String getMesage() {
		return mesage;
	}

}
