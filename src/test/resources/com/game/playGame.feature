Feature: playing a game
  Scenario: a game is played on an 8 by 8 square board with 1 player
    Given the game has a board
    And the board is 8 columns by 8 rows
    When the player is placed on the board for the first time
    Then the they are on the bottom left square