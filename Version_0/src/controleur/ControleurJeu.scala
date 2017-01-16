
package controleur

import modele.ModeleJeu
import modele.Joueur
import modele.ZoneCarre
import scala.collection.mutable.ListBuffer

class ControleurJeu (var modele: ModeleJeu){

  // regarde si le mouvement demandé est possible
  def caseAtteignable(caseArrivee: Coordonnees2D): Boolean = {
    return ((caseArrivee.x == modele.joueur.position.x + 1 && caseArrivee.y == modele.joueur.position.y)
      || (caseArrivee.x == modele.joueur.position.x - 1 && caseArrivee.y == modele.joueur.position.y)
      || (caseArrivee.x ==modele.joueur.position.x && caseArrivee.y ==  modele.joueur.position.y + 1)
      || (caseArrivee.x ==modele.joueur.position.x && caseArrivee.y ==  modele.joueur.position.y - 1)
      || (caseArrivee.x ==modele.joueur.position.x + 1 && caseArrivee.y ==  modele.joueur.position.y + 1)
      || (caseArrivee.x ==modele.joueur.position.x - 1 && caseArrivee.y ==  modele.joueur.position.y + 1)
      || (caseArrivee.x ==modele.joueur.position.x - 1 && caseArrivee.y ==  modele.joueur.position.y - 1)
      || (caseArrivee.x ==modele.joueur.position.x + 1 && caseArrivee.y ==  modele.joueur.position.y - 1)
      || (caseArrivee.x ==modele.joueur.position.x && caseArrivee.y ==  modele.joueur.position.y))
  }
    
  // si le mvt est modele.joueur.position est possible on fait le déplacement sinon reste sur la case d'avant
  def control (pos2: Coordonnees2D)={ 
    if (caseAtteignable(pos2)) {
      println("Mouvement possible !!" + modele.joueur.position + "arrive" + pos2);
    // je fais le mvt dans le modele
      modele.deplacement(pos2);
    }else
      println("Mouvement impossible !" + pos2);
  }
  

}