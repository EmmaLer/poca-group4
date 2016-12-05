package modele

import controleur.AbstractCoordonnees
import scala.collection.mutable.ListBuffer

/**
 * classe qui permet de se deplacer dans le jeu
 * on doit pouvoir utiliser cette classe quelque soit
 * la representation graphique de la carte
 */

object Carte {

  var Composants = new ListBuffer[AbstractCoordonnees]
  
  
  def affiche = println("j'affiche la carte")
  
  
}