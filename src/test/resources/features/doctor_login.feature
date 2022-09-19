@doctor_login
Feature: doctor_login_feature


  Background: User_goes_to_google
    Given user opens the URL "https://www.medunna.com/"


  Scenario Outline:TC_001_user_(doctor)_can_see_their_appointments_list_and_time_slots_on_My_Appointments

    When user navigate the sign in page
    And user enters username as "<username>" and password as "<password>" and click login
    And user clicks on My Pages
    And user clicks on My Appointments
    And appointments can be seen by user
    And time slots can be seen
    Then user signs out

    Examples: test_data
      |username                     |password|
      |BURHAN5                       |BURHAN5|

  Scenario Outline:TC_001_user(doctor)_can_see_patient_id_start_date,_end_date_status

    When user navigate the sign in page
    And user enters username as "<username>" and password as "<password>" and click login
    And user clicks on My Pages
    And user clicks on My Appointments
    And User checks if patient id can be seen
    And User checks if start date can be seen
    And User checks if end date can be seen
    And User checks if status can be seen
    Then user signs out

    Examples: test_data2
      |username                     |password|
      |BURHAN5                        |BURHAN5|