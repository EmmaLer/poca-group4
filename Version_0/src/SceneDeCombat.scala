package sceneDeCombat

import accessibleParEquipe.AccessibleParEquipe
import lieu.Lieu
import lieuClos.LieuClos
import position.Position


class SceneDeCombat(var position : Position) extends Lieu(position : Position) with AccessibleParEquipe with LieuClos {
  
  //def println("Scene de combat creee")
}