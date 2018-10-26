package com.MrBrain.ActivationFunctions;

public class SigmoidActivationFunction implements ActivationFunction
{
	private double slope = 1d;

	public SigmoidActivationFunction(double slope)
	{
		this.slope = slope;
	}

	@Override
	public double calculateOutput(double summedInput)
	{
		double denominator = 1 + Math.exp(-slope * summedInput);

		return (1d/denominator);
	}
}
