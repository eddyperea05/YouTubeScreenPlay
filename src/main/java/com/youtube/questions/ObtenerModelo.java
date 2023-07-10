package com.youtube.questions;

import com.youtube.models.VideoModel;
import net.serenitybdd.screenplay.*;

public class ObtenerModelo implements Question<VideoModel> {
    @Override
    public VideoModel answeredBy(Actor actor) {
        VideoModel videoModel = new VideoModel();
        videoModel.setNomVideo(String.valueOf(ObtenerNombreVideo.videoRandom().answeredBy(actor)));
        return videoModel;
    }

    public static ObtenerModelo buscar(){
        return new ObtenerModelo();
    }
}
