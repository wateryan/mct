package gov.nasa.arc.mct.fastplot.settings;

import gov.nasa.arc.mct.fastplot.bridge.PlotConstants.AxisOrientationSetting;
import gov.nasa.arc.mct.fastplot.bridge.PlotConstants.NonTimeAxisSubsequentBoundsSetting;
import gov.nasa.arc.mct.fastplot.bridge.PlotConstants.PlotLineConnectionType;
import gov.nasa.arc.mct.fastplot.bridge.PlotConstants.PlotLineDrawingFlags;
import gov.nasa.arc.mct.fastplot.bridge.PlotConstants.TimeAxisSubsequentBoundsSetting;
import gov.nasa.arc.mct.fastplot.bridge.PlotConstants.XAxisMaximumLocationSetting;
import gov.nasa.arc.mct.fastplot.bridge.PlotConstants.YAxisMaximumLocationSetting;

public abstract class PlotConfigurationDelegator implements PlotConfiguration {
	private PlotConfiguration delegate;
	
	public PlotConfigurationDelegator(PlotConfiguration delegate) {
		this.setDelegate(delegate);
	}

	/**
	 * @param timeAxisSetting
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#setAxisOrientationSetting(gov.nasa.arc.mct.fastplot.bridge.PlotConstants.AxisOrientationSetting)
	 */
	public void setAxisOrientationSetting(AxisOrientationSetting timeAxisSetting) {
		getDelegate().setAxisOrientationSetting(timeAxisSetting);
	}

	/**
	 * @return
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#getAxisOrientationSetting()
	 */
	public AxisOrientationSetting getAxisOrientationSetting() {
		return getDelegate().getAxisOrientationSetting();
	}

	/**
	 * @param timeSystemSetting
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#setTimeSystemSetting(java.lang.String)
	 */
	public void setTimeSystemSetting(String timeSystemSetting) {
		getDelegate().setTimeSystemSetting(timeSystemSetting);
	}

	/**
	 * @return
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#getTimeSystemSetting()
	 */
	public String getTimeSystemSetting() {
		return getDelegate().getTimeSystemSetting();
	}

	/**
	 * @param timeFormatSetting
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#setTimeFormatSetting(java.lang.String)
	 */
	public void setTimeFormatSetting(String timeFormatSetting) {
		getDelegate().setTimeFormatSetting(timeFormatSetting);
	}

	/**
	 * @return
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#getTimeFormatSetting()
	 */
	public String getTimeFormatSetting() {
		return getDelegate().getTimeFormatSetting();
	}

	/**
	 * @param xAxisMaximumLocation
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#setXAxisMaximumLocation(gov.nasa.arc.mct.fastplot.bridge.PlotConstants.XAxisMaximumLocationSetting)
	 */
	public void setXAxisMaximumLocation(
			XAxisMaximumLocationSetting xAxisMaximumLocation) {
		getDelegate().setXAxisMaximumLocation(xAxisMaximumLocation);
	}

	/**
	 * @return
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#getXAxisMaximumLocation()
	 */
	public XAxisMaximumLocationSetting getXAxisMaximumLocation() {
		return getDelegate().getXAxisMaximumLocation();
	}

	/**
	 * @param yAxisMaximumLocation
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#setYAxisMaximumLocation(gov.nasa.arc.mct.fastplot.bridge.PlotConstants.YAxisMaximumLocationSetting)
	 */
	public void setYAxisMaximumLocation(
			YAxisMaximumLocationSetting yAxisMaximumLocation) {
		getDelegate().setYAxisMaximumLocation(yAxisMaximumLocation);
	}

	/**
	 * @return
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#getYAxisMaximumLocation()
	 */
	public YAxisMaximumLocationSetting getYAxisMaximumLocation() {
		return getDelegate().getYAxisMaximumLocation();
	}

	/**
	 * @param timeAxisSubsequent
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#setTimeAxisSubsequentSetting(gov.nasa.arc.mct.fastplot.bridge.PlotConstants.TimeAxisSubsequentBoundsSetting)
	 */
	public void setTimeAxisSubsequentSetting(
			TimeAxisSubsequentBoundsSetting timeAxisSubsequent) {
		getDelegate().setTimeAxisSubsequentSetting(timeAxisSubsequent);
	}

	/**
	 * @return
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#getTimeAxisSubsequentSetting()
	 */
	public TimeAxisSubsequentBoundsSetting getTimeAxisSubsequentSetting() {
		return getDelegate().getTimeAxisSubsequentSetting();
	}

	/**
	 * @param nonTimeAxisSubsequentMinSetting
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#setNonTimeAxisSubsequentMinSetting(gov.nasa.arc.mct.fastplot.bridge.PlotConstants.NonTimeAxisSubsequentBoundsSetting)
	 */
	public void setNonTimeAxisSubsequentMinSetting(
			NonTimeAxisSubsequentBoundsSetting nonTimeAxisSubsequentMinSetting) {
		getDelegate().setNonTimeAxisSubsequentMinSetting(nonTimeAxisSubsequentMinSetting);
	}

	/**
	 * @return
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#getNonTimeAxisSubsequentMinSetting()
	 */
	public NonTimeAxisSubsequentBoundsSetting getNonTimeAxisSubsequentMinSetting() {
		return getDelegate().getNonTimeAxisSubsequentMinSetting();
	}

	/**
	 * @param nonTimeAxisSubsequentMaxSetting
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#setNonTimeAxisSubsequentMaxSetting(gov.nasa.arc.mct.fastplot.bridge.PlotConstants.NonTimeAxisSubsequentBoundsSetting)
	 */
	public void setNonTimeAxisSubsequentMaxSetting(
			NonTimeAxisSubsequentBoundsSetting nonTimeAxisSubsequentMaxSetting) {
		getDelegate().setNonTimeAxisSubsequentMaxSetting(nonTimeAxisSubsequentMaxSetting);
	}

	/**
	 * @return
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#getNonTimeAxisSubsequentMaxSetting()
	 */
	public NonTimeAxisSubsequentBoundsSetting getNonTimeAxisSubsequentMaxSetting() {
		return getDelegate().getNonTimeAxisSubsequentMaxSetting();
	}

	/**
	 * @param maxTime
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#setMaxTime(long)
	 */
	public void setMaxTime(long maxTime) {
		getDelegate().setMaxTime(maxTime);
	}

	/**
	 * @return
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#getMaxTime()
	 */
	public long getMaxTime() {
		return getDelegate().getMaxTime();
	}

	/**
	 * @param minTime
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#setMinTime(long)
	 */
	public void setMinTime(long minTime) {
		getDelegate().setMinTime(minTime);
	}

	/**
	 * @return
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#getMinTime()
	 */
	public long getMinTime() {
		return getDelegate().getMinTime();
	}

	/**
	 * @param maxNonTime
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#setMaxNonTime(double)
	 */
	public void setMaxNonTime(double maxNonTime) {
		getDelegate().setMaxNonTime(maxNonTime);
	}

	/**
	 * @return
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#getMaxNonTime()
	 */
	public double getMaxNonTime() {
		return getDelegate().getMaxNonTime();
	}

	/**
	 * @param minNonTime
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#setMinNonTime(double)
	 */
	public void setMinNonTime(double minNonTime) {
		getDelegate().setMinNonTime(minNonTime);
	}

	/**
	 * @return
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#getMinNonTime()
	 */
	public double getMinNonTime() {
		return getDelegate().getMinNonTime();
	}

	/**
	 * @param timePadding
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#setTimePadding(double)
	 */
	public void setTimePadding(double timePadding) {
		getDelegate().setTimePadding(timePadding);
	}

	/**
	 * @return
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#getTimePadding()
	 */
	public double getTimePadding() {
		return getDelegate().getTimePadding();
	}

	/**
	 * @param nonTimeMaxPadding
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#setNonTimeMaxPadding(double)
	 */
	public void setNonTimeMaxPadding(double nonTimeMaxPadding) {
		getDelegate().setNonTimeMaxPadding(nonTimeMaxPadding);
	}

	/**
	 * @return
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#getNonTimeMaxPadding()
	 */
	public double getNonTimeMaxPadding() {
		return getDelegate().getNonTimeMaxPadding();
	}

	/**
	 * @param nonTimeMinPadding
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#setNonTimeMinPadding(double)
	 */
	public void setNonTimeMinPadding(double nonTimeMinPadding) {
		getDelegate().setNonTimeMinPadding(nonTimeMinPadding);
	}

	/**
	 * @return
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#getNonTimeMinPadding()
	 */
	public double getNonTimeMinPadding() {
		return getDelegate().getNonTimeMinPadding();
	}

	/**
	 * @return
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#getMinDependent()
	 */
	public double getMinDependent() {
		return delegate.getMinDependent();
	}

	/**
	 * @param min
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#setMinDependent(double)
	 */
	public void setMinDependent(double min) {
		delegate.setMinDependent(min);
	}

	/**
	 * @return
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#getMaxDependent()
	 */
	public double getMaxDependent() {
		return delegate.getMaxDependent();
	}

	/**
	 * @param max
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#setMaxDependent(double)
	 */
	public void setMaxDependent(double max) {
		delegate.setMaxDependent(max);
	}

	/**
	 * @param ordinalPositionForStackedPlots
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#setOrdinalPositionForStackedPlots(boolean)
	 */
	public void setOrdinalPositionForStackedPlots(
			boolean ordinalPositionForStackedPlots) {
		getDelegate().setOrdinalPositionForStackedPlots(ordinalPositionForStackedPlots);
	}

	/**
	 * @return
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#getOrdinalPositionForStackedPlots()
	 */
	public boolean getOrdinalPositionForStackedPlots() {
		return getDelegate().getOrdinalPositionForStackedPlots();
	}

	/**
	 * @param pinTimeAxis
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#setPinTimeAxis(boolean)
	 */
	public void setPinTimeAxis(boolean pinTimeAxis) {
		getDelegate().setPinTimeAxis(pinTimeAxis);
	}

	/**
	 * @return
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#getPinTimeAxis()
	 */
	public boolean getPinTimeAxis() {
		return getDelegate().getPinTimeAxis();
	}

	/**
	 * @param plotLineDraw
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#setPlotLineDraw(gov.nasa.arc.mct.fastplot.bridge.PlotConstants.PlotLineDrawingFlags)
	 */
	public void setPlotLineDraw(PlotLineDrawingFlags plotLineDraw) {
		getDelegate().setPlotLineDraw(plotLineDraw);
	}

	/**
	 * @return
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#getPlotLineDraw()
	 */
	public PlotLineDrawingFlags getPlotLineDraw() {
		return getDelegate().getPlotLineDraw();
	}

	/**
	 * @param plotLineConnectionType
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#setPlotLineConnectionType(gov.nasa.arc.mct.fastplot.bridge.PlotConstants.PlotLineConnectionType)
	 */
	public void setPlotLineConnectionType(
			PlotLineConnectionType plotLineConnectionType) {
		getDelegate().setPlotLineConnectionType(plotLineConnectionType);
	}

	/**
	 * @return
	 * @see gov.nasa.arc.mct.fastplot.settings.PlotConfiguration#getPlotLineConnectionType()
	 */
	public PlotLineConnectionType getPlotLineConnectionType() {
		return getDelegate().getPlotLineConnectionType();
	}

	public void setDelegate(PlotConfiguration delegate) {
		this.delegate = delegate;
	}

	public PlotConfiguration getDelegate() {
		return delegate;
	}
	
	

}
