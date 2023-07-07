package com.youtube.stepDefinition;


import com.youtube.questions.ValidarTitulo;
import com.youtube.tasks.HomeTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class BuscarVideoStepDefinitions {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Dado("que se encuentre en la pagina principal")
    public void abrirNavegador() {
        theActorCalled("User").wasAbleTo(
                Open.url("https://www.youtube.com/")
        );

    }
    @Cuando("busca un video, lo seleccione de forma aleatoria y lo reproduce")
    public void buscarVideo() {
        theActorInTheSpotlight().attemptsTo(
                HomeTask.search()
        );
    }

    @Entonces("validar que el titulo sea el mismo del seleccionado y del video reproducido")
    public void validarTitulo() {
        theActorInTheSpotlight().should(
                seeThat(ValidarTitulo.from(),Matchers.is(true))
        );
    }
}
