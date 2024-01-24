 <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <title>Second JSP</title>
</head>
<body>
    


    <h2>Add</h2>
    <form action="addCustomer">
        Name: <input type="text" name="studentName"> <br><br>
        RollNo: <input type="text" name="rollNo"> <br>
        <input type="submit">
    </form>

    <h2>View</h2>

    <form action="viewCustomer">
        
        RollNo: <input type="text" name="rollNo"> <br>
        <input type="submit">
    </form>

    <h2>Delete</h2>

    <form action="deleteCustomer">
        
        RollNo: <input type="text" name="rollNo"> <br>
        <input type="submit">
    </form>

    <h2>Update</h2>

    <form action="updateCustomer">
        
        RollNo: <input type="text" name="rollNo"> <br>
        <input type="submit">
    </form>
</body>
</html>