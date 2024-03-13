<p align="center">
    <img src="./gambar-petunjuk/spring-boot_logo.png" alt="spring-boot_logo" style="display: block; margin: 0 auto;">
</p>


# SPRING-BOOT BEGINNER WELCOME (api)


&#x1F682; Reference :

- spring-boot-3.1.9-java-17-beginner-first-create-maven-project

    `https://github.com/4bumuhammad/spring-boot-3.1.9-java-17-beginner-first-create-maven-project`



### &#x1F530; About :

    [Visual Studio Code]

        Version: 1.87.0 (Universal)
        Commit: 019f4d1419fbc8219a181fab7892ebccf7ee29a2
        Date: 2024-02-27T23:42:56.944Z
        Electron: 27.3.2
        ElectronBuildId: 26836302
        Chromium: 118.0.5993.159
        Node.js: 18.17.1
        V8: 11.8.172.18-electron.0
        OS: Darwin arm64 22.4.0


### &#x1F530; Begin project

- Create Project (summary) :
-  - VSC Open Command Palate ( up + command + shift + p)
-  - keyword "> spring", select `Spring Initializr: Create a Maven Project`
-  - Specify Spring Boot version : 3.1.9
-  - Specify project language : Java
-  - package name : com.domain
-  - Artifact ID : demo-api
-  - Specify package type : Jar
-  - Java Version : 17
-  - Choose dependencies : 
        - -> Spring Web
        - -> Spring Boot DevTools
        - -> Lombok ( function : reduces boilerplate code )


 ### &#x1F530; Stages and codes

    ❯ mkdir -p demo-api/src/main/java/com/domain/demoapi/controller

    ❯ cd demo-api

    # create a java file in Visual Studio Code at path `src/main/java/com/domain/demoapi/controller/WelcomeController.java`
   



 ### &#x1F530; Run project

    ❯ cd demo-api

    ❯ sdk use java 17.0.9-librca

        Using java version 17.0.9-librca in this shell.

    ❯ mvn spring-boot:run


<p align="center">
    <img src="./gambar-petunjuk/underconstruction.png" alt="underconstruction" style="display: block; margin: 0 auto;">
</p>

---

## &#x1FA90; explanation with screen image capture

<p align="center">
    <img src="./gambar-petunjuk/underconstruction.png" alt="underconstruction" style="display: block; margin: 0 auto;">
</p>

---


### notes :

- Enable clipboard on Vim - select all lines in the vim editor is to press the `ggVG` key, then if you want to copy all the context, also press the `"+y` key. And if you want to paste it into the vim editor, you can do the key `"+p`.

- install ccat on Mac OS 
    - - reference 
        
        `https://macappstore.org/ccat/`
        
        `https://github.com/owenthereal/ccat`

---

<p align="center">
    <img src="./gambar-petunjuk/Done-100.png" alt="done" style="display: block; margin: 0 auto;">
</p>