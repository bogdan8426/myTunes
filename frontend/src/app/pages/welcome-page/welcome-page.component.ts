import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-welcome-page',
  templateUrl: './welcome-page.component.html',
  styleUrls: ['./welcome-page.component.css']
})
export class WelcomePageComponent implements OnInit {
  message: string;

  constructor() {
    this.message = 'Welcome to myTunes!';

    setTimeout(() => {
      this.redirect('dashboard');
    }, 3000);
  }

  redirect(to) {
    window.location = to;
  }

  ngOnInit() {
  }

}
