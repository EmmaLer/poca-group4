/* Classe des definition des objet */

package objet 

import joueur.Joueur
import minion.Minion 
import position2d.Position2D 

abstract class Objet {
  var position : Position2D
  var proprietaire : Joueur
 
  def getPositionObjet(): Position2D = { 
     var p : Position2D = position
   return p;
  }
 
  def creerObjet( obj : Objet, p : Position2D ){
    obj.position = p
  }

  /** verification de la methode remove **/
  def existe(p : Position2D): Boolean = {
  if(position == p){
    return true
  }
return false
}


def remove() = {
  position = null
}
}

class Banana(p:Position2D) extends Objet{
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
