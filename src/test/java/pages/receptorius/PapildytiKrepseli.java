package pages.receptorius;

import pages.Common;
import pages.Locators;

public class PapildytiKrepseli {
    public static void openLoginUrl(){
        Common.openUrl("https://receptorius.lt/grynieji-prieskoniai/102-246-aitriosios-cili-paprikos-maltos-4771224991069.html#/1-svoris-60_g");
    }

    public static void click1kgButton() {
        Common.clickElement(Locators.Receptorius.PapildytiKrepseli.oneKgButton);
    }

    public static void clickAddAmountButton() {
        Common.clickElement(Locators.Receptorius.PapildytiKrepseli.addAmountButton);
    }
}
