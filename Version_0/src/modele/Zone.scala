/**
 * classe zone. Une zone est finie et contient un nombre fini de coordonnees
 * elle contient des joueurs, des lieux, des minions => faire une classe generique
 * pour contenir ces objets
 * La zone est la partie accessible et interrogeable par le joueur
 * elle doit être mise à jour au bout d'un certain déplacement du joueur (à définir)
 */

package modele

import controleur.AbstractCoordonnees
import scala.collection.mutable.ListBuffer

class Zone(val Superficie : Integer) {
  
  /** TODO : à la création de la surface il faut vérifier que les AbstractCoordonnees  
   *  sont bien adjacentes et que ces coordonnees ne sont pas utilisees pour d'autres
   *  zones
   */
  val Surface : Array[AbstractCoordonnees] = new Array[AbstractCoordonnees](Superficie)
  
  //pour l'instant plusieurs listes jusqu'a trouver moyen de faire un générique
  val ComponentsJoueur : ListBuffer[Joueur] = null
  val ComponentsMinion : ListBuffer[Minion] = null
  val ComponentsObjet : ListBuffer[Objet] = null 
  //val ComponentsLieu : ListBuffer[Magasin]
  
  /** méthode de création lorsqu'on crée la zone ou qu'un joueur libere un objet ou un minion**/
  def addMinion(m : Minion) = ComponentsMinion += m
  def addObj(o : Objet) = ComponentsObjet += o
  
  /** ces méthodes sont appelées lorsque le joueur qui se déplace change de zone **/
  def addJoueur(j : Joueur) = ComponentsJoueur += j
  def removeJoueur(j : Joueur) = ComponentsJoueur -= j
  
  /** connaitre les autres joueurs sur la meme zone que soi **/
  def getJoueur() : ListBuffer[Joueur] = return ComponentsJoueur
  def getMinion() : ListBuffer[Minion] = return ComponentsMinion
  def getObjet() : ListBuffer[Objet] = return ComponentsObjet
  
  /** méthode appelée lorsqu'un joueur capture un minion ou un objet**/
  def removeMinion(m : Minion) = ComponentsMinion -= m
  def removeObj(o : Objet) = ComponentsObjet -= o
  
  /** TODO : reflechir aux methodes à implementer les zones 
   *  contiennent des AbstractCoordonnees qui contiennent des objets génériques
   */
  
  //def creeZone(
  
}