db.categories.insert([
    {
        "_id" : ObjectId("5c05464ff969acaeeef25986"),
        "name" : "Mobile Phone",
        "description" : "All smart mobile phones with a lot of brands.",
        "products" : [
            {
                "$ref" : "products",
                "$id" : ObjectId("5c054d892b18d70de06daf2f")
            }
        ]

    },
    {
        "name": "Refrigerator",
        "description": "Refrigerator with a lot of brands.",

    }

]);