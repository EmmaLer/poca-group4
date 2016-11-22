/** classe MinionGentil qui hérite de Minion **/
package mGentil

import minion.Minion
import joueur.Joueur
import position2d.Position2D

class MinionGentil(niveauDeConnerie: Int, prenom: String, position : Position2D)
  extends Minion(niveauDeConnerie: Int, prenom: String, position : Position2D) {
 
  def aiderProprio
}