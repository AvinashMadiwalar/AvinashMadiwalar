import { Component, Inject, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { SpeedAnalysisService } from './speed-analysis.service';
import { Acceleration } from '../../shared/models/acceleration.model';
import { DOCUMENT } from '@angular/common';
import { chartLabels, gradientChartOptionsConfigWithTooltipRed } from './speed-constants';
import Chart from 'chart.js';

@Component({
	selector: 'vehicle-speed-analysis',
	templateUrl: './speed-analysis.component.html',
	styleUrls: ['./speed-analysis.component.css'],
})
export class SpeedAnalysisComponent implements OnInit {
	canvas: any;
	datasets = [[10, 60, 70, 50, 40, 90]];
	ctx: any;
	config: any;
	myChartData: Chart;
	private subscriptions: Subscription = new Subscription();
	private dataPoints: number = 20;

	constructor(private speedAnalysisService: SpeedAnalysisService, @Inject(DOCUMENT) private document: Document) {}

	ngOnInit(): void {
		this.subscriptions.add(
			this.speedAnalysisService
				.getAccelerationInformation('0B')
				.subscribe((speedList: Acceleration[]) => this.initialize(speedList))
		);
	}

	private initialize(speedList: Acceleration[]): void {
		const speedInfo: number[] = [];
		speedList.forEach((speed: Acceleration) => {
			speedInfo.push(speed.data);
		});
		this.datasets.push(speedInfo);
		this.canvas = document.getElementById('chartBig1');
		this.ctx = this.canvas.getContext('2d');
		const gradientStroke = this.ctx.createLinearGradient(0, 230, 0, 50);
		gradientStroke.addColorStop(1, 'rgba(233,32,16,0.2)');
		gradientStroke.addColorStop(0.4, 'rgba(233,32,16,0.0)');
		gradientStroke.addColorStop(0, 'rgba(233,32,16,0)');
		this.myChartData = new Chart(this.ctx, this.getConfig(gradientStroke));
	}

	private getConfig(gradientStroke): Object {
		return {
			type: 'line',
			data: {
				labels: chartLabels,
				datasets: [
					{
						label: 'Speed',
						fill: true,
						backgroundColor: gradientStroke,
						borderColor: '#ec250d',
						borderWidth: 2,
						borderDash: [],
						borderDashOffset: 0.0,
						pointBackgroundColor: '#ec250d',
						pointBorderColor: 'rgba(255,255,255,0)',
						pointHoverBackgroundColor: '#ec250d',
						pointBorderWidth: 20,
						pointHoverRadius: 4,
						pointHoverBorderWidth: 15,
						pointRadius: 4,
						data: this.datasets[0],
					},
				],
			},
			options: gradientChartOptionsConfigWithTooltipRed,
		};
	}

	private updateChart(speedList: Acceleration[]): void {
		const initialTime = speedList[0].timeStamp.getTime();
	}
}
