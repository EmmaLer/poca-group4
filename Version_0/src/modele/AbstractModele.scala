package modele

import controleur.AbstractCoordonnees
import Observation._
import scala.collection.mutable.ListBuffer


abstract class AbstractModele (sizeX:Int, sizeY:Int) extends Observable{
  var joueur: Joueur
  var listeObs = new ListBuffer [Observateur]();
  def deplacement(pos1: AbstractCoordonnees,pos2:AbstractCoordonnees)=Unit
  def ajouterObs(o : Observateur){ listeObs.+=(o); println("obs ajouté") }
  override def supprimerObs(){ listeObs = new ListBuffer [Observateur]()}
  def prevenirObs(){ for (obs <- listeObs) obs.miseAjour(); println("obs prevenu")}
}