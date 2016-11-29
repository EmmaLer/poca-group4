package modele
import Array._


class ModeleJeu (var sizeX:Int,var sizeY:Int){
  //ici on mettra soit les regles du jeu
  
  protected var joueur1: Joueur; 
  
  def this(){
    this(5,5);
    println("Lancement MinionGame !");
    plateau(sizeX,sizeY);
    
  }
  
  //Création de la carte
  def plateau (x:Int, y:Int){ 
    var p = ofDim[Int](x,y);
    var i,j=0;
    for(i <- 0 to x){
      for(j <- 0 to y){
        p(i)(j) = 0;
      }
    }
    for (i<- 0 to x){
      for(j<-0 to y)
        println(p(i)(j));
      println("/n");
    }
  }
  
}
