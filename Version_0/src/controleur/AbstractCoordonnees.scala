
package controleur

//Permettra de choisir si on veut des coordonnées en 3dim ou 2dim
<<<<<<< HEAD
class AbstractCoordonnees (var x: Integer, var y: Integer){
  
  override def toString: String =
    "(" + x + ", " + y + ")" 
=======
class AbstractCoordonnees (var x:Int,var y:Int){
  // Méthode pour passer en coordonnees2D !
  def changeToCoordonnees2D () :Coordonnees2D={
    return (new Coordonnees2D (x,y));
  }
>>>>>>> 29167b7d13caddc639e63d9ed2c28a283a315739
}