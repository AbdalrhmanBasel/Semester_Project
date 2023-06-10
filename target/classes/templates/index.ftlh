<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
  <h1>Hello</h1>

  <table>
      <tr>
         <th>Alpha3:</th><th>Name:</th>
      </tr>
      <#list countries as country>
          <tr>
              <td>${country.alpha3}</td>
              <td>${country.name}</td>
              <td><a href="localhost:8100/product/new"></a> </td>
          </tr>
    </#list>
  </table>

</body>
</html>