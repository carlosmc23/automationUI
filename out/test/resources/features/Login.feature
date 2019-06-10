Feature: Facebook login
  Scenario: As a user I must be able to access the application with the correct credentials
    When I access the "https://www.facebook.com/" page
    And I filled the email field with "juancitopinto236@gmail.com"
    And I filled the password field whit "123456.qwerty"
    And I click on the button Entrar