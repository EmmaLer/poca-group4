package vue

import scala.swing._
import controleur.ControleurJeu
import scala.swing.BorderPanel.Position._
import Observation._
import modele.Joueur
import modele.ModeleJeu
import javax.swing.ImageIcon
import scala.swing.Reactions
import scala.swing.event.ButtonClicked
import java.io._
import java.awt.Color
import controleur.Coordonnees2D
import scala.collection.mutable.ListBuffer

// Définition de l'IG pour ModeleJeu et ControleurJeu
// J'ai décidé d'utiliser SWING pour l'IG -- Si autre avis, on peut changer ;)
class VueJeu(controleur: ControleurJeu) extends Observateur {

  var coord_Actuel: Coordonnees2D = new Coordonnees2D(0, 0)

  //Faire la fenetre pour lancer le jeu
  def miseAjour() { /*maj du dessin*/ }

  val frame = new MainFrame {
    title = "MINION GAME !"

    var list_Button = new ListBuffer[Button]()
    /* Création de Boutons */
    val button_1Joueur = new Button {
      text = "1 Joueur"
    }
    val button_Multi_Joueur = new Button {
      text = "multijoueurs"
    }

    val case_0_0 = new Button {
      text = "(0,0)"
      background = Color.BLACK
    }
    add_Case(list_Button, case_0_0)

    val case_0_1 = new Button {
      text = "(0,1)"
      background = Color.LIGHT_GRAY
    }
    add_Case(list_Button, case_0_1)

    val case_0_2 = new Button {
      text = "(0,2)"
      background = Color.LIGHT_GRAY
    }
    add_Case(list_Button, case_0_2)

    val case_0_3 = new Button {
      text = "(0,3)"
      background = Color.LIGHT_GRAY
    }
    add_Case(list_Button, case_0_3)

    val case_0_4 = new Button {
      text = "(0,4)"
      background = Color.LIGHT_GRAY
    }
    add_Case(list_Button, case_0_4)

    val case_1_0 = new Button {
      text = "(1,0)"
      background = Color.LIGHT_GRAY
    }
    add_Case(list_Button, case_1_0)

    val case_1_1 = new Button {
      text = "(1,1)"
      background = Color.LIGHT_GRAY
    }
    add_Case(list_Button, case_1_1)

    val case_1_2 = new Button {
      text = "(1,2)"
      background = Color.LIGHT_GRAY
    }
    add_Case(list_Button, case_1_2)

    val case_1_3 = new Button {
      text = "(1,3)"
      background = Color.LIGHT_GRAY
    }
    add_Case(list_Button, case_1_3)

    val case_1_4 = new Button {
      text = "(1,4)"
      background = Color.LIGHT_GRAY
    }
    add_Case(list_Button, case_1_4)

    val case_2_0 = new Button {
      text = "(2,0)"
      background = Color.LIGHT_GRAY
    }
    add_Case(list_Button, case_2_0)

    val case_2_1 = new Button {
      text = "(2,1)"
      background = Color.LIGHT_GRAY
    }
    add_Case(list_Button, case_2_1)

    val case_2_2 = new Button {
      text = "(2,2)"
      background = Color.LIGHT_GRAY
    }
    add_Case(list_Button, case_2_2)

    val case_2_3 = new Button {
      text = "(2,3)"
      background = Color.LIGHT_GRAY
    }
    add_Case(list_Button, case_2_3)

    val case_2_4 = new Button {
      text = "(2,4)"
      background = Color.LIGHT_GRAY
    }
    add_Case(list_Button, case_2_4)

    val case_3_0 = new Button {
      text = "(3,0)"
      background = Color.LIGHT_GRAY
    }
    add_Case(list_Button, case_3_0)

    val case_3_1 = new Button {
      text = "(3,1)"
      background = Color.LIGHT_GRAY
    }
    add_Case(list_Button, case_3_1)

    val case_3_2 = new Button {
      text = "(3,2)"
      background = Color.LIGHT_GRAY
    }
    add_Case(list_Button, case_3_2)

    val case_3_3 = new Button {
      text = "(3,3)"
      background = Color.LIGHT_GRAY
    }
    add_Case(list_Button, case_3_3)

    val case_3_4 = new Button {
      text = "(3,4)"
      background = Color.LIGHT_GRAY
    }
    add_Case(list_Button, case_3_4)

    val case_4_0 = new Button {
      text = "(4,0)"
      background = Color.LIGHT_GRAY
    }
    add_Case(list_Button, case_4_0)

    val case_4_1 = new Button {
      text = "(4,1)"
      background = Color.LIGHT_GRAY
    }
    add_Case(list_Button, case_4_1)

    val case_4_2 = new Button {
      text = "(4,2)"
      background = Color.LIGHT_GRAY
    }
    add_Case(list_Button, case_4_2)

    val case_4_3 = new Button {
      text = "(4,3)"
      background = Color.LIGHT_GRAY
    }
    add_Case(list_Button, case_4_3)

    val case_4_4 = new Button {
      text = "(4,4)"
      background = Color.LIGHT_GRAY
    }
    add_Case(list_Button, case_4_4)

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
    val gridPanel = new GridPanel(1, 2) {
      contents += button_1Joueur
      contents += button_Multi_Joueur
    }

    val gridPanelJeu = new GridPanel(5, 5) {
      contents += case_0_0
      contents += case_0_1
      contents += case_0_2
      contents += case_0_3
      contents += case_0_4
      contents += case_1_0
      contents += case_1_1
      contents += case_1_2
      contents += case_1_3
      contents += case_1_4
      contents += case_2_0
      contents += case_2_1
      contents += case_2_2
      contents += case_2_3
      contents += case_2_4
      contents += case_3_0
      contents += case_3_1
      contents += case_3_2
      contents += case_3_3
      contents += case_3_4
      contents += case_4_0
      contents += case_4_1
      contents += case_4_2
      contents += case_4_3
      contents += case_4_4
    }

    /* Insértion du la grille et de notre fond d'écran sur notre fenetre */
    contents = new BorderPanel {
      layout(gridPanel) = North
      layout(canvas) = Center
    }

    /* Dis quel composant produit un évènement lorsqu'on appuie dessus */
    listenTo(button_1Joueur)
    listenTo(button_Multi_Joueur)

    listenTo(case_0_0)
    listenTo(case_0_1)
    listenTo(case_0_2)
    listenTo(case_0_3)
    listenTo(case_0_4)
    listenTo(case_1_0)
    listenTo(case_1_1)
    listenTo(case_1_2)
    listenTo(case_1_3)
    listenTo(case_1_4)
    listenTo(case_2_0)
    listenTo(case_2_1)
    listenTo(case_2_2)
    listenTo(case_2_3)
    listenTo(case_2_4)
    listenTo(case_3_0)
    listenTo(case_3_1)
    listenTo(case_3_2)
    listenTo(case_3_3)
    listenTo(case_3_4)
    listenTo(case_4_0)
    listenTo(case_4_1)
    listenTo(case_4_2)
    listenTo(case_4_3)
    listenTo(case_4_4)

    /* Réaction aux évènements */
    reactions += {
      case ButtonClicked(component) if component == button_1Joueur =>
        /* Insértion du la grille et de notre fond d'écran sur notre fenetre */
        contents = new BorderPanel {
          layout(gridPanelJeu) = Center
        }
        printf("On demande le mode 1 joueur\n")

      case ButtonClicked(component) if component == case_0_0 =>
        coord_Actuel.x = 0
        coord_Actuel.y = 0
        deplacement(list_Button, case_0_0)
      case ButtonClicked(component) if component == case_0_1 =>
        coord_Actuel.x = 0
        coord_Actuel.y = 1
        deplacement(list_Button, case_0_1)
      case ButtonClicked(component) if component == case_0_2 =>
        coord_Actuel.x = 0
        coord_Actuel.y = 2
        deplacement(list_Button, case_0_2)
      case ButtonClicked(component) if component == case_0_3 =>
        coord_Actuel.x = 0
        coord_Actuel.y = 3
        deplacement(list_Button, case_0_3)
        case ButtonClicked(component) if component == case_0_4 =>
        coord_Actuel.x = 0
        coord_Actuel.y = 4
        deplacement(list_Button, case_0_4)
              case ButtonClicked(component) if component == case_1_0 =>
        coord_Actuel.x = 1
        coord_Actuel.y = 0
        deplacement(list_Button, case_1_0)
      case ButtonClicked(component) if component == case_1_1 =>
        coord_Actuel.x = 1
        coord_Actuel.y = 1
        deplacement(list_Button, case_1_1)
      case ButtonClicked(component) if component == case_1_2 =>
        coord_Actuel.x = 1
        coord_Actuel.y = 2
        deplacement(list_Button, case_1_2)
      case ButtonClicked(component) if component == case_1_3 =>
        coord_Actuel.x = 1
        coord_Actuel.y = 3
        deplacement(list_Button, case_1_3)
        case ButtonClicked(component) if component == case_1_4 =>
        coord_Actuel.x = 1
        coord_Actuel.y = 4
        deplacement(list_Button, case_1_4)
              case ButtonClicked(component) if component == case_2_0 =>
        coord_Actuel.x = 2
        coord_Actuel.y = 0
        deplacement(list_Button, case_2_0)
      case ButtonClicked(component) if component == case_2_1 =>
        coord_Actuel.x = 2
        coord_Actuel.y = 1
        deplacement(list_Button, case_2_1)
      case ButtonClicked(component) if component == case_2_2 =>
        coord_Actuel.x = 2
        coord_Actuel.y = 2
        deplacement(list_Button, case_2_2)
      case ButtonClicked(component) if component == case_2_3 =>
        coord_Actuel.x = 2
        coord_Actuel.y = 3
        deplacement(list_Button, case_2_3)
        case ButtonClicked(component) if component == case_2_4 =>
        coord_Actuel.x = 2
        coord_Actuel.y = 4
        deplacement(list_Button, case_2_4)
              case ButtonClicked(component) if component == case_3_0 =>
        coord_Actuel.x = 3
        coord_Actuel.y = 0
        deplacement(list_Button, case_3_0)
      case ButtonClicked(component) if component == case_3_1 =>
        coord_Actuel.x = 3
        coord_Actuel.y = 1
        deplacement(list_Button, case_3_1)
      case ButtonClicked(component) if component == case_3_2 =>
        coord_Actuel.x = 3
        coord_Actuel.y = 2
        deplacement(list_Button, case_3_2)
      case ButtonClicked(component) if component == case_3_3 =>
        coord_Actuel.x = 3
        coord_Actuel.y = 3
        deplacement(list_Button, case_3_3)
        case ButtonClicked(component) if component == case_3_4 =>
        coord_Actuel.x = 3
        coord_Actuel.y = 4
        deplacement(list_Button, case_3_4)
              case ButtonClicked(component) if component == case_4_0 =>
        coord_Actuel.x = 4
        coord_Actuel.y = 0
        deplacement(list_Button, case_4_0)
      case ButtonClicked(component) if component == case_4_1 =>
        coord_Actuel.x = 4
        coord_Actuel.y = 1
        deplacement(list_Button, case_4_1)
      case ButtonClicked(component) if component == case_4_2 =>
        coord_Actuel.x = 4
        coord_Actuel.y = 2
        deplacement(list_Button, case_4_2)
      case ButtonClicked(component) if component == case_4_3 =>
        coord_Actuel.x = 4
        coord_Actuel.y = 3
        deplacement(list_Button, case_4_3)
        case ButtonClicked(component) if component == case_4_4 =>
        coord_Actuel.x = 4
        coord_Actuel.y = 4
        deplacement(list_Button, case_4_4)

      case ButtonClicked(component) if component == button_Multi_Joueur => printf("On demande le mode multijoueur\n")
    }
  }
  frame.visible = true

  /** Ajout d'une case à la liste de bouton **/
  def add_Case(liste: ListBuffer[Button], but: Button): ListBuffer[Button] = {
    return liste += but
  }

  def deplacement(liste: ListBuffer[Button], but: Button) = {
    for (e <- liste)
      e.background = Color.LIGHT_GRAY

    but.background = Color.BLACK
    
  }

}