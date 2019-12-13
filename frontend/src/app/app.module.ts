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
    NotFoundPageComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes),
    BrowserAnimationsModule,
    ToastrModule.forRoot(),
    BsDatepickerModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
