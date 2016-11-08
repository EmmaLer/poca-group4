/** classe MinionGentil qui hérite de Minion **/

import minion.Minion
import joueur.Joueur
import position.Position

class MinionGentil(niveauDeConnerie: Int, prenom: String, proprietaire :Joueur, position : Position)
  extends Minion(niveauDeConnerie: Int, prenom: String, proprietaire : Joueur, position : Position) {
 
  def aiderProprio
}