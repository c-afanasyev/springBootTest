<!DOCTYPE html>
<html lang="en" style="background-color: #fafafa;">
<head>
    <meta charset="UTF-8">
    <title>Customer's Data</title>
</head>
<style>
    tr:nth-child(even) {
        background-color: #eeeeef;
    }
</style>
<body>
<h1>Customer - ${customer.name}</h1>
<table>
    <tr>
        <td>Id</td>
        <td>${customer.id}</td>
    </tr>
    <tr>
        <td>Name</td>
        <td>${customer.name}</td>
    </tr>
    <tr>
        <td>Address</td>
        <td>${customer.address}</td>
    </tr>
    <tr>
        <td>City</td>
        <td>${customer.city}</td>
    </tr>
    <tr>
        <td>State</td>
        <td>${customer.state}</td>
    </tr>
    <tr>
        <td>Zip</td>
        <td>${customer.zip}</td>
    </tr>
</table>

<br>
<br>

<form action="/customers" style="padding-bottom: 50px">
    <input type="submit" value="Back to Customers List" />
</form>
</body>
</html>