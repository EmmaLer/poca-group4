package test
import Observation._
import scala.collection.mutable.ListBuffer
import controleur.ControleurJeu
import modele.ModeleJeu
import vue.VueJeu
import scala.swing._

class LancementJeu (modele: ModeleJeu, controleur: ControleurJeu) extends Observateur {
  var listeObs = new ListBuffer [Observateur]();
  var panel: Panel = new GridPanel(5,5)
  
  def lancement (){
    var vue = new VueJeu(controleur)
    modele.ajouterObs(vue)
    panel = vue.frame.canvas
  }
  
  def miseAjour() {
    val controleur = new ControleurJeu(modele)
    var jeu = new VueJeu(controleur)
    modele.ajouterObs(jeu)
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
  
  class PanelJeu () extends Panel {
    
  }
}