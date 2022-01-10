@Paralel1
Feature:  Module Test
  @clienTest
  Scenario: Faire le test des modules
    Given L'utilisateur accède à la page
    And L'utilisateur clique sur bouton connexion
    And L'utilisateur saisit ladresse email
    And L'utilisateur saisit  password
    And L'utilisateur appuie sur le bouton de connexion
    Then L'utilisateur clique les boutons entreprise,travail,immobilier,famille,Mon compte et verify button


