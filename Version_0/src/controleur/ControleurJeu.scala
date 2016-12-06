
package controleur

import modele.ModeleJeu

class ControleurJeu (var modele: ModeleJeu){
  def control ()={ 
  }
  // si le mvt est possible on fait le déplacement 
  // sinon retour à la case d'avant
  
  def mvtPossible ( pos1: Coordonnees2D, pos2:Coordonnees2D): Boolean={
    return true;
  }
 // regarde si le mouvement demandé est possible
  // vérification des pos sur la carte, si case atteignable etc..
}