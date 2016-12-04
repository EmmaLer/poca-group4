package client

import java.net._
import java.io._

class Client {  
  try{
    /* Connexion au port du Serveur */
    val socket : Socket = new Socket(InetAddress.getLocalHost(), 2009)
  
    var in : BufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream))
//    val out : PrintWriter

    val msg : String = in.readLine()
    println("Message Client: " + msg)
  
    /* Fermeture */
    socket.close
    println("Fermeture du Client")
    
  }catch{
     case e: Exception => println(e.getStackTrace);
    println("Problème du Client !!!");
    System.exit(1);
  } 
}