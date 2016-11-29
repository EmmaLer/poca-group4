package sceneDeCombat

import accessibleParEquipe.AccessibleParEquipe
import lieu.Lieu
import lieuClos.LieuClos
import abstractcoordonnees.AbstractCoordonnees


class SceneDeCombat(position : AbstractCoordonnees) extends Lieu(position : AbstractCoordonnees) with AccessibleParEquipe with LieuClos {
  
  //def println("Scene de combat creee")
}