# myTunes
myTunes web app is a personal open source project. It is a java based application used to purchase songs or albums from various artists.

## Technologies used
* Java 8
* Maven
* Spring Boot - Web
* Mongo DB
* Adobe XD

## The MVC Design pattern
><b>Model–View–Controller</b> (usually known as MVC) is a software design pattern commonly used for developing user interfaces which divides the related program logic into three interconnected elements. This is done to separate internal representations of information from the ways information is presented to and accepted from the user. Following the MVC architectural pattern decouples these major components allowing for code reuse and parallel development.

![Image of MVC](https://i.imgur.com/90JjzgO.png)

## 1. DESIGN
The basic application will have the following requirements:
* <b>Welcome Page</b> - accesing the website will lead to this web page. It centrally prints "Welcome to myTunes" with the myTunes logo, loads the page or waits for 2 seconds, and then redirects to the myTunes Dashboard
* <b>myTunes Dashboard</b> - a dynamic dashboard on the left and in the center a short description of the website, author, credits, year and so on.
* <b>Artists</b> - a section from the dashboard showing no_artists clickable blocks havinga photo and a name. Clicking will lead to the Albums section filtered only for that artist.
* <b>Albums</b> - a link from clicking an artist. Showing same principle as Artists. On click will dropdown to a list of songs

### User Interface Design
![Image of UI Design](https://raw.githubusercontent.com/WebToLearn/fx-trading-app/master/Week_03/Exercise/Img/Assets-VD.png)

### Web pages design using Adobe XD
![Image of WelcomePage](https://i.imgur.com/Y7UhtEK.png)
![Image of Dashboard](https://i.imgur.com/615HGUA.png)
![Image of ArtistsPage](https://i.imgur.com/qNPuxn4.png)

## 2. Architecture

### ES6 and TypeScript
>ECMAScript (ES) is a scripting language specification standardized by ECMAScript International. It is used by applications to enable client-side scripting. Languages like JavaScript, Jscript and ActionScript are governed by this specification.

>JavaScript was introduced as a language for the client side. The development of Node.js has marked JavaScript as an emerging server-side technology too. However, as JavaScript code grows, it tends to get messier, making it difficult to maintain and reuse the code. Moreover, its failure to embrace the features of Object Orientation, strong type checking and compile-time error checks prevents JavaScript from succeeding at the enterprise level as a full-fledged server-side technology. TypeScript was presented to bridge this gap.
>By definition, “TypeScript is JavaScript for application-scale development.” TypeScript is a strongly typed, object oriented, compiled language. It was designed by Anders Hejlsberg (designer of C#) at Microsoft. TypeScript is both a language and a set of tools. TypeScript is a typed superset of JavaScript compiled to JavaScript. In other words, TypeScript is JavaScript plus some additional features.

![Image of TypeScript vs JavaScript](https://www.tutorialspoint.com/typescript/images/typescript_figure.jpg)

### Angular 6
>Angular is a TypeScript-based open-source web application framework led by the Angular Team at Google and by a community of individuals and corporations. Angular is a complete rewrite from the same team that built AngularJS. 
>There are five major releases of Angular. The first version that was released is Angular 1, which is also called AngularJS. Angular 1 was followed by Angular 2, which came in with a lot of changes when compared to Angular 1.
>The structure of Angular is based on the components/services architecture. AngularJS was based on the model view controller. Angular 6 released in May 2018 proves to be a major breakthrough and is the latest release from the Angular team after Angular 5.
>Angular 6 is almost the same as Angular 5. It has a backward compatibility with Angular 5. Projects developed in Angular 5 will work without any issues with Angular 5.

### Angular CLI

>The Angular CLI is a command-line tool for managing the Angular development cycle. Use it to create the initial filesystem scaffolding for a workspace or project, and to run schematics that add and modify code for initial generic versions of various elements. The CLI supports all stages of the development cycle, including building, testing, bundling, and deployment.

### Webpack

>At its core, webpack is a static module bundler for modern JavaScript applications. When webpack processes your application, it internally builds a dependency graph which maps every module your project needs and generates one or more bundles.

### Spring

>Spring is a framework for the Java platform comprising many modules. Among them are Spring Core, Spring Security and Spring Data.
>* allows for more modular and loosely coupled code
>* allows for easier testing
>* when we need to replace a concrete implementation with another one, our application code should not need to change.

>Spring Boot is a project which helps with faster development speed. It favors convention over configuration: you specify which Spring dependencies to use in the project and Spring Boot gives reasonable configuration defaults for them.
