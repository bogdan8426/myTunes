import { Component, OnInit } from '@angular/core';
import {FakeBackendSimulator} from '../../helpers/fake-backend';

@Component({
  selector: 'app-dashboard-page',
  templateUrl: './dashboard-page.component.html',
  styleUrls: ['./dashboard-page.component.css']
})
export class DashboardPageComponent implements OnInit {

  constructor() { }

  ngOnInit() {
    // tslint:disable-next-line:no-unused-expression
    new FakeBackendSimulator();
  }

}
