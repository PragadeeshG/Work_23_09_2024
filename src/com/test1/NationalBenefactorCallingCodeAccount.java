package com.test1;

public class NationalBenefactorCallingCodeAccount {
	private Integer recordKey;
	private Integer benefactorCallingCode;
	private String benefactorCallingCodePosition;
	private String benefactorCallingCodeLength;
	private String dialDigitsPosition;
	private String dialDigitsLength;
	private boolean dialCodeAlternatePosition;
	private String dialCodeAlternateLength;
	private String requiredPosition;
	private String requiredLength;
	private String countryCode;
	private String countryDesc;
	private String countryDirectory;
	private String dataSourcedFrom;

	public NationalBenefactorCallingCodeAccount() {

	}

	public NationalBenefactorCallingCodeAccount(Integer recordKey, Integer benefactorCallingCode,
			String benefactorCallingCodePosition, String benefactorCallingCodeLength, String dialDigitsPosition,
			String dialDigitsLength, boolean dialCodeAlternatePosition, String dialCodeAlternateLength,
			String requiredPosition, String requiredLength, String countryCode, String countryDesc,
			String countryDirectory, String dataSourcedFrom) {
		super();
		this.recordKey = recordKey;
		this.benefactorCallingCode = benefactorCallingCode;
		this.benefactorCallingCodePosition = benefactorCallingCodePosition;
		this.benefactorCallingCodeLength = benefactorCallingCodeLength;
		this.dialDigitsPosition = dialDigitsPosition;
		this.dialDigitsLength = dialDigitsLength;
		this.dialCodeAlternatePosition = dialCodeAlternatePosition;
		this.dialCodeAlternateLength = dialCodeAlternateLength;
		this.requiredPosition = requiredPosition;
		this.requiredLength = requiredLength;
		this.countryCode = countryCode;
		this.countryDesc = countryDesc;
		this.countryDirectory = countryDirectory;
		this.dataSourcedFrom = dataSourcedFrom;
	}

	public Integer getRecordKey() {
		return recordKey;
	}

	public void setRecordKey(Integer recordKey) {
		this.recordKey = recordKey;
	}

	public Integer getBenefactorCallingCode() {
		return benefactorCallingCode;
	}

	public void setBenefactorCallingCode(Integer benefactorCallingCode) {
		this.benefactorCallingCode = benefactorCallingCode;
	}

	public String getBenefactorCallingCodePosition() {
		return benefactorCallingCodePosition;
	}

	public void setBenefactorCallingCodePosition(String benefactorCallingCodePosition) {
		this.benefactorCallingCodePosition = benefactorCallingCodePosition;
	}

	public String getBenefactorCallingCodeLength() {
		return benefactorCallingCodeLength;
	}

	public void setBenefactorCallingCodeLength(String benefactorCallingCodeLength) {
		this.benefactorCallingCodeLength = benefactorCallingCodeLength;
	}

	public String getDialDigitsPosition() {
		return dialDigitsPosition;
	}

	public void setDialDigitsPosition(String dialDigitsPosition) {
		this.dialDigitsPosition = dialDigitsPosition;
	}

	public String getDialDigitsLength() {
		return dialDigitsLength;
	}

	public void setDialDigitsLength(String dialDigitsLength) {
		this.dialDigitsLength = dialDigitsLength;
	}

	public boolean isDialCodeAlternatePosition() {
		return dialCodeAlternatePosition;
	}

	public void setDialCodeAlternatePosition(boolean dialCodeAlternatePosition) {
		this.dialCodeAlternatePosition = dialCodeAlternatePosition;
	}

	public String getDialCodeAlternateLength() {
		return dialCodeAlternateLength;
	}

	public void setDialCodeAlternateLength(String dialCodeAlternateLength) {
		this.dialCodeAlternateLength = dialCodeAlternateLength;
	}

	public String getRequiredPosition() {
		return requiredPosition;
	}

	public void setRequiredPosition(String requiredPosition) {
		this.requiredPosition = requiredPosition;
	}

	public String getRequiredLength() {
		return requiredLength;
	}

	public void setRequiredLength(String requiredLength) {
		this.requiredLength = requiredLength;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryDesc() {
		return countryDesc;
	}

	public void setCountryDesc(String countryDesc) {
		this.countryDesc = countryDesc;
	}

	public String getCountryDirectory() {
		return countryDirectory;
	}

	public void setCountryDirectory(String countryDirectory) {
		this.countryDirectory = countryDirectory;
	}

	public String getDataSourcedFrom() {
		return dataSourcedFrom;
	}

	public void setDataSourcedFrom(String dataSourcedFrom) {
		this.dataSourcedFrom = dataSourcedFrom;
	}

}
