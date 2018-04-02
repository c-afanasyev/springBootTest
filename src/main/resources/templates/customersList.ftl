<!DOCTYPE html>
<html lang="en" style="background-color: #fafafa;">
<head>
    <meta charset="UTF-8">
    <title>Customers List</title>
</head>
<style>
    table {
        margin-bottom: 50px;
    }
    th {
        text-align: left;
        padding-right: 20px;
    }
    tr:nth-child(even) {
        background-color: #eeeeef;
    }
</style>
<body>
<h1>Customers List</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Address</th>
        <th>City</th>
        <th>State</th>
        <th>Zip</th>
    </tr>
<#list customers as customer>
    <tr>
        <td><a href="/customer/${customer.id}">${customer.id}</a></td>
        <td>${customer.name}</td>
        <td>${customer.address}</td>
        <td>${customer.city}</td>
        <td>${customer.state}</td>
        <td>${customer.zip}</td>
        <td style="background-color: #fafafa; padding-right:10px; padding-left:10px" ><a href="/delete/${customer.id}">Delete</a></td>
        <td style="background-color: #fafafa"><a href="/update/${customer.id}">Update</a></td>
    </tr>
</#list>
</table>

<form action="/addCustomer" style="margin-bottom: 50px">
    <input type="submit" value="Add new Customer" />
</form>
</body>
</html>