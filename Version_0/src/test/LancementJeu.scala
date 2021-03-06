package test
import Observation._
import scala.collection.mutable.ListBuffer
import controleur.ControleurJeu
import controleur.Coordonnees2D
import modele.ModeleJeu
import vue.VueJeu
import scala.swing._

class LancementJeu (modele: ModeleJeu, controleur: ControleurJeu) extends Observateur {
  var listeObs = new ListBuffer [Observateur]();
  var vue = new VueJeu(controleur)
  
  def lancement (){

    modele.ajouterObs(vue)
    /* Test placement début */
    modele.placementObjetDébut()
    modele.placementMinionDébut()
    modele.placementJoueurDébut()
  }
  
  def jouer() {
    var tour : Int = 0
    while (true) {
//      test des mouvements possibles avec coordonnees de depart (0,3)      
//      if (tour == 1) { vue.coord_Actuel.x = 1; vue.coord_Actuel.y = 2 }
//       if (tour == 2) { vue.coord_Actuel.x = 1; vue.coord_Actuel.y = 4 }
//       if (tour == 3) { vue.coord_Actuel.x = 1; vue.coord_Actuel.y = 3 }
//       if (tour == 4) { vue.coord_Actuel.x = 2; vue.coord_Actuel.y = 4 }
       
      println("--------------------------------------------------------------------------")
      println("TOUR = " + tour)
      println("Position du joueur MAJ :" + modele.joueur.position)
      println("Vue coord Actuel " + vue.coord_Actuel)
      controleur.control(vue.coord_Actuel)
      tour = tour + 1
//      miseAjsour
    }
  }
  
  def miseAjour() {
    val controleur = new ControleurJeu(modele)
    println("jjjjjjjjjjjjjjjjjjjjjjjjjj"+modele.joueur.position)
    modele.ajouterObs(vue)
    modele.prevenirObs()
  }
 
  def ajouterObs(o:Observateur){
    listeObs.+=(o)
  }
  
  def supprimerObs (){
    listeObs = new ListBuffer[Observateur]()
  }
  
  def prevenirObs(){
    for(o <- listeObs) o.miseAjour()
  }
  
}