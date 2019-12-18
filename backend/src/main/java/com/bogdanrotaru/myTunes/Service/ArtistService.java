package com.bogdanrotaru.myTunes.Service;

import com.bogdanrotaru.myTunes.Model.Artist;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArtistService {

    public List<Artist> getArtistList() {
        String[] artists = {"Drake",
                            "Rihanna",
                            "Taylor Swift",
                            "Eminem",
                            "Katy Perry",
                            "Justin Bieber",
                            "Chris Brown",
                            "Bruno Mars",
                            "Kanye West",
                            "Maroon 5",
                            "Ed Sheeran",
                            "Lady Gaga",
                            "Luke Bryan",
                            "The Weeknd",
                            "Post Malone",
                            "Flo Rida",
                            "Florida Georgia Line",
                            "Twenty One Pilots",
                            "Michael Jackson",
                            "Kendrick Lamar",
                            "Ariana Grande",
                            "Kesha",
                            "Jason Derulo",
                            "Wiz Khalifa",
                            "Lil Wayne","Garth Brooks",
                            "Elvis Presley",
                            "Eagles",
                            "Led Zeppelin",
                            "Billy Joel",
                            "Michael Jackson",
                            "Elton John",
                            "Pink Floyd",
                            "AC/DC",
                            "George Strait",
                            "Barbra Streisand",
                            "Aerosmith",
                            "The Rolling Stones",
                            "Bruce Springsteen",
                            "Mariah Carey",
                            "Madonna",
                            "Metallica",
                            "Whitney Houston",
                            "Van Halen",
                            "Fleetwood Mac",
                            "U2",
                            "Celine Dion",
                            "Neil Diamond",
                            "Journey",
                            "Kenny G",
                            "Shania Twain",
                            "Kenny Rogers",
                            "Alabama",
                            "Eminem",
                            "Bob Seger & the Silver Bullet Band",
                            "Guns N' Roses",
                            "Taylor Swift",
                            "Alan Jackson",
                            "Santana",
                            "Reba McEntire",
                            "Eric Clapton",
                            "Chicago",
                            "Simon & Garfunkel",
                            "Foreigner",
                            "Rod Stewart",
                            "Tim McGraw",
                            "Backstreet Boys",
                            "Tupac Shakur",
                            "Bob Dylan",
                            "Def Leppard",
                            "Queen",
                            "Bon Jovi",
                            "Dave Matthews Band",
                            "Britney Spears",
                            "Phil Collins",
                            "John Denver",
                            "The Doors",
                            "James Taylor",
                            "R. Kelly",
                            "Willie Nelson",
                            "Pearl Jam",
                            "Tom Petty and the Heartbreakers",
                            "Boston",
                            "Kenny Chesney",
                            "Dixie Chicks",
                            "Linda Ronstadt",
                            "Ozzy Osbourne",
                            "Lynyrd Skynyrd",
                            "Adele",
                            "Bee Gees",
                            "Michael Bolton",
                            "Creedence Clearwater Revival",
                            "Mannheim Steamroller",
                            "NSYNC",
                            "Brooks & Dunn",
                            "Jay Z",
                            "Linkin Park",
                            "Barry Manilow",
                            "John Mellencamp",
                            "Boyz II Men",
                            "Frank Sinatra",
                            "Enya",
                            "Janet Jackson",
                            "Faith Hill",
                            "Steve Miller Band",
                            "Luther Vandross",
                            "Creed",
                            "Hootie & the Blowfish",
                            "Toby Keith",
                            "Mötley Crüe",
                            "Nirvana",
                            "Red Hot Chili Peppers",
                            "Rush",
                            "ZZ Top",
                            "The Carpenters",
                            "Drake",
                            "REO Speedwagon",
                            "Vince Gill",
                            "Green Day",
                            "Nickelback",
                            "The Cars",
                            "Johnny Cash",
                            "Earth, Wind & Fire",
                            "Kid Rock",
                            "Sade",};

        List<Artist> artistList = new ArrayList<>();

        Artist artist;
        int id = 0;

        StringBuilder deezerApi;

        for(String searchRequest:artists){
            deezerApi = new StringBuilder();
            deezerApi.append("https://deezerdevs-deezer.p.rapidapi.com/search?q=")
                    .append(searchRequest.replaceAll(" ", "+"));
            HttpResponse<String> response = Unirest.get(deezerApi.toString())
                    .header("x-rapidapi-host", "deezerdevs-deezer.p.rapidapi.com")
                    .header("x-rapidapi-key", "69fe794d75msh643952b9e307f46p13bc88jsna8b8086f3493")
                    .asString();
            String body = response.getBody();

            artist = new Artist();
            artist.setId(id++);
            artist.setName(find("name",body));
            artist.setPhoto(find("picture_big",body));

            artistList.add(artist);

        }

        return artistList;
    }

    private String find(String string, String in){

        String[] pieces = in.split(",");
        for(String piece: pieces){
            String[] keyValue = piece.split("\":\"");
            String key = keyValue[0];
            if(key.equals("\"" + string)){
                String value = keyValue[1];
                StringBuilder builder = new StringBuilder();
                char[] chars = value.toCharArray();
                for(int i = 0; i<chars.length; i++){
                    char ch = chars[i];
                    if(ch != ('\"')){
                        builder.append(ch);
                    }
                }
                String found = builder.toString().replaceAll("\\\\","");
                return found;
            }
        }
        return "COULDN'T FIND "+ string;
    }
}
