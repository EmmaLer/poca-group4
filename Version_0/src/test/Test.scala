/**
 *  classe de test. Creation d'un joueur, d'un objet, d'un minion
 *  et teste sur les interactions entre ces differents objets
 */
package test
import Array._
import modele.ModeleJeu
import modele.Minion
import modele.Mechancete
import controleur.AbstractCoordonnees
import vue.VueJeu
import controleur.ControleurJeu

object Test {

  def main(args: Array[String]) {
    var jeu = new ModeleJeu(5, 5);
    var controleur = new ControleurJeu(jeu);

    //val l = new LancementJeu(jeu,controleur)

    val ui = new VueJeu(controleur)
    jeu.placementObjetDébut()
    jeu.placementMinionDébut()
    jeu.placementJoueurDébut()
    
    /* Création des minions */
    var personnage: Minion = new Minion(10, "bob", new AbstractCoordonnees(0, 0)) with Mechancete;
    var personnage1: Minion = new Minion(10, "Arry", new AbstractCoordonnees(0, 0)) with Mechancete;

    /* Ajout de minions au joueur1 */
    jeu.joueur.add_Minion(personnage1);

    /* Affichage de la carte dans la console */
    jeu.zone.afficheZoneCarre

    /* Fait un déplacement */
   // while (true) {
      jeu.joueur.position.x = ui.coord_Actuel.x
      jeu.joueur.position.y = ui.coord_Actuel.y
      printf(jeu.joueur.position + "\n")
    //}
    /* Supression d'un minion */
    jeu.joueur.delete_Minion(personnage);
    jeu.joueur.augmente_Niveau();
    //    println(jeu.joueur);
    //    println(jeu.joueur.list_Minions);

    /*
    var coordMinion = new Coordonnees2D(1.5, 4.6)
    var posMinion = new Position2D(coordMinion)
    
    var joueur = new Joueur("toto");
    var minion = new MinionGentil(10, "Kevin", posMinion)
    
    //joueur.add(10, "Kevin")
    */

  }
}