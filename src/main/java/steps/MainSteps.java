package steps;


import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by OWL on 27.01.2018.
 */
public class MainSteps {

    @Step("Выбран раздел - Маркет")
    public void stepSelectMarket(){
        new MainPage().selectMerket();
    }

}
