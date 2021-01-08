import { Injectable } from '@angular/core';
import { BackendService } from '../../core/services/backend.service';
import { Observable } from 'rxjs';
import { Acceleration, AccelerationJSON } from '../../shared/models/acceleration.model';
import { map } from 'rxjs/operators';

@Injectable({
	providedIn: 'root',
})
export class SpeedAnalysisService {
	constructor(private backendService: BackendService) {}

	public getAccelerationInformation(pid: string): Observable<Acceleration[]> {
		const requestUrl: string = '/getParameters?pid=' + pid;
		return this.backendService
			.get(requestUrl)
			.pipe(
				map((accelerations: AccelerationJSON[]) =>
					accelerations.map((acceleration: AccelerationJSON) => Acceleration.fromJSON(acceleration))
				)
			);
	}
}
