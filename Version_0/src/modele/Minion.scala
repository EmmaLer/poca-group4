/** classe abstraite de définition des Minions **/

package minion

import abstractcoordonnees.AbstractCoordonnees
import joueur.Joueur

abstract class Minion (var niveauDeConnerie: Int, var prenom: String,
     var position : AbstractCoordonnees) {
    
  var proprietaire : Joueur = null
  /** avec la potion, le minion modifie son niveau de connerie  **/
  def modifieConnerie(gain:Int): Int = {
    var niveauDeConnerie : Int = niveauDeConnerie + gain
    return niveauDeConnerie
  }
  
  /** connaitre le propriétaire du minion **/
  def getProprio(): String = {
    if (proprietaire != null) {
      return proprietaire.nom;
    } else {
      return "minion libre";
    }  
  }
  
  /** connaitre la position du minion sur la carte **/
  def getPositionMinion(): AbstractCoordonnees
  
  def combattre(): Unit
  
}