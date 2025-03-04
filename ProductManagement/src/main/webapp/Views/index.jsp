<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Detail Page here</title>
</head>
<body>

	<div class="container text-center mt-3"
		style="color: red; background-color: pink">
		<h1>Product Detail Page Here</h1>

	</div>

	 <form action="product">
		<div class="form-group mt-3"
			style="margin-left: 500px; margin-right: 500px;">

			<h1 class="text-center">ProductId</h1>
			<input type="text" name="pid" placeholder="Enter pid here"
				class="form-control" />


		</div>

		<div class="container_1 mt-3 text-center">

			<button class="btn btn-success sm-block" style="width: 200px;">Search</button>

		</div>
	</form>
	
	
	<div class="container_3 mt-3" style="margin-left: 500px; margin-right: 500px;">
	<table class="table table-dark ">
  <thead>
    <tr>
      <th scope="col">ProductId</th>
      <th scope="col">ProductName</th>
       <th scope="col">ProductPrice</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      
      <td>${product.pid}</td>
       <td>${product.productName}</td>
        <td>${product.price}</td>
     
     
    </tr>
  
   
  </tbody>
</table>
	
	</div>
	


</body>
</html>