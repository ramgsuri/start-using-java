# Generic Java Install checklist

*Basic steps:*

- Install Java and supporting tools
    - install Java JDK ( Preferred version is either 11 or 8 )
    - install Maven ( Preferred version should be  >= 3.6.0 ) 
    - check Java and Maven work by running a sample test
- Install IntelliJ
    - check IntelliJ works by running the sample test
        
This checklist contains instructions for Windows and Mac.

## Install Java Pre-requisites

*  Check what you need to install by typing console commands : 
    *  javac -version
          - if it fails then you need to install a Java JDK
    *  mvn -version
          - if it fails then you need to install maven
          

---

# For Mac Install Java checklist
## Use HomeBrew to install Java JDK and Maven

*  install homebrew from http://brew.sh/
*  Run this command : `brew update` 
*  Install jdk with : `brew cask install java`
*  Install maven with : `brew install maven`

---

* If everything is installed, check the environment variables by displaying them on the console
    * For Mac type : 
        * `echo $JAVA_HOME`
        * `echo $PATH`

---

* Download JUnit Test Project (this has a simple pom.xml and a basic test to run)
    *  Visit this url : https://github.com/ramgsuri/JavaForQa.git
    *  Download the zip file and unzip somewhere

*  run my first test from the command line
    *  use the command line to "cd" to the directory you unarchived the source code to
    * Run the following command : `mvn test`

If it runs successfully then you have Java and Maven Installed on Mac.

---     

## Install IntelliJ Community Edition on Mac 

You can install IntelliJ using Homebrew as well by typing:

*  `brew cask install intellij-idea-ce`

Or you can install it like a normal Mac application using the instructions below.

*  Install IntelliJ IDE Community Edition,
    * visit the web site https://www.jetbrains.com/idea/ 
    * download and install the Community Edition
    
* Open the 'start-using-java' project in IntelliJ and run the test from the IDE to ensure IntelliJ and JDK and Maven are all working together.    

---
     
Generic Links:
==============

+ Download Java SDK From
http://www.oracle.com/technetwork/java/javase/downloads/index.html
  - 13  https://www.oracle.com/java/technologies/javase-jdk13-downloads.html
  - 11  https://www.oracle.com/java/technologies/javase-jdk11-downloads.html
  - 1.8 https://www.oracle.com/java/technologies/javase-jdk8-downloads.html

+ Download production-ready distribution of the Open Java Development Kit (OpenJDK). 
https://aws.amazon.com/corretto/ Amazon Corretto is certified as compatible with the Java SE standard and is used internally at Amazon for many production services. 
    * https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html

+ Download Maven From
    * http://maven.apache.org/download.cgi

---

+ sample JUnit test project from
    * https://github.com/ramgsuri/start-using-java.git

+ Download IntelliJ from
    * http://www.jetbrains.com/idea/download/

+ Mac HomeBrew and Cask
    * http://brew.sh
    * https://caskroom.github.io/

---

+ How to install Java on Mac
    * http://stackoverflow.com/questions/24342886/how-to-install-java-8-on-mac
    
+ How do uninstall Java on Mac
    * https://www.java.com/en/download/help/mac_uninstall_java.xml
    * http://docs.oracle.com/javase/8/docs/technotes/guides/install/mac_jdk.html

---     