package br.com.paulobc.gui.label;

public class MasterKeyCreatorLabel {
	private String masterkey;
	private String repeatMasterkey;
	private String okButton;
	private String cancelButton;
	
	
	public void setMasterkey(String masterkey ) {
		this.masterkey = masterkey;
	}
	
	public String getMasterkey() {
		return this.masterkey;
	}
	
	public void setRepeatMasterkey(String repeatMasterkey) {
		this.repeatMasterkey = repeatMasterkey;
	}
	
	public String getRepeatMasterkey() {
		return this.repeatMasterkey;
	}
	
	public void setOkButton(String okButton) {
		this.okButton = okButton;
	}
	
	public String getOkButton() {
		return this.okButton;
	}
	
	public void setCancelButton(String cancelButton) {
		this.cancelButton = cancelButton;
	}
	
	public String getCancelButton() {
		return this.cancelButton;
	}
}
