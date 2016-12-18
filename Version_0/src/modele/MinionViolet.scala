package modele
import controleur.AbstractCoordonnees

/* classe pour montrer que la creation d'une nouvelle 
 * classe minion avec des nouvelles méthodes est possible
 */

class MinionViolet(niveauDeConnerie: Int, prenom: String, position : AbstractCoordonnees) 
extends Minion(niveauDeConnerie: Int, prenom: String, position : AbstractCoordonnees) 
with Mechancete {
  def incontrolable = println("je fais n'importe quoi !")
}