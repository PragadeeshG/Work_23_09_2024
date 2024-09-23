package com.test1;

public class NationalBenefactorCallingCodeAccountResponse {
	private Integer dialId;
	private String dialOwner;
	private boolean activeAccount;
	private Integer dialTypeID;
	private String dialType;
	private String dialStatus;
	private Integer dialDescription;
	private Integer authorizerCount;
	private String authCountry;
	private Integer authRegionCode;
	private String exceptions;
	private String status;
	private String remarks;

	public NationalBenefactorCallingCodeAccountResponse() {

	}

	public NationalBenefactorCallingCodeAccountResponse(Integer dialId, String dialOwner, boolean activeAccount,
			Integer dialTypeID, String dialType, String dialStatus, Integer dialDescription, Integer authorizerCount,
			String authCountry, Integer authRegionCode, String exceptions, String status, String remarks) {
		super();
		this.dialId = dialId;
		this.dialOwner = dialOwner;
		this.activeAccount = activeAccount;
		this.dialTypeID = dialTypeID;
		this.dialType = dialType;
		this.dialStatus = dialStatus;
		this.dialDescription = dialDescription;
		this.authorizerCount = authorizerCount;
		this.authCountry = authCountry;
		this.authRegionCode = authRegionCode;
		this.exceptions = exceptions;
		this.status = status;
		this.remarks = remarks;
	}

	public Integer getDialId() {
		return dialId;
	}

	public void setDialId(Integer dialId) {
		this.dialId = dialId;
	}

	public String getDialOwner() {
		return dialOwner;
	}

	public void setDialOwner(String dialOwner) {
		this.dialOwner = dialOwner;
	}

	public boolean isActiveAccount() {
		return activeAccount;
	}

	public void setActiveAccount(boolean activeAccount) {
		this.activeAccount = activeAccount;
	}

	public Integer getDialTypeID() {
		return dialTypeID;
	}

	public void setDialTypeID(Integer dialTypeID) {
		this.dialTypeID = dialTypeID;
	}

	public String getDialType() {
		return dialType;
	}

	public void setDialType(String dialType) {
		this.dialType = dialType;
	}

	public String getDialStatus() {
		return dialStatus;
	}

	public void setDialStatus(String dialStatus) {
		this.dialStatus = dialStatus;
	}

	public Integer getDialDescription() {
		return dialDescription;
	}

	public void setDialDescription(Integer dialDescription) {
		this.dialDescription = dialDescription;
	}

	public Integer getAuthorizerCount() {
		return authorizerCount;
	}

	public void setAuthorizerCount(Integer authorizerCount) {
		this.authorizerCount = authorizerCount;
	}

	public String getAuthCountry() {
		return authCountry;
	}

	public void setAuthCountry(String authCountry) {
		this.authCountry = authCountry;
	}

	public Integer getAuthRegionCode() {
		return authRegionCode;
	}

	public void setAuthRegionCode(Integer authRegionCode) {
		this.authRegionCode = authRegionCode;
	}

	public String getExceptions() {
		return exceptions;
	}

	public void setExceptions(String exceptions) {
		this.exceptions = exceptions;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
