<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Create new Product</title>
</head>
<body>

    <form action="http://localhost:8080/products/create" method="post">
        <input type="text" name="price">
        <select type="text" name="country">
            <#list countries as country>
                <option value="${country.id}">${country.name}</option>
            </#list>
        </select>
        <select type="text" name="currency">
            <#list currencies as currency>
                <option value="${currency.id}">${currency.name}</option>
            </#list>
        </select>
        <input type="submit"></input>
    </form>
</body>
</html>