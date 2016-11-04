
object Joueur {

  /* Création du pseudo du joueur (ne pourra être modifié en cours de jeu) */
 var pseudo: String = null
 
 /* Création des différentes variables */
 var nv_Mechant: Int = 0
 var nb_Minions: Int = 0
 
 /* Création d'une liste d'objet */
 var potion: List[Objet] = List();
 
 /** Attribution d'un pseudo à un joueur 
  *  Ne fonctionne QUE si on ne lui a pas déjà attribuer un pseudo **/
 def nom_Joueur(nom: String)={
   if(pseudo == null)
     pseudo = nom
 }
 
 /** Augmente le niveau de méchanceté du joueur **/
 def augmente_Niveau()={
 }

  /** Augmente le nombre de Minions du joueur de nb **/
 def augmente_Minion(nb: Int)={
 }
 
 /** Diminue le nombre de Minions du joueur de nb **/
 def diminue_Minion(nb: Int)={
 }
 
 /** Ajout un objet à la liste **/
 def add(obj: Objet)={
   
 }
 
 /** supprime un objet à la liste **/
 def delete(obj: Objet)={
   
 } 
 def main(args: Array[String]) {
 }
}