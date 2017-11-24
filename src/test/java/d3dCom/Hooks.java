package d3dCom;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
BasePage bPage = new BasePage();

@Before
    public void setup_browser(){

    bPage.openbrowser();
}


@After
    public void Tear_down(){

        bPage.Close_Browser();
}


}
