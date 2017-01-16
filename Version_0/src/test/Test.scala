/**
 *  classe de test. Creation d'un joueur, d'un objet, d'un minion
 *  et teste sur les interactions entre ces differents objets
 */
package test
import Array._
import modele.ModeleJeu
import modele.Minion
import modele.Mechancete
import controleur._
import vue.VueJeu
import controleur.ControleurJeu

object Test {

  def main(args: Array[String]) {
    var jeu = new ModeleJeu(5, 5);
    var controleur = new ControleurJeu(jeu);
    val l = new LancementJeu(jeu,controleur)
    
    l.lancement()
    l.jouer()

  }
}