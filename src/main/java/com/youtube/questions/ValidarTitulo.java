package com.youtube.questions;

import com.youtube.ui.VideoUI;
import net.serenitybdd.screenplay.*;

public class ValidarTitulo implements Question {

    @Override
    public Boolean answeredBy(Actor actor) {
        return actor.asksFor(ObtenerModelo.buscar()).getNomVideo()
                .equals(VideoUI.LBL_VIDEO.resolveFor(actor).getText());
    }

    public static Question<Boolean> from() {
        return new ValidarTitulo();
    }
}
