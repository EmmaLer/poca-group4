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
    /* Fait un déplacement */
//    while (true) {
//      println("dddddddddddddddddddddd"+modele.joueur.position)
//      controleur.control(modele.joueur.position, vue.coord_Actuel)
//      println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+vue.coord_Actuel)
////      modele.joueur.position.x = vue.coord_Actuel.x
////      modele.joueur.position.y = vue.coord_Actuel.y
//      printf(modele.joueur.position + "\n")
////      miseAjour
//    }
    controleur.control(new Coordonnees2D(4,4))
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