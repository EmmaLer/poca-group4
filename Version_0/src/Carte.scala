import Array._
import position.Position

object Carte extends Position{
 //en cours de revu
  
  def plateau (x:Int, y:Int)= {
    var p = ofDim[Int](x,y);
    var i,j=0;
    for(i <- 0 to x){
      for(j <- 0 to y){
        p(i)(j) = 0;
      }
    }
  }
  
}