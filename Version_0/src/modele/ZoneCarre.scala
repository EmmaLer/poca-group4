package modele

import controleur.AbstractCoordonnees
import controleur.Coordonnees2D


class ZoneCarre( val Superficie : Array[Coordonnees2D]) extends Zone(Superficie : Array[Coordonnees2D]) {
  
  def afficheZoneCarre = println("j'affiche la zone")
                                             
}