package com.baeldung.openltablets.rules;

import com.baeldung.openltablets.model.Case;

public interface IRule {
    void helloUser(final Case aCase, final Response response);

//    String getPremiumRisk(Integer Premium);
    String getCheckingSavingRisk(Integer CheckingORSaving);	

    RiskResult getPremiumRisk(Integer Premium);
//    RiskResult getCheckingSavingRisk(Integer CheckingORSaving);	


}