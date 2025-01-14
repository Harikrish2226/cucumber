Feature: Flipkart mobile Test


  @tag1
  Scenario: Search mobile in the HomePage
    Given Browser launch and enter the url "https://www.flipkart.com/"
    When Go to the global search box and search "Iphone 16" and click
    And select the mobile
    And go to the product details page and click the add to cart button
    Then Mobile added in the Addtocart
   

 