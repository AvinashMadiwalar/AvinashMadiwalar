import { Component, OnInit } from '@angular/core';
import { HOME_URL } from '../constants/path';

interface RouteInfo {
	path: string;
	title: string;
	icon: string;
	class: string;
}

export const ROUTES: RouteInfo[] = [
	{
		path: HOME_URL,
		title: 'Dashboard',
		icon: 'icon-chart-pie-36',
		class: '',
	},
];

@Component({
	selector: 'shared-sidebar',
	templateUrl: './sidebar.component.html',
	styleUrls: ['./sidebar.component.css'],
})
export class SidebarComponent implements OnInit {
	menuItems: any[];

	constructor() {}

	ngOnInit() {
		this.menuItems = ROUTES.filter((menuItem) => menuItem);
	}
}
