Feature: User Login

  Scenario Outline: User can log in with valid credentials
    Given user goes to the website
    When provides "<username>" and "<password>" then presses submit button
    Then user can explore the site
    Examples:
    | username | password |
    | Admin    | admin123 |
    | admin    | admin123 |

  Scenario Outline: User can log in with invalid credenti als
    Given user goes to the website
    When provides "<username>" and "<password>" then presses submit button
    Then user gets alert
    Examples:
      | username | password |
      | alexa | alexa123 |
      | _____ | 11111111 |