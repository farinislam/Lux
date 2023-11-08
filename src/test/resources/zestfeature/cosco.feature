Feature:This is the login functionality 

Scenario: Verify user can see all the links 
Given  Open Dell applications  
Then   Mouse hover services options  
Then   Click view all services 
  

Scenario: Verify user can login
Given Open Dell applications 
Then Click login
Then Enter username
Then Enter password
Then Verify user can login





