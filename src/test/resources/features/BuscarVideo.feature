#language: es
  Característica: Buscar video y reproducir


    @BuscarVideo
    Escenario: Reproduccir video de forma exitosa

      Dado que se encuentre en la pagina principal
      Cuando busca un video, lo seleccione de forma aleatoria y lo reproduce
      Entonces validar que el titulo sea el mismo del seleccionado y del video reproducido