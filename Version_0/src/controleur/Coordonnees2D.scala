package controleur

class Coordonnees2D (var x2D: Int, var y2D: Int)extends AbstractCoordonnees(){
   
   x = x2D
   y = y2D
   
  /*in order to compare 2 coordonnees*/
  def equals(c2: Coordonnees2D):Boolean ={
    return (c2.x2D == x2D && c2.y2D == y2D );
  }
 
  /*changer en abstract */
  def changeToAbstract ():AbstractCoordonnees={
    return new AbstractCoordonnees (this.x,this.y)
  }
  
}