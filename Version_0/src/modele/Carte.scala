package modele

import controleur.AbstractCoordonnees
import scala.collection.mutable.ListBuffer

/**
 * classe qui permet de se deplacer dans le jeu
 * on doit pouvoir utiliser cette classe quelque soit
 * la representation graphique de la carte
 */

object Carte {

  var List_Zones = new ListBuffer[Zone]
  
  
  def affiche = println("j'affiche la carte")
  def addZone(z : Zone) = List_Zones += z
  def removeZone(z : Zone) = List_Zones -= z
  
  
}