import { Component, OnInit, Input} from '@angular/core';
import {Widget} from '../../../models/widget';

@Component({
  selector: 'app-widget',
  templateUrl: './widget.component.html',
  styleUrls: ['./widget.component.css']
})
export class WidgetComponent implements OnInit {

  constructor(
  ) { }

  @Input() widget: Widget;

  ngOnInit() {
  }
}
