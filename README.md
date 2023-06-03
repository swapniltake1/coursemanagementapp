# coursemanagementapp - YHills Task 2
Task 2 : Create a Spring Boot project name course management app and perform CRUD Operations using any testing tool like postman.
# Description of Controller 
This `CourseController` class is a part of a Spring Boot application for managing courses. Here's a brief description of each method:

1. `home()` - This method is mapped to the URL "/welcome" and returns a simple welcome message for the Course Management Application.

2. `getCourses()` - This method is mapped to the URL "/courses/all" and retrieves a list of all courses from the `CourseService`.

3. `getCourseFromID(int courseID)` - This method is mapped to the URL "/courses/{courseID}" and retrieves a specific course based on the given `courseID` parameter from the `CourseService`.

4. `addCourse(Course course)` - This method is mapped to the URL "/courses/add" and adds a new course to the system by accepting a `Course` object in the request body.

5. `updateCourse(Course course)` - This method is mapped to the URL "/courses/update" and updates an existing course by accepting a modified `Course` object in the request body.

6. `deleteCourse(int courseID)` - This method is mapped to the URL "/courses/delete/{courseID}" and deletes a course with the specified `courseID` from the system. It returns an HTTP response indicating the status of the operation.

7. `deleteCourseById(String ID)` - This method is mapped to the URL "/courses/deletecourse/{ID}" (demo mapping) and returns a string message indicating the successful deletion of a course with ID 11. (Note: This method is not related to the main functionality and may be used for testing or demonstration purposes.)

These methods handle various CRUD (Create, Read, Update, Delete) operations for managing courses in the application.

# Screenshots 

# Get Mapping
url : http://localhost:8080/welcome
![image](https://github.com/swapniltake1/coursemanagementapp/assets/61576958/3785c908-f82c-4248-b630-0362f34e9261)


url : http://localhost:8080/courses/all
![image](https://github.com/swapniltake1/coursemanagementapp/assets/61576958/8f9ad0a6-97bc-49e0-8a6d-f732ea58adf0)


# POST Mappings
url : http://localhost:8080/courses/add
![image](https://github.com/swapniltake1/coursemanagementapp/assets/61576958/ad2e4649-4bd4-49d7-9e4f-40cacf880b19)

# PUT Mapping
url : http://localhost:8080/courses/update
![image](https://github.com/swapniltake1/coursemanagementapp/assets/61576958/48a3d628-3fe5-4620-8780-a6885c5aca32)

# DELETE Mapping
url : http://localhost:8080/courses/deletecourse/{ID}?ID="11"
![image](https://github.com/swapniltake1/coursemanagementapp/assets/61576958/2fed9bd7-8978-4c68-b06c-70784de60414)



