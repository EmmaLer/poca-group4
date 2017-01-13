package modele
import Array._
import controleur.Coordonnees2D
import controleur.AbstractCoordonnees
import scala.collection.mutable.ListBuffer
import Observation._

/**
 * Ce Modele est celui que l'on utilise avec des coordonnees en 2D 
 */

class ModeleJeu (var sizeX:Int,var sizeY:Int) extends AbstractModele(sizeX:Int,sizeY:Int){
  //ici on mettra soit les regles du jeu -- ON CONSIDERE QUE SIZEX ET SIZEY > 20
  
  var joueur = new Joueur("toma") 
  var objBananaJeu = new ListBuffer[Banana]()
  var minionJeu= new ListBuffer[Minion]()
  
  /**
   * mise en place de la carte
   */
  var carte = new Carte()
  var tabZone1 = Array.ofDim[Coordonnees2D](5, 5)
  var i, j = 0
  for (i <- 0 to 5 - 1) {
    for (j <- 0 to 5 - 1) {
      tabZone1(i)(j) = new Coordonnees2D(i, j)
      tabZone1(i)(j).x = i
      tabZone1(i)(j).y = j
    }
  }

  var zone = new ZoneCarre();
  zone.Surface = tabZone1
  
  def this(){
    this(5,5);
    sizeX = 5;
    sizeY = 5;
  }
  
  
  def placementJoueurDébut(){
    joueur.position.x = 0
    joueur.position.y = 0
  }
  
  def placementObjetDébut (){
    val objB = new ListBuffer[Banana]
    //On place 10 éléments de type banana
    objB(0).creer(new Coordonnees2D(1,0))
    objB(1).creer(new Coordonnees2D(4,5))
    objB(2).creer(new Coordonnees2D(0,2))
    objB(3).creer(new Coordonnees2D(9,1))
    objB(4).creer(new Coordonnees2D(8,8))
    objB(5).creer(new Coordonnees2D(2,0))
    objB(6).creer(new Coordonnees2D(13,3))
    objB(7).creer(new Coordonnees2D(2,14))
    objB(8).creer(new Coordonnees2D(5,10))
    objB(9).creer(new Coordonnees2D(7,19))
    objB++objBananaJeu /* Concaténation des listes !*/
    objB++zone.ComponentsObjet
  }
  
  def placementMinionDébut(){
    val minion = new ListBuffer[Minion]
    minion(0)=new Minion(2,"Tom1",new Coordonnees2D(1,1))with Mechancete
    minion(1)=new Minion(34,"Tom2",new Coordonnees2D(3,1))with Mechancete
    minion(2)=new Minion(97,"Tom3",new Coordonnees2D(5,0))with Mechancete
    minion(3)=new Minion(78,"Tom4",new Coordonnees2D(6,9))with Mechancete
    minion(4)=new Minion(22,"Tom5",new Coordonnees2D(7,7))with Mechancete
    minion(5)=new Minion(90,"Tom6",new Coordonnees2D(4,1))with Mechancete
    minion(6)=new Minion(13,"Tom7",new Coordonnees2D(1,8))with Mechancete
    minion(7)=new Minion(9,"Tom8",new Coordonnees2D(16,0))with Mechancete
    minion(8)=new Minion(46,"Tom9",new Coordonnees2D(14,19))with Mechancete
    minion(9)=new Minion(50,"Tomi1",new Coordonnees2D(6,13))with Mechancete
    minion++minionJeu
    minion++zone.ComponentsMinion
    println(" " + minion(9))
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
      //  prevenirObs()
      }
    }else{
      //prevenirObs()
      //Je ne fais rien mais je préviens l'observateur pour que le controleur le sache
    }
  }
}
