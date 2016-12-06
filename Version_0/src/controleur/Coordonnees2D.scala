package controleur

class Coordonnees2D ( x: Int, y: Int)extends AbstractCoordonnees(x:Int,y:Int){
   
  /*in order to compare 2 coordonnees*/
  def equals(c2: Coordonnees2D):Boolean ={
    return (c2.x == x && c2.y == y );
  }
  
  /*Transforme AbstractCoordonnees en Coordonnees2D*/
  def change (ac :AbstractCoordonnees){
    val a= new Coordonnees2D(ac.x,ac.y);
  }
  
}