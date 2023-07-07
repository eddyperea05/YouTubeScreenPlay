package com.youtube.questions;

import com.youtube.models.VideoModel;
import net.serenitybdd.screenplay.*;

public class ObtenerModelo implements Question<VideoModel> {
    @Override
    public VideoModel answeredBy(Actor actor) {
        VideoModel videoModel = new VideoModel();
        videoModel.setNomVideo(String.valueOf(ObtenerNombreVideo.videoRandom().answeredBy(actor)));
        System.out.println(videoModel.getNomVideo());
        return videoModel;
    }

    public static ObtenerModelo buscar(){
        return new ObtenerModelo();
    }
}
