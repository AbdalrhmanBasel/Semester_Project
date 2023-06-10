<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Products</title>

    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body>
    <h1 class="text-center mt-[20px] text-2xl font-bold">Products</h1>
    <div class="max-w-lg m-auto mt-[20px] flex gap-3 flex-wrap">
        <#list products as product>
            <div class="block max-w-sm p-6 bg-white border border-gray-200 rounded-lg shadow hover:bg-gray-100 dark:bg-gray-800 dark:border-gray-700 dark:hover:bg-gray-700">
                <h5 class="mb-2 text-2xl font-bold tracking-tight text-gray-900 dark:text-white">${product.name}</h5>
                <p class="font-normal text-gray-700 dark:text-gray-400">price: ${product.price}</p>
                <p class="font-normal text-gray-700 dark:text-gray-400">${product.country.name}</p>
                <p class="font-normal text-gray-700 dark:text-gray-400">${product.currency.name}</p>
            </div>
        </#list>
    </div>

    <div class="flex justify-center mt-[20px]">
        <a class="hover:cursor-pointer text-white p-2 text-sm bg-blue-600 rounded-lg" href="http://localhost:8100/products/new">create new product</a>
    </div>
</body>
</html>