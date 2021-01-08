import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import * as Path from './shared/constants/path';
import { DashboardComponent } from './vehicle/dashboard/dashboard.component';
import { AuthenticationComponent } from './core/authentication/authentication.component';

const routes: Routes = [
	{
		path: Path.LOGIN_URL,
		component: AuthenticationComponent,
	},
	{
		path: Path.HOME_URL,
		component: DashboardComponent,
	},
	{
		path: '**',
		redirectTo: Path.HOME_URL,
	},
];

@NgModule({
	imports: [RouterModule.forRoot(routes)],
	exports: [RouterModule],
})
export class AppRoutingModule {}
