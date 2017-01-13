package modele
import Array._
import controleur.Coordonnees2D
import controleur.AbstractCoordonnees
import scala.collection.mutable.ListBuffer
import Observation._
import javax.swing.ImageIcon

/**
 * Ce Modele est celui que l'on utilise avec des coordonnees en 2D 
 */

class ModeleJeu (var sizeX:Int,var sizeY:Int) extends AbstractModele(sizeX:Int,sizeY:Int){
  
  var joueur = new Joueur("toma") 
  var objBananaJeu = new ListBuffer[Banana]()
  var minionJeu= new ListBuffer[Minion]()
  
  /**
   * mise en place de la carte
   */
  var carte = new Carte()
  var tabZone1 = Array.ofDim[Coordonnees2D](5, 5)
  for (i <- 0 to sizeX - 1) {
    for (j <- 0 to sizeY - 1) {
      tabZone1(i)(j) = new Coordonnees2D(i, j)
      tabZone1(i)(j).x = i
      tabZone1(i)(j).y = j
    }
  }
  var zone = new ZoneCarre(sizeX, sizeY);
  zone.Surface = tabZone1
  
  def placementJoueurDébut(){
    joueur.position = tabZone1(0)(0)
    println(joueur.position)
  }

  
  def placementObjetDébut (){
    val objB = new Array[Banana](5)
    for (i<-0 to 4)
      objB(i)=new Banana
    //On place 10 éléments de type banana
    objB(0).creer(tabZone1(1)(0))
    objB(1).creer(tabZone1(4)(1))
    objB(2).creer(tabZone1(0)(2))
    objB(3).creer(tabZone1(3)(3))
    objB(4).creer(tabZone1(2)(0))
    objB++objBananaJeu /* Concaténation des listes !*/
    objB++zone.ComponentsObjet
    for (i<- 0 to objB.length-1)
      println(objB(i))
  }
  
  def placementMinionDébut(){
    val minion = new Array[Minion](4)
    minion(0)=new Minion(2,"Tom1",tabZone1(1)(1))with Mechancete
    minion(1)=new Minion(34,"Tom2",tabZone1(3)(1))with Mechancete
    minion(2)=new Minion(97,"Tom3",tabZone1(4)(0))with Mechancete
    minion(3)=new Minion(90,"Tom6",tabZone1(4)(1))with Mechancete

    minion++minionJeu
    minion++zone.ComponentsMinion
    for(i<-0 to minion.length-1)
      println(minion(i))
  }
  
  override def ajouterObs(o:Observateur)={
    listeObs.+=(o)
  }
  
  override def prevenirObs={
    for(o <- listeObs) o.miseAjour()
  }
  
  
  /** déplacement **/
  def deplacement (pos1: Coordonnees2D, pos2: Coordonnees2D){
    if (!pos1.equals(pos2)){
      if(joueur.position.changeToCoordonnees2D().equals(pos1)){
        joueur.position = pos2;
        prevenirObs()
      }
    }else{
      prevenirObs()
      //Je ne fais rien mais je préviens l'observateur pour que le controleur le sache
    }
  }
}
