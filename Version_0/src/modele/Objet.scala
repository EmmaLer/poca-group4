/* Classe des definition des objet */

package modele

import controleur.AbstractCoordonnees


abstract class Objet {
  var position : AbstractCoordonnees
  var proprietaire : Joueur
 
  def getPositionObjet(): AbstractCoordonnees = { 
     var p : AbstractCoordonnees = position
   return p;
  }
 
  def creerObjet( obj : Objet, p : AbstractCoordonnees ){
    obj.position = p
  }

  /** verification de la methode remove **/
  def existe(p : AbstractCoordonnees): Boolean = {
  if(position == p){
    return true
  }
return false
}


def remove() = {
  position = null
}

   override def toString: String =
     "" + position
}

class Banana extends Objet{
  var position  = new AbstractCoordonnees(0,0)
  var proprietaire  = new Joueur(null)
  val gain = scala.util.Random
  
  def getGain () : Int = { 
  var  g : Int = 0
   g = gain.nextInt(20)
   return g
  }
   def captured ()={}
 /**   if ( joueur.position = minion.position ){
    banana : Banana = new Banana 
    joeur.add(banana)
    minion.modifieConnerie(10)
    banana.delete() 
    }
  }
  **/
   
}
