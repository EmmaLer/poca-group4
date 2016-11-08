import Array._

object Carte extends Position{
  
  val pos = new Position()
  
  def plateau (x:Int, y:Int)= {
    var p = ofDim[Int](x,y);
    var i,j=0;
    for(i <- 0 to x){
      for(j <- 0 to y){
        p = 0;// a revoir
      }
    }
  }
  
}