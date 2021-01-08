import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SharedModule } from './shared/shared.module';
import { AuthenticationComponent } from './core/authentication/authentication.component';
import { ReactiveFormsModule } from '@angular/forms';
import { VehicleModule } from './vehicle/vehicle.module';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
	declarations: [AppComponent, AuthenticationComponent],
	imports: [BrowserModule, AppRoutingModule, ReactiveFormsModule, HttpClientModule, SharedModule, VehicleModule],
	providers: [],
	bootstrap: [AppComponent],
})
export class AppModule {}
