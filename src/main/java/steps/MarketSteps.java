package steps;

import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by OWL on 27.01.2018.
 */
public class MarketSteps {

    @Step("Выбран раздел - Электроника")
    public void stepSelectElectronic(){
        new MarketPage().selectElectronic();
    }

    @Step("Выбран раздел - Телевизоры")
    public void stepSelectTV(){
        new MarketPage().selectTv();
    }

    @Step("Выбран раздел - Наушники")
    public void stepSelectHeadset(){
        new MarketPage().selectHeadset();
    }
}
