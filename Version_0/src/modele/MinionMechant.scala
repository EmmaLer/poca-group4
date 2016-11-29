package modele
import controleur.AbstractCoordonnees


class MinionMechant(niveauDeConnerie: Int, prenom: String,  position : AbstractCoordonnees)
  extends Minion(niveauDeConnerie: Int, prenom: String, position : AbstractCoordonnees) {
 
  def nuireProprio : Unit = { println("méthode à implémenter")}
}