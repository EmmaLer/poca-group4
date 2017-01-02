package controleur

import modele.AbstractModele

abstract class AbstractControleur (var modele : AbstractModele){
  var posInitiale = new AbstractCoordonnees()
  var posFinale = new AbstractCoordonnees()
  def mvtPossible( pos1: AbstractCoordonnees, pos2:AbstractCoordonnees): Boolean
  def control (pos1 : AbstractCoordonnees, pos2: AbstractCoordonnees)
}