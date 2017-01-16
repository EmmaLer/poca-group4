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
    while (true) {
      println("Lancement jeu 111111111111111111111111111111111" + modele.joueur.position)
      println("BEFORE : vue coord Actuel " + vue.coord_Actuel)
      controleur.control(vue.coord_Actuel)
      println("AFTER : vue coord Actuel " + vue.coord_Actuel)
//      miseAjsour
    }
//    controleur.control(new Coordonnees2D(1,0))
//    println(modele.joueur.position)
//    controleur.control(new Coordonnees2D(1,1))
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