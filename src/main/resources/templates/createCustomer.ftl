<!DOCTYPE html>
<html lang="en" style="background-color: #fafafa;">
<head>
    <meta charset="UTF-8">
    <title>Add new Customer</title>
</head>
<body>
<h1>Please type the new Customer's data below</h1>

<form name="customer" action="/addCustomer" method="post">
    <p>Name</p>
    <input title="Name" type="text" name="name">
    <p>Address</p>
    <input title="Address" type="text" name="address">
    <p>City</p>
    <input title="City" type="text" name="city">
    <p>State</p>
    <input title="State" type="text" name="state">
    <p>Zip</p>
    <input title="Zip" type="text" name="zip">
    <br>
    <br>
    <input type="submit" value="Add">
</form>

</body>
</html>