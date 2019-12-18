// this file contains the API's needed to communicate with the backend micro-services

export const artistsApi = 'http://localhost:3001';
export const albumsApi = 'http://localhost:8210';

export const backendUrl = {
  artistsApi: {
    listArtists: `${artistsApi}/artists`
  },
  albumsApi: {
    listAlbums: `${albumsApi}/albums`,
    listSongs: `${albumsApi}/albums`
  }
};
