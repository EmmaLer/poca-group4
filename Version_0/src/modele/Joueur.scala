package modele

import controleur._
import scala.collection.mutable.ListBuffer

class Joueur(val pseudo: String){

  /* Getteur pour le pseudo */
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
  var position = new Coordonnees2D(0, 0)

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

  /**Liste des déplacements faisables -- ne regarde pas si dans carte car controleur le fait !!*/
  def mvtAtteignable (pos :Coordonnees2D,modele:ModeleJeu):Array [Coordonnees2D] ={
    var l = new Array [Coordonnees2D](8)
    l(0)= new Coordonnees2D(pos.x+1,pos.y)
    l(1)=new Coordonnees2D(pos.x-1,pos.y)
    l(2)=new Coordonnees2D (pos.x,pos.y+1)
    l(3)=new Coordonnees2D(pos.x,pos.y-1) 
    l(4)=new Coordonnees2D(pos.x+1,pos.y+1)
    l(5)=new Coordonnees2D(pos.x-1,pos.y+1)
    l(6)=new Coordonnees2D(pos.x-1,pos.y-1)
    l(7)=new Coordonnees2D(pos.x+1,pos.y-1) 
    for (i<-0 to l.length-1)
      println(l(i))
    return l
  }
  
  /** Vérifie si list_potion est vide **/
  def isEmpty_Potion: Boolean =
    list_potion.isEmpty

  /** Affiche les paramètres du joueur **/
  override def toString: String =
    "Pseudo: " + nom + ", nvx de méchanceté: " + nv_Mechant + ", nb de minons: "+ list_Minions.length + ", nb de potions: " + list_potion.length + ", PositionJoueur: " + position + "\n"
    

}
