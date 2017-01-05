import java.io._

object Main {
  def main(args: Array[String]){
    /** Séralization **/
    /* Inscrit dans le fichier exemple.txt les données de Stock 
     * A mettre quand on fait une sauvegarde de fichier */
    val os = new FileOutputStream("example.txt")
    val o = new ObjectOutputStream(os)
    o writeObject Stock(31)
   
    /** Déséralization **/
    /* Lis ce qu'il y a dans le fichier example.txt 
     * A mettre quand on charge un fichier */
    val fis = new FileInputStream("example.txt")
    val oin = new ObjectInputStream(fis)
    val p = oin.readObject
    println(p);
  }
}