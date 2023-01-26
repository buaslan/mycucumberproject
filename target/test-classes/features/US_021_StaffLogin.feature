@staff_login
Feature: Show appointments for patients by Staff

  Background: User_goes_to_google
    Given user opens the URL "https://www.medunna.com/"


  Scenario Outline:TC_001 Staff_can_only_update_appointments

    When user navigate the sign-in page
    And user enters username as "<username>" and password as "<password>" and click signIn
    And user clicks on MyPages
    And User clicks on Search Patient
    Then Patients can be seen by user
    And User clicks Patient SSN box
    And User enter patient SSN
    Then User clicks on Show Appointments
    And User clicks on Edit
    Then User verifies Create or Edit an Patient Appointments
    And User signs out

    Examples: test_data
      | username    | password    |
      | staffteam01 | staffteam01 |


  Scenario Outline: TC_002_Staff_can_make_the_status_UNAPPROVED_PENDING_or_CANCELLED_but_cannot_make_it_COMPLETED
    When user navigate the sign-in page
    And user enters username as "<username>" and password as "<password>" and click signIn
    And user clicks on MyPages
    And User clicks on Search Patient
    Then Patients can be seen by user
    And User clicks Patient SSN box
    And User enter patient SSN
    Then User clicks on Show Appointments
    And User clicks on Edit
    Then User verifies Create or Edit an Patient Appointments
    Then User select UNAPPROVED PENDING CANCELLED BUT CANNOT MAKE IT COMPLETED
    And User signs out


    Examples: test_data
      | username    | password    |
      | staffteam01 | staffteam01 |


  Scenario Outline: TC_003_Staff_does_not_need_to_provide_Anamnesis_Treatment_or_Diagnosis_as_required_fields
    When user navigate the sign-in page
    And user enters username as "<username>" and password as "<password>" and click signIn
    And user clicks on MyPages
    And User clicks on Search Patient
    Then Patients can be seen by user
    And User clicks Patient SSN box
    And User enter patient SSN
    Then User clicks on Show Appointments
    And User clicks on Edit
    Then User verifies Create or Edit an Patient Appointments
    Then User clicks on Anamnesis text area
    And User provide Anamnesis
    Then User clicks on Treatment text area
    And User provide Treatment
    Then User clicks on Diagnosis text area
    And User provide Diagnosis
    And User signs out

    Examples: test_data
      | username    | password    |
      | staffteam01 | staffteam01 |


  Scenario Outline: TC_004_They_can_select_the_current_doctor_that_needs_to_be_selected_for_the_patient
    When user navigate the sign-in page
    And user enters username as "<username>" and password as "<password>" and click signIn
    And user clicks on MyPages
    And User clicks on Search Patient
    Then Patients can be seen by user
    And User clicks Patient SSN box
    And User enter patient SSN
    Then User clicks on Show Appointments
    And User clicks on Edit
    Then User verifies Create or Edit an Patient Appointments
    Then User clicks on Physician List
    And User select current doctor
    And User signs out

    Examples: test_data
      | username    | password    |
      | staffteam01 | staffteam01 |


  Scenario Outline: TC_005_They can view the patients test results

    When user navigate the sign-in page
    And user enters username as "<username>" and password as "<password>" and click signIn
    And user clicks on MyPages
    And User clicks on Search Patient
    Then Patients can be seen by user
    And User clicks Patient SSN box
    And User enter patient SSN
    Then User clicks on Show Appointments
    Then User clicks on Show Tests
    And User verifies Tests
    And User can see Tests result

    Examples: test_data
      | username    | password    |
      | staffteam01 | staffteam01 |