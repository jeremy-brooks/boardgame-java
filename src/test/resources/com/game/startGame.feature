Feature: Starting a new game
  Scenario: Starting a new game should create a new board.
    Given a new game is started
    When the game status is checked
    Then there should be a 8 by 8 square board