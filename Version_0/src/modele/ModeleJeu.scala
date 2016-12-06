package modele
import Array._


class ModeleJeu (var sizeX:Int,var sizeY:Int){
  //ici on mettra soit les regles du jeu
  
  var joueur1: Joueur = new Joueur(null) 
 
  def this(){
    this(5,5);
    sizeX = 5;
    sizeY = 5;
    println("Lancement MinionGame !");
    plateau(sizeX,sizeY); 
  }
  
  //Création de la carte -- Créer une classe Carte
  def plateau (x:Int, y:Int){ 
    var p = ofDim[Int](x,y);
    var i,j=0;
    for(i <- 0 to x-1){
      for(j <- 0 to y-1){
        p(i)(j) = 0;
      }
    }
    for (i<- 0 to x-1){
      for(j<-0 to y-1)
        print(p(i)(j)+ "|");
      println();
    }
  }
}
