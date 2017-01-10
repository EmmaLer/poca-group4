package test
import Observation._
import scala.collection.mutable.ListBuffer
import controleur.ControleurJeu
import modele.ModeleJeu
import vue.VueJeu


class LancementJeu (modele: ModeleJeu, controleur: ControleurJeu) extends Observateur {
  var listeObs = new ListBuffer [Observateur]();
  
  def lancement (){
    
    
  }
  
  def miseAjour() {
    val controleur = new ControleurJeu(modele)
    var jeu:VueJeu=new VueJeu(controleur)
    modele.ajouterObs(jeu)
    modele.prevenirObs()
  }
 
  def ajouterObs(o:Observateur){
    
  }
  
  def supprimerObs (){
    
  }
  def prevenirObs(){
    
  }
}