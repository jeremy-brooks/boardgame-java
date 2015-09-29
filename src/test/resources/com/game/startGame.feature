Feature: Starting a new game
  Scenario: Starting a new game should create a new board with 1 player that can move up
    Given that a new game board is created with 1 player
    And the player starts at square 0,0
    When the player moves up 1 square
    Then the players position is: x = 0, y = 1
  Scenario: Starting a new game should create a new board with 1 player that can move right
    Given that a new game board is created with 1 player
    And the player starts at square 0,0
    When the player moves right 1 square
    Then the players position is: x = 1, y = 0
