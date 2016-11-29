/** classe MinionGentil qui hérite de Minion **/
package modele

import controleur.AbstractCoordonnees

class MinionGentil(niveauDeConnerie: Int, prenom: String, position : AbstractCoordonnees)
  extends Minion(niveauDeConnerie: Int, prenom: String, position : AbstractCoordonnees) {
  
  def aiderProprio : Unit = {println("à implétmenter")}
}