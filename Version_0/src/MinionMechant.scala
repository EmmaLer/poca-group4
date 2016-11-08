import minion.Minion
import joueur.Joueur
import position.Position

class MinionMechant(niveauDeConnerie: Int, prenom: String, proprietaire :Joueur, position : Position)
  extends Minion(niveauDeConnerie: Int, prenom: String, proprietaire : Joueur, position : Position) {
  def nuireProprio
}