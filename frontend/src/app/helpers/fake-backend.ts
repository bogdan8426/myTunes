import { Injectable } from '@angular/core';
import * as data from './data.json';

@Injectable()
export class FakeBackendSimulator {

  constructor() {
    console.log('helooooooooooooooooooooooooooooooooooooooooooo');
    console.log(this.getNames());
  }
  getNames() {
    return (data as any).artist2.name;
  }
}

