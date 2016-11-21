package coordonnees2d

class Coordonnees2D (var x,y: Double){
    /*in order to compare 2 coordonnees*/
  def equals(var c2: Coordonnees):Boolean ={
    if(c2.x == x && c2.y == y )
      return true;
    return false;
  }
  
}