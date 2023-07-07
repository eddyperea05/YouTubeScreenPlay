package com.youtube.ui;

import net.serenitybdd.screenplay.targets.Target;

public class VideoListUI {
    public static Target LBL_TITULO_VIDEO = Target.the("Titulo del video")
            .locatedBy("//a[@class='yt-simple-endpoint style-scope ytd-video-renderer']");

}
