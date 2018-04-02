<!DOCTYPE html>
<html lang="en" style="background-color: #fafafa;">
<head>
    <meta charset="UTF-8">
    <title>Update Customer</title>
</head>
<body>
<h1>Please type the Customer's new data below</h1>

<form name="customer" action="/updateCustomer" method="post">
    <p>Id</p>
    <input title="Id" type="text" name="id" value="${customer.id}" disabled>
    <p>Name</p>
    <input title="Name" type="text" name="name" value="${customer.name}">
    <p>Address</p>
    <input title="Address" type="text" name="address" value="${customer.address}">
    <p>City</p>
    <input title="City" type="text" name="city" value="${customer.city}">
    <p>State</p>
    <input title="State" type="text" name="state" value="${customer.state}">
    <p>Zip</p>
    <input title="Zip" type="text" name="zip" value="${customer.zip}">
    <br>
    <br>
    <br>
    <input type="submit" value="Update">
</form>

</body>
</html>