package modele

import controleur.AbstractCoordonnees

class SceneDeCombat(position : AbstractCoordonnees) extends Lieu(position : AbstractCoordonnees) with AccessibleParEquipe with LieuClos {
  
  //def println("Scene de combat creee")
}