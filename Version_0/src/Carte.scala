import Array._
import position2d.Position2D
import coordonnees2d.Coordonnees2D

package object Carte extends Position2D(pos: Coordonnees2D){
 //en cours de revu
  
  def plateau (x:Int, y:Int)= { /* A mettre dans le main je pense !*/
    var p = ofDim[Int](x,y);
    var i,j=0;
    for(i <- 0 to x){
      for(j <- 0 to y){
        p(i)(j) = 0;
      }
    }
  }
  
}