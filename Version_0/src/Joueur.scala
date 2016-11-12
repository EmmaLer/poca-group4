package joueur

import minion.Minion
import objet.Objet
import position.Position

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
 
 /* La position du joueur 
  * Initialisation de la position à (0,0) */
 
 // A DISCUTER !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 var position = new Position(0,0)
 
 /** Augmente le niveau de méchanceté du joueur **/
 def augmente_Niveau()={
    nv_Mechant = nv_Mechant+ 1
 }

  /** Ajout un minion dans la liste 
   *  proprietaire : Joueur (appeler le getteur) 
   *  position : Position (utiliser la position du joueur) **/
 def add_Minion(niveauDeConnerie: Int, prenom: String)={

     var minion = new Minion(niveauDeConnerie, prenom, nom, position)
     list_Minions += minion
   
 }
 
 /** Supprime un minion dans la liste 
  *  proprietaire : Joueur (appeler le getteur) 
  *  position : Position (utiliser la position du joueur) **/
 def delete_Minion(niveauDeConnerie: Int, prenom: String)={
   
    var minion = new Minion(niveauDeConnerie, prenom, nom, position)
    list_Minions -= minion
 }
 
 /** Ajout un objet à la liste **/
 def add(obj: Objet)={
  
 }
 
 /** supprime un objet à la liste **/
 def delete(obj: Objet)={
   
 }
 
}
