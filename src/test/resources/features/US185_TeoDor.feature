@US185_TeoDor
Feature: As a user, I want to create a recurring(repetitive)  calendar event.

  Background:
    Given the user is on the login page
  @1
  Scenario Outline: user should see the number “1” by default in the Repeat Every input
    When the user logged in as "<userType>"
    Then user hover on "<buttonType>" button
    And user click "<buttonType>" button
    Then user click create "<buttonType>" button
    Then user see "<checkbox>" checkbox and click it
    Then user see "<buttonType>" button with value 1 by default

    Examples:
      | userType      | buttonType | buttonType      | buttonType            | checkbox | buttonType   |
      | driver        | Activities | Calendar Events | Create Calendar Event | Repeat   | Repeat Every |
      | sales manager | Activities | Calendar Events | Create Calendar Event | Repeat   | Repeat Every |
      | store manager | Activities | Calendar Events | Create Calendar Event | Repeat   | Repeat Every |

  @2
  Scenario Outline: user should see the number “1” by default in the Repeat Every input
    When the user logged in as "<userType>"
    Then user hover on "<buttonType>" button
    And user click "<buttonType>" button
    Then user click create "<buttonType>" button
    Then user see "<checkbox>" checkbox and click it
    Then user see "<buttonType>" button with value 1 by default
    When user delete number "<number>" in checkbox
    Then user see error message : "<errorMessage>"
    Examples:
      | userType      | buttonType | buttonType      | buttonType            | checkbox | buttonType   | number | errorMessage                   |
      | driver        | Activities | Calendar Events | Create Calendar Event | Repeat   | Repeat Every | 1      | This value should not be blank |
      | sales manager | Activities | Calendar Events | Create Calendar Event | Repeat   | Repeat Every | 1      | This value should not be blank |
      | store manager | Activities | Calendar Events | Create Calendar Event | Repeat   | Repeat Every | 1      | This value should not be blank |