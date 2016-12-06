/**
 *  classe de test. Creation d'un joueur, d'un objet, d'un minion
 *  et teste sur les interactions entre ces differents objets
 */
package test
import Array._
import modele.ModeleJeu
import modele.Minion
import controleur.AbstractCoordonnees

object Test {
  def main(args: Array[String]) {
    var jeu = new ModeleJeu();

    /* Création des minions */
    var personnage: Minion = new Minion(10, "bob", new AbstractCoordonnees(0, 0));
    var personnage1: Minion = new Minion(10, "Arry", new AbstractCoordonnees(0, 0));
    
    /* Ajout de minions au joueur1 */
    jeu.joueur1.add_Minion(personnage1);
    
    println(jeu.joueur1);
    println(jeu.joueur1.list_Minions);
    println(jeu.joueur1.isEmpty_Minion);
    
    /* Supression d'un minion */
    jeu.joueur1.delete_Minion(personnage);
    jeu.joueur1.augmente_Niveau();
    println(jeu.joueur1);
    println(jeu.joueur1.list_Minions);

    /*
    var coordMinion = new Coordonnees2D(1.5, 4.6)
    var posMinion = new Position2D(coordMinion)
    
    var joueur = new Joueur("toto");
    var minion = new MinionGentil(10, "Kevin", posMinion)
    
    //joueur.add(10, "Kevin")
    //TODO : changer le add de la classe joueur en add(Minion)
    */
  }
}