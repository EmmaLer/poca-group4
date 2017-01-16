
package controleur

import modele.ModeleJeu
import modele.Joueur
import scala.collection.mutable.ListBuffer

class ControleurJeu (var modele: ModeleJeu){

  // regarde si le mouvement demandé est possible
  // vérification des pos sur la carte, si case atteignable etc..
  def mvtPossible(caseAAtteindre: Coordonnees2D): Boolean = {
    if (caseAAtteindre.x >= 0 && caseAAtteindre.x < modele.sizeX) {
      //on est dans le tableau donc on crée le tableau des cases atteignables
      var mvtAtt = new Array[Coordonnees2D](8)
      mvtAtt = mvtAtteignable

      //on affiche les cases atteignables
//      for (i <- 0 to mvtAtt.length - 1)
//        print(mvtAtt(i) + " ")
//      println

      for (i <- mvtAtt) {
        if (caseAAtteindre.equals(i)) {
          println("MvtPossible : Position départ :" + modele.joueur.position + " Position arrivée :" + caseAAtteindre)
          return true
        }
      }

    } else println("pas dans le tableau")
    return false
  }  
    

  /**Liste des déplacements faisables -- ne regarde pas si dans carte car controleur le fait !!*/
  def mvtAtteignable:Array [Coordonnees2D] ={
    var l = new Array [Coordonnees2D](8)
    l(0)= new Coordonnees2D(modele.joueur.position.x+1,modele.joueur.position.y)
    l(1)=new Coordonnees2D(modele.joueur.position.x-1,modele.joueur.position.y)
    l(2)=new Coordonnees2D (modele.joueur.position.x,modele.joueur.position.y+1)
    l(3)=new Coordonnees2D(modele.joueur.position.x,modele.joueur.position.y-1) 
    l(4)=new Coordonnees2D(modele.joueur.position.x+1,modele.joueur.position.y+1)
    l(5)=new Coordonnees2D(modele.joueur.position.x-1,modele.joueur.position.y+1)
    l(6)=new Coordonnees2D(modele.joueur.position.x-1,modele.joueur.position.y-1)
    l(7)=new Coordonnees2D(modele.joueur.position.x+1,modele.joueur.position.y-1) 

    return l
  }
    
    // si le mvt est modele.joueur.position est possible on fait le déplacement 
  // sinon retour à la case d'avant
  def control (pos2: Coordonnees2D)={ 
    if (mvtPossible(pos2)){
      println("Mouvement possible !!" + modele.joueur.position + "arrive" + pos2);
    // je fais le mvt dans le modele
      modele.deplacement(pos2);
    }else
      println("Mouvement impossible !" + pos2);
  }
  

}