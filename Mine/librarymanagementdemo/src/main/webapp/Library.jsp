<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Library</title>

    <%@ page import="java.util.Date" %>

    <style>
        /* Reset default margin and padding for all elements (optional) */
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

    body {
                font-family: Arial, sans-serif;
                line-height: 1.6;
                margin: 20px;
                
            }

            h1 {
                text-align: center;
            }

            /* Apply styles to the container */
            .container {
                position: relative;
                max-width: 800px;
                margin: 0 auto;
                padding: 20px;
                background-color: crimson;
                border-radius: 20px;
            }

            /* Apply styles to the form */
            form {
                position: relative;
                margin-top: 20px;
            }

            h2 {
                margin-top: 40px;
                
            }

            span{
                border-radius: 10px;
            }

            input {
                width: 100%;
                padding: 8px;
                margin-bottom: 10px;
            }

            input[type="submit"] {
                background-color: #4caf50;
                color: white;
                cursor: pointer;
            }


    </style>
    


</head>
<body>
    <h1>Welcome to Learner Library</h1>
    
    <div class="container">

        <h2 style="color: brown;">
            <span style="background-color: aqua;">Add Books</span>
            <!-- <span>User</span> -->
        </h2>
        <!-- <h2 style="color: brown; background-color: aqua;">Add User</h2> -->

    <form action="addBooks">
            AuthorName: <input type="text" name="authorName"> <br> <br>
            Id: <input type="text" name="id"> <br> <br>
            BookName: <input type="text" name="bookName"> <br> <br>
            Language: <input type="text" name="bookLanguage"> <br> <br>
            <input type="submit">
    </form>
  
    
    

    <h2 style="color: brown;">
        <span style="background-color: cadetblue">View Books</span>
        <!-- <span>User</span> -->
    </h2>
    <form action="viewBooks">
        Id: <input type="text" name="id"> <br> <br>
        <input type="submit">
    </form>

    <h2 style="color: brown;">
        <span style="background-color: yellowgreen;">Delete Books</span>
        <!-- <span>User</span> -->
    </h2>

    <form action="deleteBooks">
        
        Id: <input type="text" name="id"> <br>
               <input type="submit">

    </form>

    <strong>Current Time is</strong>:<%=new Date() %>

    </div>

    

</body>
</html>