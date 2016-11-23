package mMechant
import minion.Minion
import joueur.Joueur
import abstractcoordonnees.AbstractCoordonnees


class MinionMechant(niveauDeConnerie: Int, prenom: String,  position : AbstractCoordonnees)
  extends Minion(niveauDeConnerie: Int, prenom: String, position : AbstractCoordonnees) {
 
  def nuireProprio
}