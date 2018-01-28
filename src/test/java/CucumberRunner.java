import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"}, glue = {"steps"},//передается, что лежит в степах
        plugin = {
                "util.AllureReporter", //в каком формате формируется отчет
        }
)
public class CucumberRunner {

}