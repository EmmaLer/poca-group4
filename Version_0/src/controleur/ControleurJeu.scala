
package controleur

import modele.ModeleJeu
import modele.Joueur
import scala.collection.mutable.ListBuffer

class ControleurJeu (var modele: ModeleJeu){
  
 // regarde si le mouvement demandé est possible
  // vérification des pos sur la carte, si case atteignable etc..
	def mvtPossible ( pos1: Coordonnees2D, pos2:Coordonnees2D): Boolean={
			//a modifier quand on aura la carte
			if(pos2.x >= 0 && pos2.x < modele.sizeX){
				if (pos1.x >= 0 && pos1.x < modele.sizeY){
					var mvtAtt = new Array [Coordonnees2D](8)
					mvtAtt = modele.joueur.mvtAtteignable(pos1,modele)
					
					for (x <- mvtAtt){
						if(pos2.equals(x))
							return true
					}
				}
			}
			return false
	}  
    
    
    // si le mvt est possible on fait le déplacement 
  // sinon retour à la case d'avant
  def control (pos1 : Coordonnees2D, pos2: Coordonnees2D)={ 
    if (mvtPossible(pos1,pos2)){
      println("Mouvement possible !!");
    // je fais le mvt dans le modele
      modele.deplacement(pos1, pos2);
    }else
      println("Mouvement impossible !");
      modele.deplacement(pos1,pos1);
      //mvt pos 1 pos 1
  }
  

}