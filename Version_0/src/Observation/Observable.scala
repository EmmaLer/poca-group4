package Observation

trait Observable {
  def prevenirObs(o: Observateur)
  def ajouterObs()
  def supprimerObs()
}