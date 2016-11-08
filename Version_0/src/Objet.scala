
package objet 

import joueur.Joueur
import minion.Minion 
import position.Position 

class Objet {
 var position : Position


def getPositionObjet(): Position = { 
   var p : Position = position
return p;
}


def remove(){
  position = joeur.position 
  
}
}

abstract class Banana(p:Position) extends Objet ( p ){
  gain = 10
   def captured ()={
    if ( joueur.position == minion.position ){
    banana : Banana = new Banana 
    joeur.add(banana)
    minion.modifieConnerie(10)
    banana.delete() 
    }
  }
  
}

  


def main(args: Array[String]) {
}
