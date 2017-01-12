package modele

import Array._
import controleur.AbstractCoordonnees
import controleur.Coordonnees2D


class ZoneCarre extends Zone {

  def afficheZoneCarre {
    for (i <- 0 to 5-1) {
      for (j <- 0 to 5-1) {
        print(" " + Surface(i)(j));
      }
      println();
    }
  }
                                             
}