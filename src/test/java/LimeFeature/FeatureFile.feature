Feature: Limeroad order
@Browser
Scenario: To search a product for women
Given Launch the browser 
When  Launch the Url
And Click the element to select shop women it navigate to women page

@Loginpage
Scenario: Login page launch
Given     Enter the profile page
When      Enter the login page
And       Enter the moblie number
And       Click the next

@Kurtas
Scenario: To select the kurtas
When     user  click the kurtas
And      user select the product for fill up your  cart
And      user shivangini shehawat  product in addtocard
Then     click the element for addtocard

#@T-shirtsproduct
#Scenario: To select the menpage
#Given click on the men tab
#When  click on the T-shirt product
#And user select the t shirts
#Then click the element for addtocard
#
#@Jeansproduct
#Scenario: To select the menpage
#Given click on the men tab
#When  click on the jeans product
#And user select the jeans
#Then click the element for addtocard
#
#
#




