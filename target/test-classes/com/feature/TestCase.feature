Feature: nyka product booking application




Scenario: Product selection model

Given user launch the application
When  sign in button
And user needs to click the option of Sign in with Mobile/Email
And user needs to enter the Mobile number in the mobile number tab
And user needs to click the Proceed button
And user needs to enter the OTP received through mobile in the console windows
And  verify otp
And user move the curser to hair by using action method
And user click the shampoo by using action method
And user choose the shampoo brand
And add to bag

Scenario: cart
When user click the cart button
When user click the proceed button

Scenario: add address
When user click continue as guest
And user fill the house number
And user fill the road name
And fill the name
And mobile number
And email id
And pincode
And  click ship to the address

Scenario: payment
When user click cod
When click place order

