package org.droolsdemo.main;

import org.droolsdemo.entities.Account;
import org.droolsdemo.entities.Unification;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DroolsDemo {
	
    public static void main(final String[] args) {

    	KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
    	
    	KieSession ksession = kc.newKieSession("DroolsDemoKS");
    	
    	byte bic1 = 3;
    	
    	Account acc1 = new Account("FirstAccount", bic1);
    	Account acc2 = new Account("SecondAccount", bic1);

    	Unification uni1 = new Unification(acc1, acc2);
    	
    	ksession.insert(uni1);
    	
    	byte bic2 = 4;
    	byte bic3 = 5;
    	
    	Account acc3 = new Account("FirstAccount", bic2);
    	Account acc4 = new Account("SecondAccount", bic3);

    	Unification uni2 = new Unification(acc3, acc4);
    	
    	ksession.insert(uni2);

    	ksession.fireAllRules();
    	
    }


}
