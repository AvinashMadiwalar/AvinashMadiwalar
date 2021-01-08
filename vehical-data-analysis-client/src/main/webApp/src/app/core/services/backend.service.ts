import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../../../environments/environment';

enum HTTPMethod {
	GET = 'GET',
	POST = 'POST',
	PUT = 'PUT',
}

@Injectable({
	providedIn: 'root',
})
export class BackendService {
	private baseUrl: string = environment.baseUrl;

	constructor(private httpClient: HttpClient) {}

	public get<T>(url: string, params?: any): Observable<T> {
		return this.invoke(HTTPMethod.GET, url, null, params);
	}

	public put<T>(url: string, data: any, params?: any): Observable<T> {
		return this.invoke(HTTPMethod.PUT, url, data, params);
	}

	public post(url: string, data: any, params?: any): Observable<any> {
		return this.invoke(HTTPMethod.POST, url, data, params);
	}

	private invoke(method: string, url: string, data: any = {}, params?: any): Observable<any> {
		const options = {
			body: data,
			params,
		};
		const requestUrl = this.baseUrl + url;
		return this.httpClient.request(method, requestUrl, options);
	}
}
