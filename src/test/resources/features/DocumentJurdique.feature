@Paralel2
Feature:  Module Test
  @DocumentJurdique
  Scenario: Faire un test Document Jurdique
    Given L'utilisateur accède à la page
    And L'utilisateur clique sur bouton connexion
    And L'utilisateur saisit ladresse email
    And L'utilisateur saisit  password
    And L'utilisateur appuie sur le bouton de connexion
    And clique button Legalife
    And Consultez la section ce que disent nos clients
    Then verify la page de que disent nos clients
    And fermer la page








