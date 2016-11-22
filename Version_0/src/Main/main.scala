/** 
 *  classe de test. Creation d'un joueur, d'un objet, d'un minion
 *  et teste sur les interactions entre ces differents objets
 */
package Main

import coordonnees2d.Coordonnees2D
import joueur.Joueur
import mGentil.MinionGentil
import position2d.Position2D

class main {
  def main(args: Array[String]) {
    
    var coordMinion = new Coordonnees2D(1.5, 4.6)
    var posMinion = new Position2D(coordMinion)
    
    var joueur = new Joueur("toto");
    var minion = new MinionGentil(10, "Kevin", posMinion)
    
    //joueur.add(10, "Kevin")
    //TODO : changer le add de la classe joueur en add(Minion)
    
    
  }
}