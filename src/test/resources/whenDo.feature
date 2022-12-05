Feature: WhenDo
  @WhenDo
  Scenario: Create Task

    Given I have access to WhenDo app
    When I create a new task
      | title | FMendoza        |
      | note  | Nota            |
    Then the task "JBGroup" should be created