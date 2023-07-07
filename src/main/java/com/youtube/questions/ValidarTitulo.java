package com.youtube.questions;

import com.youtube.ui.VideoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarTitulo implements Question {
    private String nom = String.valueOf(ObtenerNombreVideo.videoRandom());
    @Override
    public Boolean answeredBy(Actor actor) {
        return nom.equals(VideoUI.LBL_VIDEO.resolveFor(actor).getText());
    }
    public static Question from(){
        return new ValidarTitulo();
    }
}
