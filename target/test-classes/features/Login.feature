@paralel1
Feature:  Login Test

  Background:
    Given L'utilisateur accède à la page
    And L'utilisateur clique sur bouton connexion
    And L'utilisateur saisit ladresse email

  @PozitifTest

  Scenario: Faire un test de connexion

    And L'utilisateur saisit  password
    Then L'utilisateur appuie sur le bouton de connexion
    And L'utilisateur verify Vous êtes connecté. Cette page va se rafraichir.

  @NegatifTest
  Scenario: Faire un NegatifTest

    And L'utilisateur saisit  invalidPassword
    Then L'utilisateur appuie sur le bouton de connexion
    And L'utilisateur verify Mot de passe incorrect.