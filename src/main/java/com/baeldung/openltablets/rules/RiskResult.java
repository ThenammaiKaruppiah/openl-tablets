package com.baeldung.openltablets.rules;

public class RiskResult {
    private String RiskLevel;
    private String RiskDescriptionType;

    public RiskResult(){};

	public RiskResult(String riskLevel, String riskDescriptionType) {
		super();
		RiskLevel = riskLevel;
		RiskDescriptionType = riskDescriptionType;
	}
	public String getRiskLevel() {
		return RiskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		RiskLevel = riskLevel;
	}
	public String getRiskDescriptionType() {
		return RiskDescriptionType;
	}


	public void setRiskDescriptionType(String riskDescriptionType) {
		RiskDescriptionType = riskDescriptionType;
	}

}
