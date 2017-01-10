package Observation

trait Observable {
  def prevenirObs()
  def ajouterObs(o: Observateur)
  def supprimerObs()
}