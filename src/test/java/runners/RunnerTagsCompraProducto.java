package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = "@stories",
        glue = "stepdefinitions",
        features = "src/test/resources/features",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RunnerTagsCompraProducto {
}