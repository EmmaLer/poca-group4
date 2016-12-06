package modele
import Array._
import controleur.Coordonnees2D

/**
 * Ce Modele est celui que l'on utilise avec des coordonnees en 2D 
 */
class ModeleJeu (var sizeX:Int,var sizeY:Int){
  //ici on mettra soit les regles du jeu
  
  var joueur1: Joueur = new Joueur(null) 
<<<<<<< HEAD
<<<<<<< HEAD
 
=======
=======
>>>>>>> refs/remotes/origin/master
  
>>>>>>> 29167b7d13caddc639e63d9ed2c28a283a315739
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
<<<<<<< HEAD
=======
  
  def deplacement (pos1: Coordonnees2D, pos2: Coordonnees2D){
    if (!pos1.equals(pos2)){
      if(joueur1.position.changeToCoordonnees2D().equals(pos1)){
        joueur1.position = pos2;
      }
    }else{
      //Je ne fais rien mais je préviens l'observateur pour que le controleur le sache
    }
  }
<<<<<<< HEAD
>>>>>>> 29167b7d13caddc639e63d9ed2c28a283a315739
=======
>>>>>>> refs/remotes/origin/master
}
