<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Create new Product</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body>

<div class="flex min-h-full flex-col justify-center px-6 py-12 lg:px-8">
    <div class="sm:mx-auto sm:w-full sm:max-w-sm">
        <img class="mx-auto h-10 w-auto" src="https://tailwindui.com/img/logos/mark.svg?color=indigo&shade=600" alt="Your Company">
        <h2 class="mt-10 text-center text-2xl font-bold leading-9 tracking-tight text-gray-900">Create A New Product</h2>
    </div>

    <div class="mt-10 sm:mx-auto sm:w-full sm:max-w-sm">

        <form class="bg-stone-950 p-8 rounded-lg shadow-lg max-w-md" method="post" action="http://localhost:8100/products/create">
            <div class="mb-6">
                <label class="block text-gray-100 text-sm font-bold mb-2" for="price">Name:</label>
                <input type="text" id="name" name="name" class="w-full px-3 py-2 border border-gray-300 rounded focus:outline-none focus:ring-blue-500 focus:border-blue-500">
            </div>
            <div class="mb-6">
                <label class="block text-gray-100 text-sm font-bold mb-2" for="price">Price:</label>
                <input type="number" id="price" name="price" class="w-full px-3 py-2 border border-gray-300 rounded focus:outline-none focus:ring-blue-500 focus:border-blue-500">
            </div>
            <div class="mb-6">
                <label class="block text-gray-100 text-sm font-bold mb-2" for="country">Country:</label>
                <select id="country" name="country" class="w-full px-3 py-2 border border-gray-300 rounded focus:outline-none focus:ring-blue-500 focus:border-blue-500">
                    <#list countries as country>
                        <option value="${country.id}">${country.name}</option>
                    </#list>
                </select>
            </div>
            <div class="mb-6">
                <label class="block text-gray-100 text-sm font-bold mb-2" for="currency">Currency:</label>
                <select id="currency" name="currency" class="w-full px-3 py-2 border border-gray-300 rounded focus:outline-none focus:ring-blue-500 focus:border-blue-500">
                    <#list currencies as currency>
                        <option value="${currency.id}">${currency.name}</option>
                    </#list>
                </select>
            </div>
            <button type="submit" class="bg-blue-500 hover:bg-blue-600 text-white font-bold py-2 px-4 rounded focus:outline-none focus:ring-2 focus:ring-blue-500 focus:ring-offset-2">Submit</button>
        </form>
    </div>
</div>


</body>
</html>