# myTunes
myTunes is a java based web application built as an open-source personal project.

## Technologies used
* Java 8
* Maven
* Spring Boot - Web
* Adobe XD

## Contents
Theory: [The MVC Design pattern](https://github.com/bogdan8426/myTunes#the-mvc-design-pattern)
1. [Design](https://github.com/bogdan8426/myTunes#1-design)
2. [Architecture](https://github.com/bogdan8426/myTunes#2-architecture)

## The MVC Design pattern
><b>Model–View–Controller</b> (usually known as MVC) is a software design pattern commonly used for developing user interfaces which divides the related program logic into three interconnected elements. This is done to separate internal representations of information from the ways information is presented to and accepted from the user. Following the MVC architectural pattern decouples these major components allowing for code reuse and parallel development.

![Image of MVC](https://i.imgur.com/90JjzgO.png)

## 1. Design

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

### Angular 6
#### ES6 and TypeScript
ECMAScript (ES) is a scripting language specification standardized by ECMAScript International. It is used by applications to enable client-side scripting. Languages like JavaScript, Jscript and ActionScript are governed by this specification.
JavaScript was developed by Brendan Eich, a developer at Netscape Communications Corporation, in 1995.JavaScript started life with the name Mocha, and was briefly named LiveScript before being officially renamed to JavaScript. It is a scripting language that is executed by the browser, i.e. on the client’s end. It is used in conjunction with HTML to develop responsive webpages.

By definition, “TypeScript is JavaScript for application-scale development.”
TypeScript is a strongly typed, object oriented, compiled language. It was designed by Anders Hejlsberg (designer of C#) at Microsoft. TypeScript is both a language and a set of tools. TypeScript is a typed superset of JavaScript compiled to JavaScript. In other words, TypeScript is JavaScript plus some additional features.

![Image of TypeScript vs JavaScript](https://www.tutorialspoint.com/typescript/images/typescript_figure.jpg)

#### Angular CLI
The Angular CLI is a command-line interface tool that you use to initialize, develop, scaffold, and maintain Angular applications. You can use the tool directly in a command shell, or indirectly through an interactive UI such as Angular Console.
#### Webpack
At its core, webpack is a static module bundler for modern JavaScript applications. When webpack processes your application, it internally builds a dependency graph which maps every module your project needs and generates one or more bundles.

### Spring
Spring is a framework for the Java platform comprising many modules. Among them are Spring Core, Spring Security and Spring Data.
* allows for more modular and loosely coupled code
* allows for easier testing
* when we need to replace a concrete implementation with another one, our application code should not need to change.
Spring Boot is a project which helps with faster development speed.
It favors convention over configuration: you specify which Spring dependencies to use in the project and Spring Boot gives reasonable configuration defaults for them.

