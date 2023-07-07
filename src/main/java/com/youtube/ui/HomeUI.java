package com.youtube.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {

    public static Target TXT_SEARCH = Target.the("TXT Search")
            .locatedBy("//input[@id='search']");

}
