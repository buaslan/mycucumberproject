@US10_DB_TEST

Feature: db_appointmentsList

  Scenario: Validate appointments with DB
    Given User connects to database
    Then User gets appointment "status"
    And User verifies status as "PENDING"
    Then User closes the database connection