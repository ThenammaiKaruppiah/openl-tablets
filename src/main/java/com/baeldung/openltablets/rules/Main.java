package com.baeldung.openltablets.rules;


import java.time.LocalDateTime;

import org.openl.rules.runtime.RulesEngineFactory;
import org.openl.runtime.EngineFactory;

import com.baeldung.openltablets.model.Case;
import com.baeldung.openltablets.model.User;

public class Main {
    private IRule instance;

    public static void main(String[] args) {
        Main rules = new Main();
        User user = new User();
        user.setName("Suitability User3");
        Case aCase = new Case();
        aCase.setUser(user);
        aCase.setHourOfDay(18);
        rules.process(aCase);
    }

    public void process(Case aCase) {
        final EngineFactory<IRule> engineFactory = new RulesEngineFactory<IRule>(getClass().getClassLoader()
            .getResource("openltablets/SuitabilityRiskAssesment_Datatype.xls"), IRule.class);
        instance = engineFactory.newEngineInstance();
        instance.helloUser(aCase, new Response());
        
        int premiumAmount = 1200000;
        RiskResult riskResult= instance.getPremiumRisk(premiumAmount);
        System.out.println(" getPremiumRisk - Risk Level is "+ riskResult.getRiskLevel());
        System.out.println(" getPremiumRisk - Risk Description is "+ riskResult.getRiskDescriptionType());
//	      String s= instance.getPremiumRisk(premiumAmount);
//	      System.out.println("Risk assessed getPremiumRisk is "+s);

      int checkingORSaving = 7000;
      String s1= instance.getCheckingSavingRisk(checkingORSaving);
      System.out.println("Risk assessed getCheckingSavingRisk is "+s1);
//        RiskResultWrapper riskResult2= instance.getCheckingSavingRisk(checkingORSaving);
//        System.out.println("Risk assessed getCheckingSavingRisk is "+riskResult2.getRiskResultType());

        
    }
}
