package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/demo1.feature",
        glue ="stepdefinitions",
        tags="@Escenarioconejemplo",
        snippets= SnippetType.CAMELCASE
)
public class DemoRunner {
}
