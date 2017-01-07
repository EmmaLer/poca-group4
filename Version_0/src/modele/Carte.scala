package modele

import controleur.AbstractCoordonnees
import scala.collection.mutable.ListBuffer

/**
 * classe qui permet de se deplacer dans le jeu
 * on doit pouvoir utiliser cette classe quelque soit
 * la representation graphique de la carte
 */

class Carte {

  var List_Zones = new ListBuffer[Zone]
  
  
  def afficheCarte = println("j'affiche la carte")
  def addZone(z : Zone) = List_Zones += z
  def removeZone(z : Zone) = List_Zones -= z
  
  def getZone() : Int = return List_Zones.length
  
  
}