package vue

import scala.swing._
import controleur.ControleurJeu
//import java.awt.{ Color, Graphics2D }
import scala.swing.BorderPanel.Position._
import Observation._
import modele.Joueur
import modele.ModeleJeu
import javax.swing.ImageIcon
import scala.swing.Reactions
import scala.swing.event.ButtonClicked

// Définition de l'IG pour ModeleJeu et ControleurJeu
// J'ai décidé d'utiliser SWING pour l'IG -- Si autre avis, on peut changer ;)
class VueJeu(controleur: ControleurJeu) extends Observateur {
  //Faire la fenetre pour lancer le jeu
  def miseAjour() { /*maj du dessin*/ }

  val frame = new MainFrame {
    title = "MINION GAME !"

    /*  val boutons = new BoxPanel(Orientation.Horizontal){
      contents += Button (" 1 joueur ")()
      contents += Button (" multijoueurs ")()
    }
  */
    /* Création de Boutons */
    val but1 = new Button {
      text = "1 Joueur"
    }
    val but2 = new Button {
      text = "multijoueurs"
    }

    /* Création de la bar de menu */
    menuBar = new MenuBar {
      contents += new Menu("menu _") {
        contents += new MenuItem(Action("Open") {
          //ouvrir un fichier enregistré
        })
        contents += new MenuItem(Action("Save") {
          //sauvegarder une partie
        })
        contents += new MenuItem(Action("Exit") {
          //sortir
          sys.exit(0)
        })

      }
    }

    centerOnScreen
    size = new Dimension(600, 600)
    preferredSize = new Dimension(600, 600)

    /* Création du panel pour le fond d'écran */
    val canvas = new Panel {
      opaque = true
      override def paintComponent(g: java.awt.Graphics2D) {
        g.drawImage(new ImageIcon("/home/lea/git/poca-group4/Version_0/src/MinionGo1.jpg").getImage(), 0, 0, null)
      }
    }

    /* Création de la grille pour positionner les boutons */
    val gridPanel = new GridPanel(1, 1) {
      contents += but1
      contents += but2
    }

    /* Insértion du la grille et de notre fond d'écran sur notre fenetre */
    contents = new BorderPanel {
      layout(gridPanel) = North
      layout(canvas) = Center
    }

    /* Dis quel composant produit un évènement lorsqu'on appuie dessus */
    listenTo(but1)
    listenTo(but2)

    /* Réaction aux évènements */
    reactions += {
      case ButtonClicked(component) if component == but1 => printf("On demande le mode 1 joueur\n")
      case ButtonClicked(component) if component == but2 => printf("On demande le mode multijoueur\n")
    }
  }
  frame.visible = true

}