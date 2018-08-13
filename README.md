# com.LIGHTSIDEOnline1
Testing the room reservation application by using Cucumber BDD

main functionalities for smoke tests:
1. login with given file 
2. go to  hunt page
3. select available date and time 
4. select an available room
5. confirm the reservation 
6. check the rezervation on schedule page which show all reservations 



note: when trying to search for available room after entering date and time ,
the search button does not work for chrome browser ,
i tried many things to solve this problem , my final solution is changing browser to firefox. 
if you can find a better way , fix it .
  
    what did i try for solution ( these experiments did not work)
    - checked the version of chrome and match with bonigarcia browser
    - updated chrome and bonigarcia dependency 
    - checked by manual import driver from my local 
    - added many wait 
    - tried 4 different locator and 2 diff elemend to click search button 
    - recursive method to call until search button navigate to forward 
    - changed different date and time many times 
    
    what did i do as a solution 
    -change the browser to firefox it react different but still works fine on the hunt page 
    - i am still working on it , could not comlete yet. 
    
   
 
