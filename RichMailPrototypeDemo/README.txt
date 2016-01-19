
1. To run directly since the pom.xml specified in JAR making what is going to be entry point
java -jar target/RichMailPrototypeDemo-1.0-SNAPSHOT.jar
Not Valid Recipent Address/Number
Please Enter information again

2. To run a specific main class from a JAR file ( use cp paramater as CLASSPATH addition) 
java -cp target/RichMailPrototypeDemo-1.0-SNAPSHOT.jar com.my.demo.sender.RichMail
Not Valid Recipent Address/Number
Please Enter information again




Their are two types of JAR file available in java

1. Runnable/Executable jar file which contains manifest file. to run Runnable jar you can use Java -jar fileName.jar or java -jar -classpath abc.jar fileName.jar

2. Simple jar file these does not contains manifest file so you simple run your main class by giving its path java -cp ./fileName.jar MainClass