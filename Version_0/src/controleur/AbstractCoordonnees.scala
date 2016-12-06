
package controleur
//Permettra de choisir si on veut des coordonnées en 3dim ou 2dim
class AbstractCoordonnees (var x: Integer, var y: Integer){
  
  override def toString: String =
    "(" + x + ", " + y + ")" 
}