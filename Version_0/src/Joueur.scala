package joueur

import minion.Minion
import objet.Objet

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
 
// !!! AJOUT DE LA POSITION !!!!!! 
 
 /** Augmente le niveau de méchanceté du joueur **/
 def augmente_Niveau()={
 }

  /** Ajout un minion dans la liste 
   *  proprietaire : Joueur (appeler le getteur) 
   *  position : Position (utiliser la position du joueur) **/
 def add_Minion(niveauDeConnerie: Int, prenom: String)={

   /*  var minion = new Minion( ... )
    *  list_Minions += minion */
   
 }
 
 /** Supprime un minion dans la liste 
  *  proprietaire : Joueur (appeler le getteur) 
  *  position : Position (utiliser la position du joueur) **/
 def delete_Minion(niveauDeConnerie: Int, prenom: String)={
   
   /* var minion = new Minion( ... )
    * list_Minions -= minion */
 }
 
 /** Ajout un objet à la liste **/
 def add(obj: Objet)={
   
 }
 
 /** supprime un objet à la liste **/
 def delete(obj: Objet)={
   
 }
 
}
