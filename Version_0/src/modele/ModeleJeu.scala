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
  }
  
  override def ajouterObs(o:Observateur)={
    listeObs.+=(o)
  }
  
  override def prevenirObs={
    for(o <- listeObs) o.miseAjour()
  }
  ///////////////////////////////////////////////////////////////////////////////////////////////////////
  /** test de creation de carte et de zone**/
  var j1 = new Joueur("toto")
  var j2 = new Joueur("sam")
  var m1 = new Minion(10, "bob", new AbstractCoordonnees(0, 0)) with Mechancete;
  var m2 = new Minion(10, "Arry", new AbstractCoordonnees(0, 0)) with Mechancete;
  
  var carte = new Carte()
  
  var zone = new ZoneCarre(5);
  var zone3 = new ZoneCarre(4);
  
  carte.addZone(zone)
  carte.addZone(zone3)
  carte.afficheCarte
  println("Nombre de zones sur la carte : " + carte.getZone())
  
  zone.afficheZoneCarre
  zone.addJoueur(j1)
  zone.addJoueur(j2)
  zone.addMinion(m1)
//  zone.addMinion(m2)
  
  println("Nombre de joueurs sur la zone : " + zone.getJoueur())
  println("Nombre de minions sur la zone : " + zone.getMinion())
  ////////////////////////////////////////////////////////////////////////////////////////////////////
  
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
