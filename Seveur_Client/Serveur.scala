package serveur

import java.net._
import java.io._

class Serveur{
  
  try{
    
    /* Initialisation du port utilisé */
    val socket_server : ServerSocket = new ServerSocket(2009)
    println("Attente d'un Client ...")
    
    /* Attente d'une connexion */
    val socket_du_server : Socket = socket_server.accept
    
//    val in = new BufferedReader(new InputStreamReader(socket_du_server.getInputStream)).readLine
    val out : PrintWriter = new PrintWriter(socket_du_server.getOutputStream)
    
    out.print("Envoie d'un message depuis Serveur vers Client\n")
    
    out.flush

//    if(in.equals("Déconnecté")) 
    
    /* Fermeture du port */
    socket_server.close;
    /* Fermeture de la socket */
    socket_du_server.close;
 
    println("Fermeture du Serveur")
    
  }
  
  catch{
    case e: Exception => println(e.getStackTrace);
    println("Problème du Serveur !!!");
    System.exit(1);
  }
}