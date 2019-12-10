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

Angular 6
About
*is a comprehensive JavaScript framework, used by developers to build web applications
*is built entirely in TypeScript which contains the ES6 JavaScript features, has tooling and supports type safety
*TypeScript must be 'transpiled' into JavaScript using the tsc compiler
*enable to write SPA (Single Page Applications) with ease
*comes with features like data-binding, change-detection, forms, router&navigation and http implementation

ES6 and TyypeScript

    ES6 is the 6th version of the ECMA Script Programming Language, released in 2011
    adds many features intended to make large-scale software developement easier, including:
        use of const and let instead of var
        block-scoped variables and functions
        arrow functions
        default function parameters
        class definition syntax
    TypeScript was created to statically identify constructs that are likely to be errors -> allow to make safe assumptions about state during execution

Angular CLI

    is used by the new generation of angular projects
    every time we start a new project, there is a bunch of files to be created -> Angular CLI can resolve that issue by generating all that files for us
    when it is done, we have a basic Angular project, runnable and containing all we need to continue
    after starting the application, a new port is opened, where a live server continues to run using Webpack's dev server

Webpack

    is a popular module bundler
    bundles application source code in convenient chunks
    loads that code from a server to browser
    takes in various assets (such as JavaScript, CSS and HTML) and then transforms these assets into a format that's convenient to consume through a browser
    based on a configure-driven approach and takes all assets in the project as dependencies -> treats the complete project as a dependency graph
    we can separate the source code into multiple files and import those files into the application to use the functionality contained in them
    module bundlers were built to bring this capability in a couple forms:
        by asynchronously loading modules and running them when they have finished loading
        by combining all of the necessary files into a single JavaScript file that would be loaded via a script tag in the HTML.

Spring
Spring Framework

Spring is a framework for the Java platform comprising many modules. Among them are Spring Core, Spring Security and Spring Data.

    Central to the framework is Spring Core which comes with the IoC container.
    IoC stands for Inversion of Control and is a software design principle. A related design pattern is Dependency Injection.
    With the help of the IoC container, applications using Spring can be decoupled from object dependencies(beans) instantiation.
    Application code will declare and use beans and Spring Core will take care of their instantiation - with the help of xml or java(annotations or code) configuration.
    uses Aspect Oriented Programming
    provides bean life cycle and scopes

Example of benefits:

    allows for more modular and loosely coupled code
    allows for easier testing
    when we need to replace a concrete implementation with another one, our application code should not need to change.

Spring Boot

Spring Boot is a project which helps with faster development speed.
It favors convention over configuration: you specify which Spring dependencies to use in the project and Spring Boot gives reasonable configuration defaults for them.
