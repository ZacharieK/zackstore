Getting Started
----------------

1. Download and install Apache Maven 3.6.3 by following these steps https://www.mkyong.com/maven/how-to-install-maven-in-windows/
2. Clone project on github https://github.com/ZacharieK/zackstore
3. Import the project in your workspace in eclipse and run it

Links to test
------------
- List a catalog of products : http://localhost:8080/products 
- Details of a given product : http://localhost:8080/products/3
- Add a product to a shopping cart : http://localhost:8080/products   ( POST : Use Postman because you have to add product in body) 

      ({
        "id": 2,
        "name": "Goat",
        "section": "MEAT",
        "provenance": "USA"
    }))
    
 - Remove a product from the cart: http://localhost:8080/products/3 (DELETE : use Postman because it's a GET request)
 
 -List the content card : http://localhost:8080/products/cart
 
 
 I added a video to show how it works.
 


