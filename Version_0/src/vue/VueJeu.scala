package vue

import java.io._
import scala.swing._
import controleur.ControleurJeu
import java.awt.{ Color, Graphics2D }
import scala.swing.BorderPanel.Position._
import Observation._
import modele.Joueur
import modele.ModeleJeu

// Définition de l'IG pour ModeleJeu et ControleurJeu
// J'ai décidé d'utiliser SWING pour l'IG -- Si autre avis, on peut changer ;)
class VueJeu (controleur :ControleurJeu) extends Observateur {
  //Faire la fenetre pour lancer le jeu
  def miseAjour(){ /*maj du dessin*/}
  
  val frame = new MainFrame {
    title = "MINION GAME !"
    contents = new BoxPanel(Orientation.Vertical){
      contents += Button (" 1 joueur ")()
      contents += Button (" multijoueurs ")()
    }
    menuBar = new MenuBar {
      contents += new Menu ("menu _"){
        contents += new MenuItem (Action("Open"){
          //ouvrir un fichier enregistré
        })
        contents += new MenuItem (Action("Save"){
          //sauvegarder une partie
        })
        contents += new MenuItem (Action("Exit"){
          //sortir
          sys.exit(0)
        })
        
      }
    }
    centerOnScreen
    size = new Dimension (500,500)

  }
  
  frame.visible = true


}