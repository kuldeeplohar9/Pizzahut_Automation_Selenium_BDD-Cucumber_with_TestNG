

#
#@BookingMMAGym
#Feature: I want to learn MMA with good trainer.
  #@LookinkgforMMAgymOnline
  #Scenario: Looking for MMA gym near my place
    #Given I want intereted in learning MMA
    #And i went online to fine MMA gym
    #And i shortlited 4 MMA gyms
    #When I equire about the one gym
    #And i decided  to visit them
    #But I dedcied to keep trainer
    #Then I bagained and recevied discount 20%
    
      
@Pizzahut
Feature: Validate Pizzahut pizza order flow.
  @ValidatePizzahutpizza
Scenario Outline: Validate Pizzahut pizza order flow
Given User launch Pizzahut application with url
When User wait for auto location black pop up screen
Then User close the pop up screen
And User Click on Search Button
Then User type Pizza
And User select the pizza
When User check Cheese Pizza on page
Then User click on add button
And User clicks on Pizza Base option
Then User Select add item button
And User Click on Cart button
Then User validate checkout button contains Item count
And User validate checkout button contains total price count
Then Check Delivery Fee
And Check Delivery Fee is less than 100 or not 
Then if Delivery Fee is less than 100 print ok otherwise nok
And validate total prices must be less than 500
Then Print the Order Sucessful
#And see Price tag got removed from the checkout button
#And User see 1 item showing in checkout button
#Then User Clicks on Checkout button
#And User see minimum order required pop up is getting displayed
#Examples:
 #|URL|Location|
 #|https://www.pizzahut.co.in/|lulu mall bangalore|  