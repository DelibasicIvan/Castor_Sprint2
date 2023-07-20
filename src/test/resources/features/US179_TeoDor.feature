@US179_TeoDor
Feature: As a user, I should access to the Oroinc Documentation page.

  Background:
    Given the user is on the login page

  Scenario Outline: user access the Oronic Documentation
    When the user logged in as "<userType>"
    And user click "<button>" icon
    Then user should be redirected to the "<expectedURL>" page

    Examples:
      | userType      | button       | expectedURL    |
      | driver        | questionMark | doc.oroinc.com |
      | store manager | questionMark | doc.oroinc.com |
      | sales manager | questionMark | doc.oroinc.com |

