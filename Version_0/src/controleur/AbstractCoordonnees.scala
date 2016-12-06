
package controleur

//Permettra de choisir si on veut des coordonnées en 3dim ou 2dim
class AbstractCoordonnees (var x:Int,var y:Int){
  // Méthode pour passer en coordonnees2D !
  def changeToCoordonnees2D () :Coordonnees2D={
    return (new Coordonnees2D (x,y));
  }
}