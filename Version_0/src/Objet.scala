/* Classe des definition des objet */



package objet 

import joueur.Joueur
import minion.Minion 
import position.Position 
import carte.Carte 

abstract class Objet {
 var position : Position

 

def getPositionObjet(): Position = { 
   var p : Position = position
  return p;
}
 
 
def creerObjet( obj : Objet, p : Position ){
  obj.position = p
}

/** verification de la methode remove **/
def existe(p : Position): Boolean = {
  if(position == p){
    return true
  }
return false
}


def remove() = {
  position = joueur.position 
}
}

class Banana(p:Position, gain : Int) extends Objet ( p ){
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

  


def main(args: Array[String]) {
  var b : Banana = new 
}
