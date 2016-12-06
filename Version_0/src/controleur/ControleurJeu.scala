
package controleur

import modele.ModeleJeu
import scala.collection.mutable.ListBuffer

class ControleurJeu (var modele: ModeleJeu){
  
 // regarde si le mouvement demandé est possible
  // vérification des pos sur la carte, si case atteignable etc..
    def mvtPossible ( pos1: AbstractCoordonnees, pos2:AbstractCoordonnees): Boolean={
      //a modifier quand on aura la carte
      if(pos2.x >= 0 && pos2.x < modele.sizeX){
        if (pos1.x >= 0 && pos1.x < modele.sizeY){
          var mvtAtteignable = new ListBuffer [AbstractCoordonnees]();
        }
      }
    return true;
  }
    
    
    // si le mvt est possible on fait le déplacement 
  // sinon retour à la case d'avant
  def control (pos1 : AbstractCoordonnees, pos2: AbstractCoordonnees)={ 
    // si mvt possible on le fait 
    
  }
  

}