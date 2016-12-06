package modele

import controleur.AbstractCoordonnees
import scala.collection.mutable.ListBuffer

class Joueur(val pseudo: String) {

  /* Getteur pour le pseudo */
<<<<<<< HEAD
  def nom: String = pseudo

  /* Création des différentes variables */
  var nv_Mechant: Int = 0

  /* Création d'une liste, où on peut ajouter/supprimer */
  var list_Minions = new ListBuffer[Minion]()

  /* Création d'une liste d'objet, où on peut ajouter/supprimer */
  var list_potion = new ListBuffer[Objet]()

  // A DISCUTER !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
  /* Initialement le joueur est en position (0,0) */
  /*ICI A METTRE DANS LES REGLES DU JEU !!*/
  var position = new AbstractCoordonnees(0, 0)

  /**
   * Augmente le niveau de méchanceté du joueur
   *  Le niveau augmente toujours de 1 *
   */
  def augmente_Niveau() = {
    nv_Mechant = nv_Mechant + 1
  }

  /** Ajout un minion de list_Minions **/
  def add_Minion(personnage: Minion) = {
    list_Minions += personnage
  }

  /** Supprime un minion de list_Minions **/
  def delete_Minion(personnage: Minion) = {
    if (isEmpty_Minion == false)
      list_Minions -= personnage
  }

  /** Vérifie si list_Minions est vide **/
  def isEmpty_Minion: Boolean =
    list_Minions.isEmpty

  /** Ajout un objet à la liste **/
  def add_Potion(obj: Objet) = {
    list_potion += obj
  }

  /** supprime un objet à la liste **/
  def delete_Potion(obj: Objet) = {
    if (isEmpty_Potion == false)
      list_potion -= obj
  }

  /** Vérifie si list_potion est vide **/
  def isEmpty_Potion: Boolean =
    list_potion.isEmpty

  /** Affiche les paramètres du joueur **/
  override def toString: String =
    "Pseudo: " + nom + ", nvx de méchanceté: " + nv_Mechant + ", nb de minons: " + list_Minions.length + ", nb de potions: " + list_potion.length + "\n"

=======
  def nom:String = pseudo 
 
 /* Création des différentes variables */
 var nv_Mechant: Int = 0
 
 /* Création d'une liste, où on peut ajouter/supprimer */
 var list_Minions = new ListBuffer[Minion]()
 
 /* Création d'une liste d'objet, où on peut ajouter/supprimer */
 var list_potion = new ListBuffer[Objet]()
 
 // A DISCUTER !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 /* Initialement le joueur est en position (0,0) */
 /**ICI A METTRE DANS LES REGLES DU JEU !!*/
 var position = new AbstractCoordonnees(0,0)
 
 /** Augmente le niveau de méchanceté du joueur **/
 def augmente_Niveau()={
    nv_Mechant = nv_Mechant+ 1
 }

  /** Ajout un minion dans la liste 
   *  proprietaire : Joueur (appeler le getteur) 
   *  position : Position (utiliser la position du joueur) **/
 def add_Minion(niveauDeConnerie: Int, prenom: String)={

     var minion = new Minion(niveauDeConnerie, prenom, position)
     list_Minions += minion
   
 }
 
 /** Supprime un minion dans la liste 
  *  proprietaire : Joueur (appeler le getteur) 
  *  position : Position (utiliser la position du joueur) **/
 def delete_Minion(niveauDeConnerie: Int, prenom: String)={
   
    var minion = new Minion(niveauDeConnerie, prenom, position)
    list_Minions -= minion
 }
 
 /** Ajout un objet à la liste **/
 def add(obj: Objet)={
 
   list_potion += obj
   
 }
 
 /** supprime un objet à la liste **/
 def delete(obj: Objet)={
   
   list_potion -= obj
   
 }
 
>>>>>>> 29167b7d13caddc639e63d9ed2c28a283a315739
}
