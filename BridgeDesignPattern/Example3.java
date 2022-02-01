Software example for bridge pattern
Almost in every application we need to store data. Let's assume we need to store in 2 different storage mechanisms file and database. 
Also, before we store, we have to process the object [validation, set some data etc.]. Normally we go with separate classes to do these processes as shown below:

SaveStudentInFile {
checkAccess;

validateObject;

setAuditFields;

openFileToWrite;

writeDataInFile;

closeFile;

return studentId;

}	

SaveStudentInDB {
checkAccess;

validateObject;

setAuditFields;

openDbConnection;

storeDataInDb;

closeConnection;

return studentId;

}
We have code for storing Student object into file and database. This is a common scenario. Now let's assume, that we need to add code to do the same thing for course object also. 
Then we will need two more classes like SaveCourseInFile and SaveCourseInDB.

Also if we need to add new storage system like other database or network call, then we will have to create new class for each type. 
Like for our example Student class and Course class. This will keep increasing for each new class and storage type.

Bridge design pattern simplifies the above scenario by helping us write reusable code.
