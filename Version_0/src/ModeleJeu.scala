import Array._

class ModeleJeu {
  //ici on mettra soit les regles du jeu
  
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