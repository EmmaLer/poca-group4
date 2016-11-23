/** classe MinionGentil qui hérite de Minion **/
package mGentil

import minion.Minion
import joueur.Joueur
import abstractcoordonnees.AbstractCoordonnees

class MinionGentil(niveauDeConnerie: Int, prenom: String, position : AbstractCoordonnees)
  extends Minion(niveauDeConnerie: Int, prenom: String, position : AbstractCoordonnees) {
 
  def aiderProprio
}