package coordonnees2d

import abstractcoordonnees.AbstractCoordonnees

class Coordonnees2D (var x: Double, var y: Double)extends AbstractCoordonnees{
    /*in order to compare 2 coordonnees*/
  def equals(c2: Coordonnees2D):Boolean ={
    if(c2.x == x && c2.y == y )
      return true;
    return false;
  }
  
}