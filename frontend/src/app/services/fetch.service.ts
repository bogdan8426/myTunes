import { Injectable } from '@angular/core';
import {Artist} from '../models/artist';
import {interval, Observable} from 'rxjs';
import {startWith, switchMap} from 'rxjs/operators';
import {HttpClient} from '@angular/common/http';

import { backendUrl } from '../constants';

@Injectable()
export class FetchService {

  constructor(
    private http: HttpClient
  ) {}

  getArtists() {
    console.log(this.http.get(backendUrl.artistsApi.listArtists))
    return this.http.get(backendUrl.artistsApi.listArtists) as Observable<Artist[]>;
  }

  getArtistsPolling() {
    return interval(600000)
      .pipe(
        startWith(0),
        switchMap(() => this.http.get(backendUrl.artistsApi.listArtists))
      ) as Observable<Artist[]>;
  }
}
