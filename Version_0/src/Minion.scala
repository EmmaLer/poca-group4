/**
 * classe de définition des Minions
 * auteur : Elodie DECERLE
 */

package minion

import position.Position
import joueur.Joueur
/*
 * comment faire l'import ? et utiliser 
 * les classes Joueur et Position comme arguments du
 * constructeur
 */



class Minion (niveauDeConnerie: Int,
    prenom: String, proprietaire :  Joueur,
    position : Position) {
    
  /* avec la potion, le minion modifie son niveau
   * de connerie
   */
  def modifieConnerie(gain:Int): Int = {
    var niveauDeConnerie : Int = niveauDeConnerie + gain
    return niveauDeConnerie
  }
  
  /*
   * connaitre le propriétaire du minion
   */
  def getProprio(): String = {
    var pseudo : String = "toto"
    return pseudo;
  }
  
  /* 
   * connaitre la position du minion
   */
  def getPositionMinion(): Position = {
    
  }
  
}