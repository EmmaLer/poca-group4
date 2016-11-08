/** classe abstraite de définition des Minions **/

package minion

import position.Position
import joueur.Joueur

abstract class Minion (var niveauDeConnerie: Int, var prenom: String,
    var proprietaire : Joueur, var position : Position) {
    
  /** avec la potion, le minion modifie son niveau de connerie  **/
  def modifieConnerie(gain:Int): Int = {
    var niveauDeConnerie : Int = niveauDeConnerie + gain
    return niveauDeConnerie
  }
  
  /** connaitre le propriétaire du minion **/
  def getProprio(): String = {
    var pseudo : String = "toto"
    return pseudo;
  }
  
  /** connaitre la position du minion sur la carte **/
  def getPositionMinion(): Position
  
}