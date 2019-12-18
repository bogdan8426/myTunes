import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { WelcomePageComponent } from './pages/welcome-page/welcome-page.component';
import { DashboardPageComponent } from './pages/dashboard-page/dashboard-page.component';
import { ArtistsPageComponent } from './pages/artists-page/artists-page.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {ToastrModule} from 'ngx-toastr';
import {BsDatepickerModule} from 'ngx-bootstrap';
import { NotFoundPageComponent } from './pages/not-found-page/not-found-page.component';
import { DashboardContentComponent } from './pages/dashboard-page/dashboard-content/dashboard-content.component';
import { NavbarComponent } from './pages/navbar/navbar.component';
import { WidgetComponent } from './pages/artists-page/widget/widget.component';
import {FetchService} from './services/fetch.service';
import {HttpClientModule} from '@angular/common/http';

const appRoutes: Routes = [
  {path: '', redirectTo: '/welcome', pathMatch: 'full'},
  {path: 'welcome', component: WelcomePageComponent},
  {path: 'dashboard', component: DashboardPageComponent},
  {path: 'artists', component: ArtistsPageComponent},
  {path: '**', component: NotFoundPageComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    WelcomePageComponent,
    DashboardPageComponent,
    ArtistsPageComponent,
    NotFoundPageComponent,
    DashboardContentComponent,
    NavbarComponent,
    WidgetComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes),
    BrowserAnimationsModule,
    ToastrModule.forRoot(),
    BsDatepickerModule.forRoot(),
    HttpClientModule
  ],
  providers: [FetchService],
  bootstrap: [AppComponent]
})
export class AppModule { }
