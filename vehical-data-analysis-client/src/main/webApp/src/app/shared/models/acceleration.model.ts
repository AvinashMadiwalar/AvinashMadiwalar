export interface AccelerationJSON {
	id: number;
	tripId: number;
	obdPid: string;
	data: number;
	timeStamp: string;
}

export class Acceleration {
	readonly id: number;
	tripId: number;
	obdPid: string;
	data: number;
	timeStamp: Date;

	private constructor(id: number) {
		this.id = id;
	}

	public static fromJSON(json: AccelerationJSON): Acceleration {
		const acceleration: Acceleration = new Acceleration(json.id);
		acceleration.tripId = json.tripId;
		acceleration.obdPid = json.obdPid;
		acceleration.data = json.data;
		acceleration.timeStamp = json.timeStamp
			? new Date(json.timeStamp.replace(/(\d{2})-(\d{2})-(\d{4})/, '$2/$1/$3'))
			: null;
		return acceleration;
	}
}
