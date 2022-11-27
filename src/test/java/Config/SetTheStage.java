package Config;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

public class SetTheStage {

    @Before
    public void SetTheStage(){
          OnStage.setTheStage(new OnlineCast());
      }
}
