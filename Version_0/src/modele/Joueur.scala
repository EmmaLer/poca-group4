package modele

import controleur.AbstractCoordonnees
import scala.collection.mutable.ListBuffer

class Joueur(var pseudo: String) {
 
  /* Getteur pour le pseudo */
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
 var position = new AbstractCoordonnees(0.0,0.0)
 
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
 
}
