<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Spring MVC</title>
    <!-- Link to external CSS file -->
    <!--link rel="stylesheet" href="styles.css"-->
</head>
<body>
    <h1>Hello, World!</h1>
    <p>This is a simple JSP Home page.</p>
     <br/>
     <hr/>
    <p>sum</p>
	<form action="add">
		Enter 1st value : <input type="number" name="num1" /><br/>
		Enter 2st value : <input type="number" name="num2" />
		<input type="submit" />
	</form>
	 <br/>
     <hr/>
	<p>product</p>
	<form action="product">
    	Enter 1st value : <input type="number" name="num1" /><br/>
    	Enter 2st value : <input type="number" name="num2" />
    	<input type="submit" />
    </form>
    <br/>
    <hr/>
    <p>Add Product</p>
    <form action="addProduct">
       	Id : <input type="number" name="id" /><br/>
       	Name : <input type="text" name="name" /><br/>
       	Description : <input type="text" name="description" /><br/>
       	Price : <input type="number" name="price" />
       	<input type="submit" />
    </form>
    <br/>
    <hr/>
    <p>Get Product</p>
    <form action="getProduct">
       	Id : <input type="number" name="id" />
       	<input type="submit" />
    </form>
    <br/>
    <hr/>
    <p>Update Product</p>
    <form action="updateProduct">
       	Id : <input type="number" name="id" /><br/>
       	Name : <input type="text" name="name" /><br/>
       	Description : <input type="text" name="description" /><br/>
       	Price : <input type="number" name="price" />
       	<input type="submit" />
    </form>
    <br/>
    <hr/>
    <p>Delete Product</p>
    <form action="deleteProduct">
       	Id : <input type="number" name="id" />
       	<input type="submit" />
    </form>
    <!-- Link to external JavaScript file -->
    <!--script src="script.js"></script-->
</body>
</html>