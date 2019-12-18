import {Component, Input, OnInit} from '@angular/core';
import { Widget } from 'src/app/models/widget';
import {FetchService} from '../../services/fetch.service';
import {takeUntil} from 'rxjs/operators';
import {Subject} from 'rxjs';

@Component({
  selector: 'app-artists-page',
  templateUrl: './artists-page.component.html',
  styleUrls: ['./artists-page.component.css']
})
export class ArtistsPageComponent implements OnInit {
  widgets: Widget[] = [];
  private unsubscribe = new Subject();

  constructor(
    private fetchService: FetchService
  ) { }

  ngOnInit() {
    this.startPooling();
  }

  startPooling(): void {
    this.fetchService.getArtistsPolling()
      .pipe(takeUntil(this.unsubscribe))
      .subscribe((response) => {
        const keys = Object.keys(response);
        this.widgets = [];
        for ( let i = 0; i < keys.length; i++) {
          const entry = response[keys[i]];
          this.widgets = [...this.widgets, new Widget(entry.name, entry.genre, entry.photo)];
        }
      });
  }

}
