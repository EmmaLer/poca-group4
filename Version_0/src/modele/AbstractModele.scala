package modele
import controleur.AbstractCoordonnees
abstract class AbstractModele (sizeX:Int, sizeY:Int){
  def deplacement(pos1: AbstractCoordonnees,pos2:AbstractCoordonnees)=Unit;
}