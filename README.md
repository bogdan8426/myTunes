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

