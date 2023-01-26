@admin_login
Feature: Create / Update / delete test items Use api and DB validation

  Background: User_goes_to_google
    Given user opens the URL "https://www.medunna.com/"


  Scenario Outline:TC_001 Admin can create new test items

    When user navigates to medunna login page
    And user signs in as "<username>" and password as "<password>" and click signIn
    And user clicks on Item&Titles
    And user clicks on Test Item
    And user clicks on Create a new Test Item
    Then user verifies  create or edit a Test Item


    Examples: test_data0
      | username    | password    |
      |Batch86         |Batch86+|


  Scenario Outline:TC_002 Admin_can_create_new_test_items

    When user navigates to medunna login page
    And user signs in as "<username>" and password as "<password>" and click signIn
    And user clicks on Item&Titles
    And user clicks on Test Item
    Then user writes all information on page
    And user clicks on Save
    And user sees Test Item is created with identifier
    And user signs out
    And user closes the application

    Examples: test_data1
      | username    | password    |
      |Batch86         |Batch86+|


  Scenario Outline:TC_003 Admin can view test items

    When user navigates to medunna login page
    And user signs in as "<username>" and password as "<password>" and click signIn
    And user clicks on Item&Titles
    And user clicks on Test Item
    Then user clicks on View button
    Then user sees Test Item information
    And user signs out
    And user closes the application

    Examples: test_data2
      | username    | password    |
      |Batch86         |Batch86+|

  Scenario Outline:TC_004 Admin can delete test items

    When user navigates to medunna login page
    And user signs in as "<username>" and password as "<password>" and click signIn
    And user clicks on Item&Titles
    And user clicks on Test Item
    Then user clicks on Delete button
    Then user sees A Test Item is deleted with identifier

    Examples: test_data2
      | username    | password    |
      |Batch86         |Batch86+|

