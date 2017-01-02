
package controleur

//Permettra de choisir si on veut des coordonnées en 3dim ou 2dim
class AbstractCoordonnees (){
  var nbDim:Int = 0;
  var x,y,z : Int = 0;
  
  def this ( x: Int, y:Int){ this(); nbDim = 2}
  def this (x: Int, y:Int, z:Int){this();nbDim=3};
  
  // Méthode pour passer en coordonnees2D !
  def changeToCoordonnees2D () :Coordonnees2D={
    return (new Coordonnees2D (x,y));
  }
    override def toString: String =
    "(" + x + ", " + y + ")" 
}