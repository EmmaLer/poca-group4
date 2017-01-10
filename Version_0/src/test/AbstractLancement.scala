package test

import modele.ModeleJeu
import controleur.ControleurJeu

trait AbstractLancement {
  var modele: ModeleJeu
  var cont: ControleurJeu
}