package controleur

class Coordonnees2D ( x: Int, y: Int)extends AbstractCoordonnees(x:Int,y:Int){
   
  /*in order to compare 2 coordonnees*/
  def equals(c2: Coordonnees2D):Boolean ={
    return (c2.x == x && c2.y == y );
  }
 
  
}