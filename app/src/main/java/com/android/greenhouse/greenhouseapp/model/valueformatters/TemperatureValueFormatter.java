package com.android.greenhouse.greenhouseapp.model.valueformatters;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;

/**
 * Created by antoinepelletier on 06/07/2017.
 */

public class TemperatureValueFormatter implements IAxisValueFormatter {
	/**
	 * Called when a value from an axis is to be formatted
	 * before being drawn. For performance reasons, avoid excessive calculations
	 * and memory allocations inside this method.
	 *
	 * @param value the value to be formatted
	 * @param axis  the axis the value belongs to
	 * @return
	 */
	@Override
	public String getFormattedValue(float value, AxisBase axis) {
		return String.valueOf(value) + "°C";
	}
}
