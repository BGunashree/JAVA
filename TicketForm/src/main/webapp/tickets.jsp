<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>X-workz</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-5">
<h2>Ticket Form</h2>
<form action="ticket" method="post">
<pre>
Stadium Name<select  name="sname" value="${dto.stadiumName}" class="form-control">
<option>Select</option>
<option>Chinnaswamy</option>
<option>Rajiv Gandhi</option>
<option>Narendra modi</option>

</select>
Tickets<input type="number" name="tickets" value="${dto.tickets}"  class="form-control"/>
primary Contact<input type="number" name="phone" value="${dto.contact}"  class="form-control"/>
Email<input type="text" name="email" value="${dto.email}"  class="form-control"/>
<input type="submit" value="submit" class="btn btn-success"/>
</pre></form>

<span style="color:green">${success} 
<span style="color:red">${validationError}
</div>
</body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</html>