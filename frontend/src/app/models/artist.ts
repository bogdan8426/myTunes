import {Album} from './album';

export interface Artist {
  id?: number;
  name: string;
  genre: string;
  photo: string;
  albums: Album[];
}
