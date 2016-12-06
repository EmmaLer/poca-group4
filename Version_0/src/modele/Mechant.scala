/* ce trait peut etre utilisé pour autre
 * chose qu'un minion par exemple on peut 
 * avoir un personnage qui herite de mechant
 */
package modele

trait Mechant {
  def nuireProprio : Unit = { println("Je vous déteste les gars !")}
}