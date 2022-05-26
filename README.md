# Project Receptorius
## Setup
### Sites used for testing
[receptorius](https://receptorius.lt/)
### Packages used
- TestNG `org.testng:testng`
- Selenium `org.seleniumhq.selenium:selenium-java`
- WebDriverManager `io.github.bonigarcia:webdrivermanager`
## Test steps
### **Class AddToCart**
#### Test 1 (addAmountThatIsMoreThanThereIsInStorage)
*Try to add an amount of items in storage that is greater than the available amount*
1. Open page of one of the items in the Store
2. Click on button "25kg"
3. Input a previously declared number(10) into quantity input
4. Click "Add to cart" button
5. After a warning message appears, check if warning message contains text "Pageidaujamo kiekio"
#### Test 2 (addItemsToCart)
*Try to add available amount of items into cart*
1. Open page of one of the items in the Store
2. Click on button "1kg"
3. Click add amount button one time
4. Click "Add to cart" button
5. Cart item window appears, check if window contains text "Prekė sėkmingai pridėta"
6. Click "Continue shopping" button
7. Check if cart icon shows that 2 items are in the cart
### Class Login
#### Test 1 (tryToLogInWithNonExistingAccountInfo)
*Try to log in with non-existing account information*
1. Open log in page
2. Input email(vardenis@email.com) and password(password)
3. Click "Login" button
4. Alert message appears, check if alert message is "Identifikavimas nepavyko"
#### Test 2 (tryToLogInWithExistingAccountInfo)
*Try to log in with existing account information*
1. Open log in page
2. Input email(vismante.lisauskaite@gmail.com) and password(vcsprojektas)
3. Click "Login" button
4. Check if account name(Vismante Lisauskaite) appeared on top
### Class SpiceSearch
#### Test 1 (searchForSpicesWithSearchBar)
*Try to search for spices with search bar*
1. Open main page
2. Add spice name(Deggi Mirch) to search bar
3. Click "Search" button
4. Check if spice element(Deggi Mirch) is present
#### Test 2 (searchForSpicesWithFilters)
*Try to search for a spice with filters*
1. Drag mouse to section(Produktai)
2. Click on section(Grynieji prieskoniai) that appeared
3. Check if spice element(random) is present on the page
4. Click button "Čili pipirai" from dropdown menu 
5. Click on checkbox "Aštrus"
6. Check if spice element(Deggi Mirch) is present and spice element(random) is not 