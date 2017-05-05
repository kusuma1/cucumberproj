Feature: Test amazon website

  Scenario: Search for a book in amazon.com
  
    Given Open amazon.com
    When  I enter name of the book in search textbox and click submit
    Then Direct me to Book page

    
    
   
    Scenario: Add a book to cart
    
    Given I can see the book page
    When I click on the book image
    Then Direct me to the valid book page
    And I can see the Add to cart button
    When I click on the button
    Then Direct me to Confirmation page
    
    