package steps;

import base.PredefinedActions;
import constant.ConstantValue;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AutomationHooks {

    @Before
    public void beforeScenario(Scenario scenario){
        PredefinedActions.start(ConstantValue.URL);
    }

    @After
    public void afterMethod(Scenario scenario){
        PredefinedActions.wrapUp();
    }
}
