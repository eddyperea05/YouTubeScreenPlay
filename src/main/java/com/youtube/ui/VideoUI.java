package com.youtube.ui;

import net.serenitybdd.screenplay.targets.Target;

public class VideoUI {
    public static Target LBL_VIDEO = Target.the("Titulo del video detalle").locatedBy("//h1[@class='style-scope ytd-watch-metadata']");
}
