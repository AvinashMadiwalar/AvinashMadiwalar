import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
	selector: 'vehicle-authentication',
	templateUrl: './authentication.component.html',
	styleUrls: ['./authentication.component.css'],
})
export class AuthenticationComponent implements OnInit {
	authForm: FormGroup;
	title = 'Vehicle Data';
	private userName: string;

	constructor(private route: ActivatedRoute, private router: Router, private fb: FormBuilder) {
		this.authForm = this.fb.group({
			email: ['', Validators.required],
			password: ['', Validators.required],
		});
	}

	ngOnInit(): void {}

	submitForm() {
		const credentials = this.authForm.value;
		this.userName = credentials.email;
		sessionStorage.setItem('userName', this.userName);
	}
}
