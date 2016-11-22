package sceneDeCombat

import accessibleParEquipe.AccessibleParEquipe
import lieu.Lieu
import lieuClos.LieuClos
import position2d.Position2D


class SceneDeCombat(var position : Position2D) extends Lieu(position : Position2D) with AccessibleParEquipe with LieuClos {
  
  //def println("Scene de combat creee")
}