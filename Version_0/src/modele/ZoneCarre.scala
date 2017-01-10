package modele

import controleur.AbstractCoordonnees
import controleur.Coordonnees2D


class ZoneCarre(override val Superficie : Integer) extends Zone(Superficie : Integer) {
  
  def afficheZoneCarre = println("j'affiche la zone")
  
  /** TODO : changer pour une methode plus generique **/
  override val Surface = Array(new AbstractCoordonnees(0,0),
                              new AbstractCoordonnees(0,1),
                              new AbstractCoordonnees(1,0),
                              new AbstractCoordonnees(1,1))
                         
   
                             
}