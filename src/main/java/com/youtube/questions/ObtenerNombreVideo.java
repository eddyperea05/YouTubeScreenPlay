package com.youtube.questions;

import com.youtube.ui.VideoListUI;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.*;
import org.assertj.core.internal.bytebuddy.asm.Advice;

import java.util.*;

public class ObtenerNombreVideo implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        Random random = new Random();
        ArrayList<WebElementFacade> videoList = VideoListUI.LBL_TITULO_VIDEO.resolveAllFor(actor);
        WebElementFacade video = videoList.get(random.nextInt(videoList.size()));
        String nomVideo = video.getText();
        video.click();
        return nomVideo;
    }

    public static ObtenerNombreVideo videoRandom(){
        return new ObtenerNombreVideo();
    }

}
